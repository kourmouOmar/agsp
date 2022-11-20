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
import com.kmv.agsp.controllers.dto.FicheN1Dto;
import com.kmv.agsp.services.impl.FicheN1Service;
import com.kmv.agsp.util.Constants;

/**
 * Spring controller "FicheN1"
 * 
 * @author : kourmou omar
 * @creation : 03/03/22
 * @version : 1.0
 */
@RestController
@RequestMapping("/ficheN1")
public class FicheN1Controller {

	@Autowired
	private FicheN1Service FicheN1Service;

	@GetMapping(value = "/v0", headers = Constants.HEADERS)
	public SigaiResponse getAllFicheN1s() {
		/* get all FicheN1 */
		return new SigaiResponse(FicheN1Service.getAllFicheN1s(), HttpStatus.OK);
	}

	@GetMapping(value = "/v0/{id}", headers = Constants.HEADERS)
	public SigaiResponse getFicheN1ById(@PathVariable Long id) {
		/* return FicheN1 by id */
		return new SigaiResponse(FicheN1Service.getFicheN1ById(id), HttpStatus.OK);
	}

	@PostMapping(value = "/v0", headers = Constants.HEADERS)
	public SigaiResponse addFicheN1(@RequestBody FicheN1Dto FicheN1Dto) {
		/* add FicheN1 */
		return new SigaiResponse(FicheN1Service.addFicheN1(FicheN1Dto), HttpStatus.OK);
	}

	@PutMapping(value = "/v0", headers = Constants.HEADERS)
	public SigaiResponse updateFicheN1(@RequestBody FicheN1Dto FicheN1Dto) {
		/* update FicheN1 */
		return new SigaiResponse(FicheN1Service.updateFicheN1(FicheN1Dto), HttpStatus.OK);
	}

	@DeleteMapping(value = "/v0/{id}", headers = Constants.HEADERS)
	public SigaiResponse deleteFicheN1(@PathVariable Long id) {
		/* delete FicheN1 */
		FicheN1Service.deleteFicheN1(id);
		return new SigaiResponse(HttpStatus.OK);
	}

}
