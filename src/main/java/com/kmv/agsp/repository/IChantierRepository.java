package com.kmv.agsp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kmv.agsp.entities.ChantierEntity;

@Repository
public interface IChantierRepository extends JpaRepository<ChantierEntity, Long> {

}