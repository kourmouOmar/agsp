package com.kmv.agsp.services;


import java.util.List;

import com.kmv.agsp.controllers.dto.ProjetDto;
import com.kmv.agsp.entities.ProjetEntity;

public interface IProjetService{

	/**
	 * Get Projet by Id
	 * 
	 * @param idProjet
	 * @return ProjetEntity
	 */
	ProjetEntity getProjetById(Long idProjet);

	/**
	 * get all Projet
	 *
	 * @return List<ProjetEntity>
	 */
	List<ProjetEntity> getAllProjets();

	/**
	 * add Projet
	 *
	 * @param ProjetDto
	 * @return ProjetEntity
	 */
	ProjetEntity addProjet(ProjetDto ProjetDto);

	/**
	 * update Projet
	 *
	 * @param ProjetDto
	 * @return ProjetEntity
	 */
	ProjetEntity updateProjet(ProjetDto ProjetDto);

	/**
	 * delete Projet
	 *
	 * @param idProjet
	 * @return ProjetEntity
	 */
	void deleteProjet(Long idProjet);

}