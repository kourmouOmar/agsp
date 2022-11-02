/*
 * Be careful, do not modify this class, it is generated automatically.
 */
package com.kmv.agsp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.kmv.agsp.entities.RoleMenusPermissionsEntity;

@Repository
public interface IRoleMenusPermissionsRepository extends JpaRepository<RoleMenusPermissionsEntity, Long> {
	
	/**
	 * get RoleMenusPermissions by id
	 * */
	@Query("SELECT a FROM VilleEntity a WHERE a.id = :id")
	RoleMenusPermissionsEntity getRoleMenusPermissionsBydId(@Param("id") Long id);
}