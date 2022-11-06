/*
 * Be careful, do not modify this class, it is generated automatically.
 */
package com.kmv.agsp.services;

import java.util.List;

import com.kmv.agsp.controllers.dto.UtilisateurDto;
import com.kmv.agsp.entities.UtilisateurEntity;


public interface IUtilisateurService{

    /**
	 * Get Utilisateur by Id
	 * 
	 * @param idUtilisateur
	 * @return UtilisateurEntity
	 */
	UtilisateurEntity getUtilisateurById(Long idUtilisateur);

	/**
	 * get all Utilisateur
	 *
	 * @return List<UtilisateurEntity>
	 */
	List<UtilisateurEntity> getAllUtilisateurs();

	/**
	 * add Utilisateur
	 *
	 * @param UtilisateurDto
	 * @return UtilisateurEntity
	 */
	UtilisateurEntity addUtilisateur(UtilisateurDto UtilisateurDto);

	/**
	 * update Utilisateur
	 *
	 * @param UtilisateurDto
	 * @return UtilisateurEntity
	 */
	UtilisateurEntity updateUtilisateur(UtilisateurDto UtilisateurDto);

	/**
	 * delete Utilisateur
	 *
	 * @param idUtilisateur
	 * @return UtilisateurEntity
	 */
	void deleteUtilisateur(Long idUtilisateur);

}