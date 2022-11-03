package com.kmv.agsp.services.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kmv.agsp.controllers.dto.ProjetDto;
import com.kmv.agsp.entities.ProjetEntity;
import com.kmv.agsp.repository.IProjetRepository;
import com.kmv.agsp.services.IProjetService;

@Service
public class ProjetService implements IProjetService {
	
	@Autowired
	IProjetRepository projetRespository;
	
	@Override
	public ProjetEntity getProjetById(Long idProjet) {
		return projetRespository.getProjetBydId(idProjet);
	}

	@Override
	public List<ProjetEntity> getAllProjets() {
		/* get all Projet*/
		return projetRespository.findAll();
	}

	@Override
	public ProjetEntity addProjet(ProjetDto projetDto) {
		/* add Projet */
		return projetRespository.save(ProjetDto.dtoToEntity(projetDto));
	}

	@Override
	public ProjetEntity updateProjet(ProjetDto projetDto) {
		/* update Projet*/
		return projetRespository.save(ProjetDto.dtoToEntity(projetDto));
	}

	@Override
	public void deleteProjet(Long idProjet) {
		/* delete Projet*/
		projetRespository.deleteById(idProjet);
	}
}