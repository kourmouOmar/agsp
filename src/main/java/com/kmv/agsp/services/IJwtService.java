package com.kmv.agsp.services;

import java.util.Set;

import org.springframework.security.core.GrantedAuthority;

import com.kmv.agsp.controllers.dto.AgspUtilisateurDto;
import com.kmv.agsp.entities.UtilisateurEntity;

/**
 * interface "IJwtService"
 * 
 * @author Omar_kourmou
 * @see kourmou.omar@gmail.com
 * @creation 05-12-2020
 * @version 1.0
 */
public interface IJwtService {

	/**
	 * find User by username
	 * 
	 * @param username
	 * @return
	 */
	UtilisateurEntity getUserByUsername(String username);



	/**
	 * Construct login response
	 * 
	 * @param user
	 * @param username
	 * @param authorities
	 * @return
	 */
	AgspUtilisateurDto constructResponse(UtilisateurEntity user, String username,
			String roles);

	/**
	 * construct user authorities
	 * 
	 * @param authorities
	 * @return
	 */
	Set<GrantedAuthority> constructGrantedAuthorities(Set<String> authorities);
}
