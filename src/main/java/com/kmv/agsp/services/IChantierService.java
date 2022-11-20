package com.kmv.agsp.services;

import java.util.List;

import com.kmv.agsp.controllers.dto.ChantierDto;
import com.kmv.agsp.entities.ChantierEntity;

public interface IChantierService{

    /**
	 * Get Chantier by Id
	 * 
	 * @param idChantier
	 * @return ChantierEntity
	 */
	ChantierEntity getChantierById(Long idChantier);

	/**
	 * get all Chantier
	 *
	 * @return List<ChantierEntity>
	 */
	List<ChantierEntity> getAllChantiers();

	/**
	 * add Chantier
	 *
	 * @param ChantierDto
	 * @return ChantierEntity
	 */
	ChantierEntity addChantier(ChantierDto ChantierDto);

	/**
	 * update Chantier
	 *
	 * @param ChantierDto
	 * @return ChantierEntity
	 */
	ChantierEntity updateChantier(ChantierDto ChantierDto);

	/**
	 * delete Chantier
	 *
	 * @param idChantier
	 * @return ChantierEntity
	 */
	void deleteChantier(Long idChantier);

}