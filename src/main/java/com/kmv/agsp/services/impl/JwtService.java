package com.kmv.agsp.services.impl;

import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Service;

import com.kmv.agsp.config.TokenProvider;
import com.kmv.agsp.controllers.dto.AgspUtilisateurDto;
import com.kmv.agsp.controllers.dto.JwtResponseDto;
import com.kmv.agsp.entities.UtilisateurEntity;
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
	public AgspUtilisateurDto constructResponse(UtilisateurEntity user, String username,
			String roles) {
		AgspUtilisateurDto sigaiUtilisateurDto;

		try {
			/* construct full name */
			StringBuilder fullName = new StringBuilder(user.getPrenom()).append(" ").append(user.getNom());

			/* current date for token creation */
			Date now = new Date();
			
			/* Token generation */
			String token = tokenProvider.createToken(username,  null, now);

			/* finally we construct the response */
			JwtResponseDto response = new JwtResponseDto();
			response.setHeader(tokenProvider.getHeader());
			response.setToken(tokenProvider.getPrefix() + token);
			//response.setRole(user.getRole());
			response.setExpires(Functions.formatDate(tokenProvider.getExpirationTime(now), DATE_FORMAT));
			//response.setMenus(menusAuthoritiesDto.getMenus());
			response.setRole(user.getRoles());
			sigaiUtilisateurDto = new AgspUtilisateurDto(username, fullName.toString(), response);

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


}
