package com.kmv.agsp.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kmv.agsp.controllers.dto.ClientDto;
import com.kmv.agsp.entities.ClientEntity;
import com.kmv.agsp.repository.IClientRepository;
import com.kmv.agsp.services.IClientService;

@Service
public class ClientService implements IClientService {
	
	@Autowired
	IClientRepository clientRespository;
	
	@Override
	public ClientEntity getClientById(Long idClient) {
		return clientRespository.getClientBydId(idClient);
	}

	@Override
	public List<ClientEntity> getAllClients() {
		/* get all Client*/
		return clientRespository.findAll();
	}

	@Override
	public ClientEntity addClient(ClientDto clientDto) {
		/* add Client */
		return clientRespository.save(ClientDto.dtoToEntity(clientDto));
	}

	@Override
	public ClientEntity updateClient(ClientDto clientDto) {
		/* update Client*/
		return clientRespository.save(ClientDto.dtoToEntity(clientDto));
	}

	@Override
	public void deleteClient(Long idClient) {
		/* delete Client*/
		clientRespository.deleteById(idClient);
	}
}