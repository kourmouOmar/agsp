package com.kmv.agsp.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kmv.agsp.controllers.dto.FicheN2Dto;
import com.kmv.agsp.entities.FicheN2Entity;
import com.kmv.agsp.repository.IFicheN2Repository;
import com.kmv.agsp.services.IFicheN2Service;

@Service
public class FicheN2Service implements IFicheN2Service {
	
	@Autowired
	IFicheN2Repository fichen2Respository;
	
	@Override
	public FicheN2Entity getFicheN2ById(Long idFicheN2) {
		return fichen2Respository.getOne(idFicheN2);
	}

	@Override
	public List<FicheN2Entity> getAllFicheN2s() {
		/* get all FicheN2*/
		return fichen2Respository.findAll();
	}

	@Override
	public FicheN2Entity addFicheN2(FicheN2Dto fichen2Dto) {
		/* add FicheN2 */
		return fichen2Respository.save(FicheN2Dto.dtoToEntity(fichen2Dto));
	}

	@Override
	public FicheN2Entity updateFicheN2(FicheN2Dto fichen2Dto) {
		/* update FicheN2*/
		return fichen2Respository.save(FicheN2Dto.dtoToEntity(fichen2Dto));
	}

	@Override
	public void deleteFicheN2(Long idFicheN2) {
		/* delete FicheN2*/
		fichen2Respository.deleteById(idFicheN2);
	}
}