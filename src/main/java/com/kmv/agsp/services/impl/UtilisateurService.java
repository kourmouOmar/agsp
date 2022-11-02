/*
 * Be careful, do not modify this class, it is generated automatically.
 */
package com.kmv.agsp.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kmv.agsp.controllers.dto.UtilisateurDto;
import com.kmv.agsp.entities.UtilisateurEntity;
import com.kmv.agsp.repository.IUtilisateurRepository;
import com.kmv.agsp.services.IUtilisateurService;

/**
 * Spring serviceImpl "Utilisateur"
 * 
 * @author : illass elbarhoumi
 * @creation : 08/11/20
 * @version : 1.0
 */

@Service
public class UtilisateurService implements IUtilisateurService {

	@Autowired
	IUtilisateurRepository utilisateurRespository;

	@Override
	public Optional<UtilisateurEntity> getUtilisateurById(Long idUtilisateur) {
		return utilisateurRespository.findById(idUtilisateur);
	}

	@Override
	public List<UtilisateurEntity> getAllUtilisateurs() {
		/* get all Utilisateur */
		return utilisateurRespository.findAll();
	}

	@Override
	public UtilisateurEntity addUtilisateur(UtilisateurDto utilisateurDto) {
		/* add Utilisateur */
		return utilisateurRespository.save(UtilisateurDto.dtoToEntity(utilisateurDto));
	}

	@Override
	public UtilisateurEntity updateUtilisateur(UtilisateurDto utilisateurDto) {
		/* update Utilisateur */
		return utilisateurRespository.save(UtilisateurDto.dtoToEntity(utilisateurDto));
	}

	@Override
	public void deleteUtilisateur(Long idUtilisateur) {
		/* delete Utilisateur */
		utilisateurRespository.deleteById(idUtilisateur);
	}
}