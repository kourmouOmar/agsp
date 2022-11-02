/*
@Column(name = "description", length = 255)
	private String description; * Be careful, do not modify this class, it is generated automatically.
 */
package com.kmv.agsp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kmv.agsp.entities.ContactEntity;

@Repository
public interface IContactRepository extends JpaRepository<ContactEntity, Long> {

}