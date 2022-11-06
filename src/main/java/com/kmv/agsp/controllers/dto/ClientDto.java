package com.kmv.agsp.controllers.dto;





import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.kmv.agsp.entities.ClientEntity;
import com.kmv.agsp.util.Functions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@JsonIgnoreProperties(ignoreUnknown = true)
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ClientDto implements Serializable {

private static final long serialVersionUID = 1L;

    private Long idClient     ;
    @NotNull

    @NotNull
    @Size(max=255)
    private String designation;
    @Size(max=255)
    private String adresse;
    @Size(max=255)
    private String ville;
    @Size(max=255)
    private String nomCompletContact;
    @NotNull
    @Size(max=255)
    private String ice;
    private Boolean active;
    @NotNull
    @Size(max=255)
    private String telephone;
    @Size(max=255)
    private String fax;
    @Size(max=255)
    private String email;
	// Relations
    private List<ProjetDto> listOfProjetDto;  

	// Relation Enum
	public enum ClientRelationsEnum {
    	listOfProjet; 
	}
   
	/**
     * Convert ClientEntity -> ClientDto
     * @return ClientDto
     */
    public static ClientDto entityToDto(ClientEntity entity){
		ClientDto dto = null;
		if(entity != null){
			dto = new ClientDto();
        	dto.setIdClient(entity.getIdClient());
        	dto.setDesignation(entity.getDesignation());  
        	dto.setAdresse(entity.getAdresse());  
        	dto.setVille(entity.getVille());  
        	dto.setNomCompletContact(entity.getNomCompletContact());  
        	dto.setIce(entity.getIce());  
        	dto.setActive(entity.getActive());  
        	dto.setTelephone(entity.getTelephone());  
        	dto.setFax(entity.getFax());  
        	dto.setEmail(entity.getEmail());  
		}
		return  dto;
    }
	/**
     * Convert ClientDto -> ClientEntity
     * @param ClientDto
     */
    public static ClientEntity dtoToEntity(ClientDto dto){
		ClientEntity entity = null;
		if(dto != null){
			entity = new ClientEntity();
        	entity.setIdClient(dto.getIdClient()) ;
        	entity.setDesignation(dto.getDesignation());   
        	entity.setAdresse(dto.getAdresse());   
        	entity.setVille(dto.getVille());   
        	entity.setNomCompletContact(dto.getNomCompletContact());   
        	entity.setIce(dto.getIce());   
        	entity.setActive(dto.getActive());   
        	entity.setTelephone(dto.getTelephone());   
        	entity.setFax(dto.getFax());   
        	entity.setEmail(dto.getEmail());   
		}
		
		return  entity;
    }
    /**
     * Convert list ClientDto -> list ClientEntity
     * @param List<ClientDto>
     */
    public static List<ClientEntity> dtosToEntities(List<ClientDto> listDto){
		List<ClientEntity> list = new ArrayList<>();
 		if(Functions.isNotEmpty(listDto)){
        	for(ClientDto dto:listDto){
    			list.add(dtoToEntity(dto));
    		}
		}
        return list;
    }
    /**
     * Convert list ClientEntity -> list ClientDto
     * @param List<ClientEntity>
     */
    public static List<ClientDto> entitiesToDtos(List<ClientEntity> listEntity){
		List<ClientDto> list = new ArrayList<>();
		if(Functions.isNotEmpty(listEntity)){
        	for(ClientEntity entity:listEntity){
    			list.add(entityToDto(entity));
    		}
		}
        return list;
    }
}