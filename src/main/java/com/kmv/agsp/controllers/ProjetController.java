package com.kmv.agsp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kmv.agsp.config.SigaiResponse;
import com.kmv.agsp.controllers.dto.ProjetDto;
import com.kmv.agsp.services.impl.ProjetService;
import com.kmv.agsp.util.Constants;

/**
 * Spring controller "Projet"
 * 
 * @author : kourmou omar
 * @creation : 03/03/22
 * @version : 1.0
 */
@RestController
@RequestMapping("/projet")
public class ProjetController {

	@Autowired
	private ProjetService projetService;

	@GetMapping(value = "/v0", headers = Constants.HEADERS)
	public SigaiResponse getAllProjets() {
		/* get all Projet */
		return new SigaiResponse(ProjetDto.entitiesToDtos(projetService.getAllProjets()), HttpStatus.OK);
	}

	@GetMapping(value = "/v0/{id}", headers = Constants.HEADERS)
	public SigaiResponse getProjetById(@PathVariable Long id) {
		/* return Projet by id */
		return new SigaiResponse(projetService.getProjetById(id), HttpStatus.OK);
	}

	@PostMapping(value = "/v0", headers = Constants.HEADERS)
	public SigaiResponse addProjet(@RequestBody ProjetDto ProjetDto) {
		/* add Projet */
		return new SigaiResponse(ProjetDto.entityToDto(projetService.addProjet(ProjetDto)), HttpStatus.OK);
	}

	@PutMapping(value = "/v0", headers = Constants.HEADERS)
	public SigaiResponse updateProjet(@RequestBody ProjetDto ProjetDto) {
		/* update Projet */
		return new SigaiResponse(ProjetDto.entityToDto(projetService.updateProjet(ProjetDto)), HttpStatus.OK);
	}

	@DeleteMapping(value = "/v0/{id}", headers = Constants.HEADERS)
	public SigaiResponse deleteProjet(@PathVariable Long id) {
		/* delete Projet */
		projetService.deleteProjet(id);
		return new SigaiResponse(HttpStatus.OK);
	}

}
