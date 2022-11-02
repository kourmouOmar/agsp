/*
 * Be careful, do not modify this class, it is generated automatically.
 */
package com.kmv.agsp.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kmv.agsp.controllers.dto.StatiDto;
import com.kmv.agsp.repository.IAcheteurRepository;
import com.kmv.agsp.repository.IBienRepository;
import com.kmv.agsp.repository.ILocationRepository;
import com.kmv.agsp.repository.IProprietaireRepository;
import com.kmv.agsp.repository.IVenteRepository;

/**
 * 
 * @author omarkourmou1
 *
 */
@Service
public class StatistiqueService {

	@Autowired
	IAcheteurRepository acheteurRespository;

	@Autowired
	IBienRepository bienRepository;

	@Autowired
	IProprietaireRepository proprietaireRepository;

	@Autowired
	ILocationRepository locationRepository;

	@Autowired
	IVenteRepository venteRepository;

	public StatiDto getSatitstique() {
		StatiDto s = new StatiDto();
		s.setNombreBien(bienRepository.count());
		s.setNombreProprietaire(proprietaireRepository.count());
		s.setNombreVente(venteRepository.count());
		s.setNombreLocations(locationRepository.count());
		return s;
	}
}