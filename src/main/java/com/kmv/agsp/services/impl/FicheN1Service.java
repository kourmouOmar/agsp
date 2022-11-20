package com.kmv.agsp.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kmv.agsp.controllers.dto.FicheN1Dto;
import com.kmv.agsp.entities.FicheN1Entity;
import com.kmv.agsp.repository.IFicheN1Repository;
import com.kmv.agsp.services.IFicheN1Service;

@Service
public class FicheN1Service implements IFicheN1Service {
	
	@Autowired
	IFicheN1Repository fichen1Respository;
	
	@Override
	public FicheN1Entity getFicheN1ById(Long idFicheN1) {
		return fichen1Respository.getOne(idFicheN1);
	}

	@Override
	public List<FicheN1Entity> getAllFicheN1s() {
		/* get all FicheN1*/
		return fichen1Respository.findAll();
	}

	@Override
	public FicheN1Entity addFicheN1(FicheN1Dto fichen1Dto) {
		/* add FicheN1 */
		return fichen1Respository.save(FicheN1Dto.dtoToEntity(fichen1Dto));
	}

	@Override
	public FicheN1Entity updateFicheN1(FicheN1Dto fichen1Dto) {
		/* update FicheN1*/
		return fichen1Respository.save(FicheN1Dto.dtoToEntity(fichen1Dto));
	}

	@Override
	public void deleteFicheN1(Long idFicheN1) {
		/* delete FicheN1*/
		fichen1Respository.deleteById(idFicheN1);
	}
}