package com.kmv.agsp.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kmv.agsp.controllers.dto.FicheN3Dto;
import com.kmv.agsp.entities.FicheN3Entity;
import com.kmv.agsp.repository.IFicheN3Repository;
import com.kmv.agsp.services.IFicheN3Service;

@Service
public class FicheN3Service implements IFicheN3Service {
	
	@Autowired
	IFicheN3Repository fichen3Respository;
	
	@Override
	public FicheN3Entity getFicheN3ById(Long idFicheN3) {
		return fichen3Respository.getOne(idFicheN3);
	}

	@Override
	public List<FicheN3Entity> getAllFicheN3s() {
		/* get all FicheN3*/
		return fichen3Respository.findAll();
	}

	@Override
	public FicheN3Entity addFicheN3(FicheN3Dto fichen3Dto) {
		/* add FicheN3 */
		return fichen3Respository.save(FicheN3Dto.dtoToEntity(fichen3Dto));
	}

	@Override
	public FicheN3Entity updateFicheN3(FicheN3Dto fichen3Dto) {
		/* update FicheN3*/
		return fichen3Respository.save(FicheN3Dto.dtoToEntity(fichen3Dto));
	}

	@Override
	public void deleteFicheN3(Long idFicheN3) {
		/* delete FicheN3*/
		fichen3Respository.deleteById(idFicheN3);
	}
}