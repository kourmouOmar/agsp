/*
 * Be careful, do not modify this class, it is generated automatically.
 */
package com.kmv.agsp.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kmv.agsp.controllers.dto.UtilisateurRolesDto;
import com.kmv.agsp.entities.UtilisateurRolesEntity;
import com.kmv.agsp.repository.IUtilisateurRolesRepository;
import com.kmv.agsp.services.IUtilisateurRolesService;

/**
 * Spring serviceImpl "UtilisateurRoles"
 * 
 * @author : illass elbarhoumi
 * @creation : 08/11/20
 * @version : 1.0
 */

@Service
public class UtilisateurRolesService implements IUtilisateurRolesService {
	
	@Autowired
	IUtilisateurRolesRepository utilisateurrolesRespository;
	
	@Override
	public UtilisateurRolesEntity getUtilisateurRolesById(Long idUtilisateurRoles) {
		return utilisateurrolesRespository.getUtilisateurRolesBydId(idUtilisateurRoles);
	}

	@Override
	public List<UtilisateurRolesEntity> getAllUtilisateurRoless() {
		/* get all UtilisateurRoles*/
		return utilisateurrolesRespository.findAll();
	}

	@Override
	public UtilisateurRolesEntity addUtilisateurRoles(UtilisateurRolesDto utilisateurrolesDto) {
		/* add UtilisateurRoles */
		return utilisateurrolesRespository.save(UtilisateurRolesDto.dtoToEntity(utilisateurrolesDto));
	}

	@Override
	public UtilisateurRolesEntity updateUtilisateurRoles(UtilisateurRolesDto utilisateurrolesDto) {
		/* update UtilisateurRoles*/
		return utilisateurrolesRespository.save(UtilisateurRolesDto.dtoToEntity(utilisateurrolesDto));
	}

	@Override
	public void deleteUtilisateurRoles(Long idUtilisateurRoles) {
		/* delete UtilisateurRoles*/
		utilisateurrolesRespository.deleteById(idUtilisateurRoles);
	}
}