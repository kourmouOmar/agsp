package com.kmv.agsp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.kmv.agsp.entities.ClientEntity;

@Repository
public interface IClientRepository extends JpaRepository<ClientEntity, Long> {
	
	/**
	 * get Client by id
	 * */
	@Query("SELECT a FROM ClientEntity a WHERE a.id = :id")
	ClientEntity getClientBydId(@Param("id") Long id);
}