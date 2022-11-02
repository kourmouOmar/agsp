/*
 * Be careful, do not modify this class, it is generated automatically.
 */
package com.kmv.agsp.services;

import java.util.List;
import java.util.Optional;

import com.kmv.agsp.controllers.dto.UtilisateurDto;
import com.kmv.agsp.entities.UtilisateurEntity;

/**
 * Spring service "Utilisateur"
 * 
 * @author : illass elbarhoumi
 * @creation : 08/11/20
 * @version : 1.0
 */
public interface IUtilisateurService{

/**
	 * Get Utilisateur by Id
	 * 
	 * @param idUtilisateur
	 * @return UtilisateurEntity
	 */
	Optional<UtilisateurEntity> getUtilisateurById(Long idUtilisateur);

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