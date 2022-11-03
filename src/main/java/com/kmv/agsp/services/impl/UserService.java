/*
 * Be careful, do not modify this class, it is generated automatically.
 */
package com.kmv.agsp.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.kmv.agsp.controllers.dto.UtilisateurDto;
import com.kmv.agsp.entities.UtilisateurEntity;
import com.kmv.agsp.repository.IUtilisateurRepository;
import com.kmv.agsp.services.IUserService;

/**
 * spring service UserService
 * 
 * @author omarkourmou1
 *
 */

@Service
public class UserService implements IUserService {

	@Autowired
	IUtilisateurRepository utilisateurRepository;

	@Autowired
	BCryptPasswordEncoder bCryptPasswordEncoder;

	@Override
	public UtilisateurEntity getUserById(Long iduser) {
		return utilisateurRepository.findUtilisateurById(iduser);
	}

	@Override
	public List<UtilisateurEntity> getAllUsers() {
		return utilisateurRepository.findAll();
	}

	@Override
	public UtilisateurEntity addUser(UtilisateurDto userDto) {
		

		String pswd = bCryptPasswordEncoder.encode(userDto.getPassword());
		userDto.setPassword(pswd);
		UtilisateurEntity user = utilisateurRepository.save(UtilisateurDto.dtoToEntity(userDto));
		return user;

	}

	@Override
	public UtilisateurEntity updateUser(UtilisateurDto userDto) {
		
		String pswd = bCryptPasswordEncoder.encode(userDto.getPassword());
		userDto.setPassword(pswd);
		return utilisateurRepository.save(UtilisateurDto.dtoToEntity(userDto));
	}

	@Override
	public void deleteUser(Long iduser) {
		utilisateurRepository.deleteById(iduser);
		;

	}

}