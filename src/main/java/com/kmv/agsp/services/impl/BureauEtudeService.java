package com.kmv.agsp.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kmv.agsp.controllers.dto.BureauEtudeDto;
import com.kmv.agsp.entities.BureauEtudeEntity;
import com.kmv.agsp.repository.IBureauEtudeRepository;
import com.kmv.agsp.services.IBureauEtudeService;

@Service
public class BureauEtudeService implements IBureauEtudeService {
	
	@Autowired
	IBureauEtudeRepository bureauetudeRespository;
	
	@Override
	public BureauEtudeEntity getBureauEtudeById(Long idBureauEtude) {
		return bureauetudeRespository.getOne(idBureauEtude);
	}

	@Override
	public List<BureauEtudeEntity> getAllBureauEtudes() {
		/* get all BureauEtude*/
		return bureauetudeRespository.findAll();
	}

	@Override
	public BureauEtudeEntity addBureauEtude(BureauEtudeDto bureauetudeDto) {
		/* add BureauEtude */
		return bureauetudeRespository.save(BureauEtudeDto.dtoToEntity(bureauetudeDto));
	}

	@Override
	public BureauEtudeEntity updateBureauEtude(BureauEtudeDto bureauetudeDto) {
		/* update BureauEtude*/
		return bureauetudeRespository.save(BureauEtudeDto.dtoToEntity(bureauetudeDto));
	}

	@Override
	public void deleteBureauEtude(Long idBureauEtude) {
		/* delete BureauEtude*/
		bureauetudeRespository.deleteById(idBureauEtude);
	}
}