package com.kmv.agsp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.kmv.agsp.entities.ProjetEntity;

@Repository
public interface IProjetRepository extends JpaRepository<ProjetEntity, Long> {
	
	/**
	 * get Projet by id
	 * */
	@Query("SELECT a FROM ProjetEntity a WHERE a.id = :id")
	ProjetEntity getProjetBydId(@Param("id") Long id);
}