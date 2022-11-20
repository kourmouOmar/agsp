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
import com.kmv.agsp.controllers.dto.FicheN2Dto;
import com.kmv.agsp.services.impl.FicheN2Service;
import com.kmv.agsp.util.Constants;

/**
 * Spring controller "FicheN2"
 * 
 * @author : kourmou omar
 * @creation : 03/03/22
 * @version : 1.0
 */
@RestController
@RequestMapping("/ficheN2")
public class FicheN2Controller {

	@Autowired
	private FicheN2Service FicheN2Service;

	@GetMapping(value = "/v0", headers = Constants.HEADERS)
	public SigaiResponse getAllFicheN2s() {
		/* get all FicheN2 */
		return new SigaiResponse(FicheN2Service.getAllFicheN2s(), HttpStatus.OK);
	}

	@GetMapping(value = "/v0/{id}", headers = Constants.HEADERS)
	public SigaiResponse getFicheN2ById(@PathVariable Long id) {
		/* return FicheN2 by id */
		return new SigaiResponse(FicheN2Service.getFicheN2ById(id), HttpStatus.OK);
	}

	@PostMapping(value = "/v0", headers = Constants.HEADERS)
	public SigaiResponse addFicheN2(@RequestBody FicheN2Dto FicheN2Dto) {
		/* add FicheN2 */
		return new SigaiResponse(FicheN2Service.addFicheN2(FicheN2Dto), HttpStatus.OK);
	}

	@PutMapping(value = "/v0", headers = Constants.HEADERS)
	public SigaiResponse updateFicheN2(@RequestBody FicheN2Dto FicheN2Dto) {
		/* update FicheN2 */
		return new SigaiResponse(FicheN2Service.updateFicheN2(FicheN2Dto), HttpStatus.OK);
	}

	@DeleteMapping(value = "/v0/{id}", headers = Constants.HEADERS)
	public SigaiResponse deleteFicheN2(@PathVariable Long id) {
		/* delete FicheN2 */
		FicheN2Service.deleteFicheN2(id);
		return new SigaiResponse(HttpStatus.OK);
	}

}
