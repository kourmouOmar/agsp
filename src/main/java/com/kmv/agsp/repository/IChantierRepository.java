package com.kmv.agsp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.kmv.agsp.entities.ChantierEntity;

@Repository
public interface IChantierRepository extends JpaRepository<ChantierEntity, Long> {
	
	/**
	 * get Chantier by id
	 * */
	@Query("SELECT a FROM ChantierEntity a WHERE a.id = :id")
	ChantierEntity getChantierBydId(@Param("id") Long id);
}