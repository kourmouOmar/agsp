package com.kmv.agsp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kmv.agsp.entities.BureauControleEntity;

@Repository
public interface IBureauControleRepository extends JpaRepository<BureauControleEntity, Long> {
	
	
}