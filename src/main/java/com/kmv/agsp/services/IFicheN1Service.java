package com.kmv.agsp.services;

import java.util.List;

import com.kmv.agsp.controllers.dto.FicheN1Dto;
import com.kmv.agsp.entities.FicheN1Entity;

public interface IFicheN1Service{

/**
	 * Get FicheN1 by Id
	 * 
	 * @param idFicheN1
	 * @return FicheN1Entity
	 */
	FicheN1Entity getFicheN1ById(Long idFicheN1);

	/**
	 * get all FicheN1
	 *
	 * @return List<FicheN1Entity>
	 */
	List<FicheN1Entity> getAllFicheN1s();

	/**
	 * add FicheN1
	 *
	 * @param FicheN1Dto
	 * @return FicheN1Entity
	 */
	FicheN1Entity addFicheN1(FicheN1Dto FicheN1Dto);

	/**
	 * update FicheN1
	 *
	 * @param FicheN1Dto
	 * @return FicheN1Entity
	 */
	FicheN1Entity updateFicheN1(FicheN1Dto FicheN1Dto);

	/**
	 * delete FicheN1
	 *
	 * @param idFicheN1
	 * @return FicheN1Entity
	 */
	void deleteFicheN1(Long idFicheN1);

}