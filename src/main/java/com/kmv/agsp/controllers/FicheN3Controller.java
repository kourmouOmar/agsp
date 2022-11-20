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
import com.kmv.agsp.controllers.dto.FicheN3Dto;
import com.kmv.agsp.services.impl.FicheN3Service;
import com.kmv.agsp.util.Constants;

/**
 * Spring controller "FicheN3"
 * 
 * @author : kourmou omar
 * @creation : 03/03/22
 * @version : 1.0
 */
@RestController
@RequestMapping("/ficheN3")
public class FicheN3Controller {

	@Autowired
	private FicheN3Service FicheN3Service;

	@GetMapping(value = "/v0", headers = Constants.HEADERS)
	public SigaiResponse getAllFicheN3s() {
		/* get all FicheN3 */
		return new SigaiResponse(FicheN3Service.getAllFicheN3s(), HttpStatus.OK);
	}

	@GetMapping(value = "/v0/{id}", headers = Constants.HEADERS)
	public SigaiResponse getFicheN3ById(@PathVariable Long id) {
		/* return FicheN3 by id */
		return new SigaiResponse(FicheN3Service.getFicheN3ById(id), HttpStatus.OK);
	}

	@PostMapping(value = "/v0/{id}", headers = Constants.HEADERS)
	public SigaiResponse addFicheN3(@RequestBody FicheN3Dto FicheN3Dto) {
		/* add FicheN3 */
		return new SigaiResponse(FicheN3Service.addFicheN3(FicheN3Dto), HttpStatus.OK);
	}

	@PutMapping(value = "/v0/{id}", headers = Constants.HEADERS)
	public SigaiResponse updateFicheN3(@RequestBody FicheN3Dto FicheN3Dto) {
		/* update FicheN3 */
		return new SigaiResponse(FicheN3Service.updateFicheN3(FicheN3Dto), HttpStatus.OK);
	}

	@DeleteMapping(value = "/v0/{id}", headers = Constants.HEADERS)
	public SigaiResponse deleteFicheN3(@PathVariable Long id) {
		/* delete FicheN3 */
		FicheN3Service.deleteFicheN3(id);
		return new SigaiResponse(HttpStatus.OK);
	}

}
