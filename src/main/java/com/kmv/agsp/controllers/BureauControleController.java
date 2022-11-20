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
import com.kmv.agsp.controllers.dto.BureauControleDto;
import com.kmv.agsp.services.impl.BureauControleService;
import com.kmv.agsp.util.Constants;

/**
 * Spring controller "BureauControle"
 * 
 * @author : kourmou omar
 * @creation : 03/03/22
 * @version : 1.0
 */
@RestController
@RequestMapping("/bureau-controle")
public class BureauControleController {

	@Autowired
	private BureauControleService bureauControleService;

	@GetMapping(value = "/v0", headers = Constants.HEADERS)
	public SigaiResponse getAllBureauControles() {
		/* get all BureauControle */
		return new SigaiResponse(BureauControleDto.entitiesToDtos(bureauControleService.getAllBureauControles()), HttpStatus.OK);
	}

	@GetMapping(value = "/v0/{id}", headers = Constants.HEADERS)
	public SigaiResponse getBureauControleById(@PathVariable Long id) {
		/* return BureauControle by id */
		return new SigaiResponse(bureauControleService.getBureauControleById(id), HttpStatus.OK);
	}

	@PostMapping(value = "/v0", headers = Constants.HEADERS)
	public SigaiResponse addBureauControle(@RequestBody BureauControleDto BureauControleDto) {
		/* add BureauControle */
		return new SigaiResponse(bureauControleService.addBureauControle(BureauControleDto), HttpStatus.OK);
	}

	@PutMapping(value = "/v0", headers = Constants.HEADERS)
	public SigaiResponse updateBureauControle(@RequestBody BureauControleDto BureauControleDto) {
		/* update BureauControle */
		return new SigaiResponse(bureauControleService.updateBureauControle(BureauControleDto), HttpStatus.OK);
	}

	@DeleteMapping(value = "/v0/{id}", headers = Constants.HEADERS)
	public SigaiResponse deleteBureauControle(@PathVariable Long id) {
		/* delete BureauControle */
		bureauControleService.deleteBureauControle(id);
		return new SigaiResponse(HttpStatus.OK);
	}

}
