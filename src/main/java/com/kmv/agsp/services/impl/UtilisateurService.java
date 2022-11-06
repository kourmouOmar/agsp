/*
 * Be careful, do not modify this class, it is generated automatically.
 */
package com.kmv.agsp.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.kmv.agsp.controllers.dto.UtilisateurDto;
import com.kmv.agsp.entities.UtilisateurEntity;
import com.kmv.agsp.repository.IUtilisateurRepository;
import com.kmv.agsp.services.IUtilisateurService;


@Service
public class UtilisateurService implements IUtilisateurService {

	@Autowired
	IUtilisateurRepository utilisateurRespository;
	
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	@Override
	public UtilisateurEntity getUtilisateurById(Long idUtilisateur) {
		if(utilisateurRespository.findById(idUtilisateur).isPresent()) {
			 return utilisateurRespository.findById(idUtilisateur).get();
		}
		return null;
	}

	@Override
	public List<UtilisateurEntity> getAllUtilisateurs() {
		/* get all Utilisateur */
		return utilisateurRespository.findAll();
	}

	@Override
	public UtilisateurEntity addUtilisateur(UtilisateurDto utilisateurDto) {
		utilisateurDto.setPassword(bCryptPasswordEncoder.encode("password"));
		/* add Utilisateur */
		return utilisateurRespository.save(UtilisateurDto.dtoToEntity(utilisateurDto));
	}

	@Override
	public UtilisateurEntity updateUtilisateur(UtilisateurDto utilisateurDto) {
		utilisateurDto.setPassword(bCryptPasswordEncoder.encode("password"));
		/* update Utilisateur */
		return utilisateurRespository.save(UtilisateurDto.dtoToEntity(utilisateurDto));
	}

	@Override
	public void deleteUtilisateur(Long idUtilisateur) {
		/* delete Utilisateur */
		utilisateurRespository.deleteById(idUtilisateur);
	}
}