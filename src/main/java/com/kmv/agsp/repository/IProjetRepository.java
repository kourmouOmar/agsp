package com.kmv.agsp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kmv.agsp.entities.ProjetEntity;

@Repository
public interface IProjetRepository extends JpaRepository<ProjetEntity, Long> {

}