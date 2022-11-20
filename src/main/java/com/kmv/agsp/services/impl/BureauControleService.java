package com.kmv.agsp.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kmv.agsp.controllers.dto.BureauControleDto;
import com.kmv.agsp.entities.BureauControleEntity;
import com.kmv.agsp.repository.IBureauControleRepository;
import com.kmv.agsp.services.IBureauControleService;

@Service
public class BureauControleService implements IBureauControleService {
	
	@Autowired
	IBureauControleRepository bureaucontroleRespository;
	
	@Override
	public BureauControleEntity getBureauControleById(Long idBureauControle) {
		return bureaucontroleRespository.getOne(idBureauControle);
	}

	@Override
	public List<BureauControleEntity> getAllBureauControles() {
		/* get all BureauControle*/
		return bureaucontroleRespository.findAll();
	}

	@Override
	public BureauControleEntity addBureauControle(BureauControleDto bureaucontroleDto) {
		/* add BureauControle */
		return bureaucontroleRespository.save(BureauControleDto.dtoToEntity(bureaucontroleDto));
	}

	@Override
	public BureauControleEntity updateBureauControle(BureauControleDto bureaucontroleDto) {
		/* update BureauControle*/
		return bureaucontroleRespository.save(BureauControleDto.dtoToEntity(bureaucontroleDto));
	}

	@Override
	public void deleteBureauControle(Long idBureauControle) {
		/* delete BureauControle*/
		bureaucontroleRespository.deleteById(idBureauControle);
	}
}