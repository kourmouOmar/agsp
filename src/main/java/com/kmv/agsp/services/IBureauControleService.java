package com.kmv.agsp.services;

import java.util.List;

import com.kmv.agsp.controllers.dto.BureauControleDto;
import com.kmv.agsp.entities.BureauControleEntity;

public interface IBureauControleService{

/**
	 * Get BureauControle by Id
	 * 
	 * @param idBureauControle
	 * @return BureauControleEntity
	 */
	BureauControleEntity getBureauControleById(Long idBureauControle);

	/**
	 * get all BureauControle
	 *
	 * @return List<BureauControleEntity>
	 */
	List<BureauControleEntity> getAllBureauControles();

	/**
	 * add BureauControle
	 *
	 * @param BureauControleDto
	 * @return BureauControleEntity
	 */
	BureauControleEntity addBureauControle(BureauControleDto BureauControleDto);

	/**
	 * update BureauControle
	 *
	 * @param BureauControleDto
	 * @return BureauControleEntity
	 */
	BureauControleEntity updateBureauControle(BureauControleDto BureauControleDto);

	/**
	 * delete BureauControle
	 *
	 * @param idBureauControle
	 * @return BureauControleEntity
	 */
	void deleteBureauControle(Long idBureauControle);

}