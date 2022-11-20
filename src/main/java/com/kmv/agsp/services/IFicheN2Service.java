package com.kmv.agsp.services;

import java.util.List;

import com.kmv.agsp.controllers.dto.FicheN2Dto;
import com.kmv.agsp.entities.FicheN2Entity;

public interface IFicheN2Service{

/**
	 * Get FicheN2 by Id
	 * 
	 * @param idFicheN2
	 * @return FicheN2Entity
	 */
	FicheN2Entity getFicheN2ById(Long idFicheN2);

	/**
	 * get all FicheN2
	 *
	 * @return List<FicheN2Entity>
	 */
	List<FicheN2Entity> getAllFicheN2s();

	/**
	 * add FicheN2
	 *
	 * @param FicheN2Dto
	 * @return FicheN2Entity
	 */
	FicheN2Entity addFicheN2(FicheN2Dto FicheN2Dto);

	/**
	 * update FicheN2
	 *
	 * @param FicheN2Dto
	 * @return FicheN2Entity
	 */
	FicheN2Entity updateFicheN2(FicheN2Dto FicheN2Dto);

	/**
	 * delete FicheN2
	 *
	 * @param idFicheN2
	 * @return FicheN2Entity
	 */
	void deleteFicheN2(Long idFicheN2);

}