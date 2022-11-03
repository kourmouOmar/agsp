package com.kmv.agsp.services;

import java.util.List;

import com.kmv.agsp.controllers.dto.ClientDto;
import com.kmv.agsp.entities.ClientEntity;

public interface IClientService{

/**
	 * Get Client by Id
	 * 
	 * @param idClient
	 * @return ClientEntity
	 */
	ClientEntity getClientById(Long idClient);

	/**
	 * get all Client
	 *
	 * @return List<ClientEntity>
	 */
	List<ClientEntity> getAllClients();

	/**
	 * add Client
	 *
	 * @param ClientDto
	 * @return ClientEntity
	 */
	ClientEntity addClient(ClientDto ClientDto);

	/**
	 * update Client
	 *
	 * @param ClientDto
	 * @return ClientEntity
	 */
	ClientEntity updateClient(ClientDto ClientDto);

	/**
	 * delete Client
	 *
	 * @param idClient
	 * @return ClientEntity
	 */
	void deleteClient(Long idClient);

}