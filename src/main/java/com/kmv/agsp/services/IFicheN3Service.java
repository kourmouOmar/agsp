package com.kmv.agsp.services;

import java.util.List;

import com.kmv.agsp.controllers.dto.FicheN3Dto;
import com.kmv.agsp.entities.FicheN3Entity;

public interface IFicheN3Service{

/**
	 * Get FicheN3 by Id
	 * 
	 * @param idFicheN3
	 * @return FicheN3Entity
	 */
	FicheN3Entity getFicheN3ById(Long idFicheN3);

	/**
	 * get all FicheN3
	 *
	 * @return List<FicheN3Entity>
	 */
	List<FicheN3Entity> getAllFicheN3s();

	/**
	 * add FicheN3
	 *
	 * @param FicheN3Dto
	 * @return FicheN3Entity
	 */
	FicheN3Entity addFicheN3(FicheN3Dto FicheN3Dto);

	/**
	 * update FicheN3
	 *
	 * @param FicheN3Dto
	 * @return FicheN3Entity
	 */
	FicheN3Entity updateFicheN3(FicheN3Dto FicheN3Dto);

	/**
	 * delete FicheN3
	 *
	 * @param idFicheN3
	 * @return FicheN3Entity
	 */
	void deleteFicheN3(Long idFicheN3);

}