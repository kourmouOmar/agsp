package com.kmv.agsp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kmv.agsp.config.SigaiResponse;
import com.kmv.agsp.controllers.dto.MenusAuthoritiesDto;
import com.kmv.agsp.entities.UtilisateurEntity;
import com.kmv.agsp.services.IJwtService;

@RestController
public class JwtAuthenticationController {

	private static final String HEADERS = "Accept=application/json";

	@Autowired
	private IJwtService jwtService;

	/**
	 * Login and generate token & refresh token token v1
	 * 
	 * @return
	 * @throws Exception
	 */
	@PostMapping(value = "/v1/auth", headers = HEADERS)
	public SigaiResponse login(){
		String username = SecurityContextHolder.getContext().getAuthentication().getName();
		UtilisateurEntity user = null;
		SigaiResponse sigaiResponse = null;

		try {
			user = jwtService.getUserByUsername(username);
		} catch (DataAccessException e) {
			//new SigaiResponse(HttpStatus.INTERNAL_SERVER_ERROR);
			sigaiResponse = new SigaiResponse("pour cette user n'existe pas",HttpStatus.OK);
		}
		if (user == null) {
			sigaiResponse = new SigaiResponse("pour cette user n'existe pas",HttpStatus.OK);
		} else {
			MenusAuthoritiesDto menusAuthoritiesDto = jwtService.getAuthoritiesAndMenus(user);

			sigaiResponse = new SigaiResponse(jwtService.constructResponse(user, username, menusAuthoritiesDto),
					HttpStatus.OK);
		}
		return sigaiResponse;
	}
	
	@GetMapping(value = "/test", headers = HEADERS)
	public SigaiResponse test(){
		
		return new SigaiResponse("pour cette user n'existe pas",HttpStatus.OK);
	}
}
