package com.kmv.agsp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kmv.agsp.entities.FicheN3Entity;

@Repository
public interface IFicheN3Repository extends JpaRepository<FicheN3Entity, Long> {
	
}