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
import com.kmv.agsp.controllers.dto.ChantierDto;
import com.kmv.agsp.services.impl.ChantierService;
import com.kmv.agsp.util.Constants;


/**
 * Spring controller "Chantier"
 * 
 * @author : kourmou omar
 * @creation : 03/11/22
 * @version : 1.0
 */
@RestController
@RequestMapping("chantier")
public class ChantierController {

	@Autowired
	private ChantierService chantierService;

	@GetMapping(value = "/v0", headers = Constants.HEADERS)
	public SigaiResponse getAllChantiers() {
		/* get all Chantier */
		return new SigaiResponse(chantierService.getAllChantiers(), HttpStatus.OK);
	}

	@GetMapping(value = "/v0/{id}", headers = Constants.HEADERS)
	public SigaiResponse getChantierById(@PathVariable Long id) {
		/* return Chantier by id */
		return new SigaiResponse(chantierService.getChantierById(id), HttpStatus.OK);
	}

	@PostMapping(value = "/v0/{id}", headers = Constants.HEADERS)
	public SigaiResponse addChantier(@RequestBody ChantierDto ChantierDto) {
		/* add Chantier */
		return new SigaiResponse(chantierService.addChantier(ChantierDto), HttpStatus.OK);
	}

	@PutMapping(value = "/v0/{id}", headers = Constants.HEADERS)
	public SigaiResponse updateChantier(@RequestBody ChantierDto ChantierDto) {
		/* update Chantier */
		return new SigaiResponse(chantierService.updateChantier(ChantierDto), HttpStatus.OK);
	}

	@DeleteMapping(value = "/v0/{id}", headers = Constants.HEADERS)
	public SigaiResponse deleteChantier(@PathVariable Long id) {
		/* delete Chantier */
		chantierService.deleteChantier(id);
		return new SigaiResponse(HttpStatus.OK);
	}

}
