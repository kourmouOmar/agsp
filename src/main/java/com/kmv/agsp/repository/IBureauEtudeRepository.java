package com.kmv.agsp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kmv.agsp.entities.BureauEtudeEntity;

@Repository
public interface IBureauEtudeRepository extends JpaRepository<BureauEtudeEntity, Long> {

}