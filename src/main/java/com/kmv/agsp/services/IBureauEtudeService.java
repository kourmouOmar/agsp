package com.kmv.agsp.services;

import java.util.List;

import com.kmv.agsp.controllers.dto.BureauEtudeDto;
import com.kmv.agsp.entities.BureauEtudeEntity;

public interface IBureauEtudeService{

/**
	 * Get BureauEtude by Id
	 * 
	 * @param idBureauEtude
	 * @return BureauEtudeEntity
	 */
	BureauEtudeEntity getBureauEtudeById(Long idBureauEtude);

	/**
	 * get all BureauEtude
	 *
	 * @return List<BureauEtudeEntity>
	 */
	List<BureauEtudeEntity> getAllBureauEtudes();

	/**
	 * add BureauEtude
	 *
	 * @param BureauEtudeDto
	 * @return BureauEtudeEntity
	 */
	BureauEtudeEntity addBureauEtude(BureauEtudeDto BureauEtudeDto);

	/**
	 * update BureauEtude
	 *
	 * @param BureauEtudeDto
	 * @return BureauEtudeEntity
	 */
	BureauEtudeEntity updateBureauEtude(BureauEtudeDto BureauEtudeDto);

	/**
	 * delete BureauEtude
	 *
	 * @param idBureauEtude
	 * @return BureauEtudeEntity
	 */
	void deleteBureauEtude(Long idBureauEtude);

}