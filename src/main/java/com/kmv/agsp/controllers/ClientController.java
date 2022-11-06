
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
import com.kmv.agsp.controllers.dto.ClientDto;
import com.kmv.agsp.services.impl.ClientService;
import com.kmv.agsp.util.Constants;

/**
 * Spring controller "Client"
 * 
 * @author : kourmou omar
 * @creation : 03/11/22
 * @version : 1.0
 */
@RestController
@RequestMapping("client")
public class ClientController {

	@Autowired
	private ClientService clientService;

	@GetMapping(value = "/v0", headers = Constants.HEADERS)
	public SigaiResponse getAllClients() {
		/* get all Client */
		return new SigaiResponse(clientService.getAllClients(), HttpStatus.OK);
	}

	@GetMapping(value = "/v0/{id}", headers = Constants.HEADERS)
	public SigaiResponse getClientById(@PathVariable Long id) {
		/* return Client by id */
		return new SigaiResponse(clientService.getClientById(id), HttpStatus.OK);
	}

	@PostMapping(value = "/v0", headers = Constants.HEADERS)
	public SigaiResponse addClient(@RequestBody ClientDto ClientDto) {
		/* add Client */
		return new SigaiResponse(clientService.addClient(ClientDto), HttpStatus.OK);
	}

	@PutMapping(value = "/v0", headers = Constants.HEADERS)
	public SigaiResponse updateClient(@RequestBody ClientDto ClientDto) {
		/* update Client */
		return new SigaiResponse(clientService.updateClient(ClientDto), HttpStatus.OK);
	}

	@DeleteMapping(value = "/v0/{id}", headers = Constants.HEADERS)
	public SigaiResponse deleteClient(@PathVariable Long id) {
		/* delete Client */
		clientService.deleteClient(id);
		return new SigaiResponse(HttpStatus.OK);
	}

}
