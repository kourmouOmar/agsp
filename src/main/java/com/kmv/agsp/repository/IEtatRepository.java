/*
@Column(name = "description", length = 255)
	private String description; * Be careful, do not modify this class, it is generated automatically.
 */
package com.kmv.agsp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.kmv.agsp.entities.EtatEntity;

@Repository
public interface IEtatRepository extends JpaRepository<EtatEntity, Long> {
	
	/**
	 * get Etat by id
	 * */
	@Query("SELECT a FROM VilleEntity a WHERE a.id = :id")
	EtatEntity getEtatBydId(@Param("id") Long id);
}