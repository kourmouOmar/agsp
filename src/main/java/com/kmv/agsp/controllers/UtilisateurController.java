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
import com.kmv.agsp.controllers.dto.UtilisateurDto;
import com.kmv.agsp.services.impl.UtilisateurService;
import com.kmv.agsp.util.Constants;

/**
 * Spring controller "Utilisateur"
 * 
 * @author : kourmou omar
 * @creation : 03/03/22
 * @version : 1.0
 */
@RestController
@RequestMapping("Utilisateur")
public class UtilisateurController {

	@Autowired
	private UtilisateurService UtilisateurService;

	@GetMapping(value = "/v0", headers = Constants.HEADERS)
	public SigaiResponse getAllUtilisateurs() {
		/* get all Utilisateur */
		return new SigaiResponse(UtilisateurService.getAllUtilisateurs(), HttpStatus.OK);
	}

	@GetMapping(value = "/v0/{id}", headers = Constants.HEADERS)
	public SigaiResponse getUtilisateurById(@PathVariable Long id) {
		/* return Utilisateur by id */
		return new SigaiResponse(UtilisateurService.getUtilisateurById(id), HttpStatus.OK);
	}

	@PostMapping(value = "/v0/{id}", headers = Constants.HEADERS)
	public SigaiResponse addUtilisateur(@RequestBody UtilisateurDto UtilisateurDto) {
		/* add Utilisateur */
		return new SigaiResponse(UtilisateurService.addUtilisateur(UtilisateurDto), HttpStatus.OK);
	}

	@PutMapping(value = "/v0/{id}", headers = Constants.HEADERS)
	public SigaiResponse updateUtilisateur(@RequestBody UtilisateurDto UtilisateurDto) {
		/* update Utilisateur */
		return new SigaiResponse(UtilisateurService.updateUtilisateur(UtilisateurDto), HttpStatus.OK);
	}

	@DeleteMapping(value = "/v0/{id}", headers = Constants.HEADERS)
	public SigaiResponse deleteUtilisateur(@PathVariable Long id) {
		/* delete Utilisateur */
		UtilisateurService.deleteUtilisateur(id);
		return new SigaiResponse(HttpStatus.OK);
	}

}
