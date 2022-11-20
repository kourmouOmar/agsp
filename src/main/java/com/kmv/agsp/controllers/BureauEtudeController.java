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
import com.kmv.agsp.controllers.dto.BureauEtudeDto;
import com.kmv.agsp.services.impl.BureauEtudeService;
import com.kmv.agsp.util.Constants;

/**
 * Spring controller "BureauEtude"
 * 
 * @author : kourmou omar
 * @creation : 03/03/22
 * @version : 1.0
 */
@RestController
@RequestMapping("/bureau-etude")
public class BureauEtudeController {

	@Autowired
	private BureauEtudeService bureauEtudeService;

	@GetMapping(value = "/v0", headers = Constants.HEADERS)
	public SigaiResponse getAllBureauEtudes() {
		/* get all BureauEtude */
		return new SigaiResponse(BureauEtudeDto.entitiesToDtos(bureauEtudeService.getAllBureauEtudes()), HttpStatus.OK);
	}

	@GetMapping(value = "/v0/{id}", headers = Constants.HEADERS)
	public SigaiResponse getBureauEtudeById(@PathVariable Long id) {
		/* return BureauEtude by id */
		return new SigaiResponse(BureauEtudeDto.entityToDto(bureauEtudeService.getBureauEtudeById(id)), HttpStatus.OK);
	}

	@SuppressWarnings("static-access")
	@PostMapping(value = "/v0", headers = Constants.HEADERS)
	public SigaiResponse addBureauEtude(@RequestBody BureauEtudeDto BureauEtudeDto) {
		/* add BureauEtude */
		return new SigaiResponse(BureauEtudeDto.entityToDto(bureauEtudeService.addBureauEtude(BureauEtudeDto)), HttpStatus.OK);
	}
	
	
	@SuppressWarnings("static-access")
	@PutMapping(value = "/v0", headers = Constants.HEADERS)
	public SigaiResponse updateBureauEtude(@RequestBody BureauEtudeDto BureauEtudeDto) {
		/* update BureauEtude */
		return new SigaiResponse(BureauEtudeDto.entityToDto(bureauEtudeService.updateBureauEtude(BureauEtudeDto)), HttpStatus.OK);
	}

	@DeleteMapping(value = "/v0/{id}", headers = Constants.HEADERS)
	public SigaiResponse deleteBureauEtude(@PathVariable Long id) {
		/* delete BureauEtude */
		bureauEtudeService.deleteBureauEtude(id);
		return new SigaiResponse(HttpStatus.OK);
	}

}
