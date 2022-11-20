package com.kmv.agsp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kmv.agsp.entities.FicheN1Entity;

@Repository
public interface IFicheN1Repository extends JpaRepository<FicheN1Entity, Long> {
	

}