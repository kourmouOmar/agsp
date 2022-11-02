package com.kmv.agsp.services.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.kmv.agsp.config.TokenProvider;
import com.kmv.agsp.controllers.dto.JwtResponseDto;
import com.kmv.agsp.controllers.dto.MenuDto;
import com.kmv.agsp.controllers.dto.MenusAuthoritiesDto;
import com.kmv.agsp.controllers.dto.SigaiUtilisateurDto;
import com.kmv.agsp.entities.MenuEntity;
import com.kmv.agsp.entities.RolePermissionsEntity;
import com.kmv.agsp.entities.UtilisateurEntity;
import com.kmv.agsp.repository.IMenuRepository;
import com.kmv.agsp.repository.IRolePermissionsRepository;
import com.kmv.agsp.repository.IUtilisateurRepository;
import com.kmv.agsp.services.IJwtService;
import com.kmv.agsp.util.Functions;

/**
 * Spring serviceImpl "JwtService"
 * 
 * @author : kourmouOmar
 * @creation : 05/12/20
 * @version : 1.0
 */
@Service
public class JwtService implements IJwtService {

	private static final String DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ss'Z'";

	@Autowired
	private IUtilisateurRepository utilisateurRepository;

	@Autowired
	private IRolePermissionsRepository rolePermissionsRepository;

	@Autowired
	private IMenuRepository menuRepository;

	@Autowired
	private TokenProvider tokenProvider;

	@Override
	public UtilisateurEntity getUserByUsername(String username) {
		UtilisateurEntity userEntity = new UtilisateurEntity();
		try {
			userEntity = utilisateurRepository.findUtilisateurByUsername(username);

		} catch (Exception e) {
			throw e;
		}
		return userEntity;
	}

	@Override
	public MenusAuthoritiesDto getAuthoritiesAndMenus(UtilisateurEntity user) {

		Set<MenuDto> listMenuDtos;		Set<String> authorities = new LinkedHashSet<>();
		Set<MenuEntity> childs = new LinkedHashSet<>();
		Set<MenuEntity> parents = new LinkedHashSet<>();
		MenusAuthoritiesDto menusAuthoritiesDto = new MenusAuthoritiesDto();
		
		List<String> agentSaisirMenu = new ArrayList<>();
		
        /* user consiel immobile */
		List<String> consiellerMenu = new ArrayList<>();
		consiellerMenu.add("Bien");
		consiellerMenu.add("Location");
		consiellerMenu.add("Vente");
		consiellerMenu.add("Tâches/Notes");
		consiellerMenu.add("Contact");
		
		agentSaisirMenu.add("Bien");
		/*agentSaisirMenu.add("Location");
		agentSaisirMenu.add("Tâches/Notes");
		agentSaisirMenu.add("Contact");
		agentSaisirMenu.add("Propriétaire");
		agentSaisirMenu.add("Locataire");*/
		/*
		 * get permmissions and menus
		 */
		try {

			user.getListOfUtilisateurRoles().forEach(r -> {
				/* get role */
				List<RolePermissionsEntity> rolePermissions = rolePermissionsRepository
						.getRolePermissionByRole(r.getRoleEntity().getIdRole());
				rolePermissions.forEach(rolePer -> authorities.add(rolePer.getPermission().getLibelle()));
			});
			
			List<MenuEntity> p =menuRepository.findAll();
			p.forEach(rmp -> {
				if (rmp != null && rmp.getParentMenu() == null && rmp.getModule().getActive().equals(true)) {
					
					parents.add(rmp);
					
				} else if (rmp != null && rmp.getParentMenu() != null && rmp.getModule().getActive().equals(true)) {
					childs.add(rmp);
					parents.add(rmp.getParentMenu());
				}
			});
			
		} catch (Exception e) {
		
		}

		/* get menus and its parents */
		listMenuDtos = getUserMenus(parents, childs);
		
		menusAuthoritiesDto.setAuthorities(constructGrantedAuthorities(authorities));
		menusAuthoritiesDto.setMenus(listMenuDtos);
		

		return menusAuthoritiesDto;
	}

	@Override
	public SigaiUtilisateurDto constructResponse(UtilisateurEntity user, String username,
			MenusAuthoritiesDto menusAuthoritiesDto) {
		SigaiUtilisateurDto sigaiUtilisateurDto;

		try {
			/* construct full name */
			StringBuilder fullName = new StringBuilder(user.getPrenom()).append(" ").append(user.getNom());

			/* current date for token creation */
			Date now = new Date();

			/* Token generation */
			String token = tokenProvider.createToken(username, menusAuthoritiesDto.getAuthorities(), now);

			/* finally we construct the response */
			JwtResponseDto response = new JwtResponseDto();
			response.setHeader(tokenProvider.getHeader());
			response.setToken(tokenProvider.getPrefix() + token);
			//response.setRole(user.getRole());
			response.setExpires(Functions.formatDate(tokenProvider.getExpirationTime(now), DATE_FORMAT));
			response.setMenus(menusAuthoritiesDto.getMenus());

			sigaiUtilisateurDto = new SigaiUtilisateurDto(username, fullName.toString(), response);

		} catch (Exception e) {
			throw e;
		}

		return sigaiUtilisateurDto;
	}

	@Override
	public Set<GrantedAuthority> constructGrantedAuthorities(Set<String> authorities) {
		Set<GrantedAuthority> grantedAuthorities = new LinkedHashSet<>();
		try {
			if (authorities != null && Boolean.FALSE.equals(authorities.isEmpty())) {
				authorities.forEach(v -> grantedAuthorities.add(new SimpleGrantedAuthority(v)));
			}
		} catch (Exception e) {
			throw e;
		}

		return grantedAuthorities;
	}

	private Set<MenuDto> getUserMenus(Set<MenuEntity> parents, Set<MenuEntity> childs) {
		Set<MenuDto> menuEntities = new LinkedHashSet<>();
		if (!CollectionUtils.isEmpty(parents) && !CollectionUtils.isEmpty(childs)) {
			/* loop through parent menus */

			for (MenuEntity menuParent : parents) {
	
				if (menuParent.getModule().getActive().equals(true)) {
					for (MenuEntity menuChild : childs) {
						if (menuChild.getParentMenu().getIdMenu().equals(menuParent.getIdMenu())
								&& menuChild.getParentMenu().getModule().getActive().equals(true)) {
							
							/*List<MenuEntity> withDupes = Arrays.asList(menuChild);
							List<MenuEntity> withoutDupes = withDupes.stream()
                                    .distinct()
                                    .collect(Collectors.toList());*/
							
							menuParent.getChildMenus().add(menuChild);
							
							
						}
					}

					// menuParent.setChildMenus(childsList);
					menuEntities.add(MenuDto.entityToDto(menuParent));
				}

			}
		}
		return menuEntities;
	}
}
