/*
 * Be careful, do not modify this class, it is generated automatically.
 */
package com.kmv.agsp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.kmv.agsp.entities.ModuleEntity;

@Repository
public interface IModuleRepository extends JpaRepository<ModuleEntity, Long> {
	
	/**
	 * get Module by id
	 * */
	@Query("SELECT a FROM ModuleEntity a WHERE a.id = :id")
	ModuleEntity getModuleBydId(@Param("id") Long id);
}