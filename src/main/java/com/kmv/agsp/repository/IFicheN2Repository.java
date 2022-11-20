package com.kmv.agsp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kmv.agsp.entities.FicheN2Entity;

@Repository
public interface IFicheN2Repository extends JpaRepository<FicheN2Entity, Long> {
	

}