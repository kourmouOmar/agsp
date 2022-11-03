package com.kmv.agsp.services.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kmv.agsp.controllers.dto.ChantierDto;
import com.kmv.agsp.entities.ChantierEntity;
import com.kmv.agsp.repository.IChantierRepository;
import com.kmv.agsp.services.IChantierService;

@Service
public class ChantierService implements IChantierService {
	
	@Autowired
	IChantierRepository chantierRespository;
	
	@Override
	public ChantierEntity getChantierById(Long idChantier) {
		return chantierRespository.getChantierBydId(idChantier);
	}

	@Override
	public List<ChantierEntity> getAllChantiers() {
		/* get all Chantier*/
		return chantierRespository.findAll();
	}

	@Override
	public ChantierEntity addChantier(ChantierDto chantierDto) {
		/* add Chantier */
		return chantierRespository.save(ChantierDto.dtoToEntity(chantierDto));
	}

	@Override
	public ChantierEntity updateChantier(ChantierDto chantierDto) {
		/* update Chantier*/
		return chantierRespository.save(ChantierDto.dtoToEntity(chantierDto));
	}

	@Override
	public void deleteChantier(Long idChantier) {
		/* delete Chantier*/
		chantierRespository.deleteById(idChantier);
	}
}