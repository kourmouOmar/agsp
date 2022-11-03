package com.kmv.agsp.controllers.dto;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.kmv.agsp.entities.ProjetEntity;
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
public class ProjetDto implements Serializable {

private static final long serialVersionUID = 1L;

    private Long idProjet     ;
    @NotNull
    @Size(max=255)
    private String numero;
    @NotNull
    @Size(max=255)
    private String designation;
    private Boolean active;
    @Size(max=255)
    private String emailResponsable;
    @Size(max=255)
    private String telephoneResponsable;
    @Size(max=255)
    private String nomCompletResponsable;
	// Relations
    private List<ChantierDto> listOfChantierDto;  
    private ClientDto clientDto;

	// Relation Enum
	public enum ProjetRelationsEnum {
		listOfChantier,
    	client; 
	}
   
	/**
     * Convert ProjetEntity -> ProjetDto
     * @return ProjetDto
     */
    public static ProjetDto entityToDto(ProjetEntity entity){
		ProjetDto dto = null;
		if(entity != null){
			dto = new ProjetDto();
        	dto.setIdProjet(entity.getIdProjet());
        	dto.setNumero(entity.getNumero());  
        	dto.setDesignation(entity.getDesignation());  
        	dto.setActive(entity.getActive());  
        	dto.setEmailResponsable(entity.getEmailResponsable());  
        	dto.setTelephoneResponsable(entity.getTelephoneResponsable());  
        	dto.setNomCompletResponsable(entity.getNomCompletResponsable());  
		}
		return  dto;
    }
	/**
     * Convert ProjetDto -> ProjetEntity
     * @param ProjetDto
     */
    public static ProjetEntity dtoToEntity(ProjetDto dto){
		ProjetEntity entity = null;
		if(dto != null){
			entity = new ProjetEntity();
        	entity.setIdProjet(dto.getIdProjet()) ;
        	entity.setNumero(dto.getNumero());   
        	entity.setDesignation(dto.getDesignation());   
        	entity.setActive(dto.getActive());   
        	entity.setEmailResponsable(dto.getEmailResponsable());   
        	entity.setTelephoneResponsable(dto.getTelephoneResponsable());   
        	entity.setNomCompletResponsable(dto.getNomCompletResponsable());   
		}
		
		return  entity;
    }
    /**
     * Convert list ProjetDto -> list ProjetEntity
     * @param List<ProjetDto>
     */
    public static List<ProjetEntity> dtosToEntities(List<ProjetDto> listDto){
		List<ProjetEntity> list = new ArrayList<>();
 		if(Functions.isNotEmpty(listDto)){
        	for(ProjetDto dto:listDto){
    			list.add(dtoToEntity(dto));
    		}
		}
        return list;
    }
    /**
     * Convert list ProjetEntity -> list ProjetDto
     * @param List<ProjetEntity>
     */
    public static List<ProjetDto> entitiesToDtos(List<ProjetEntity> listEntity){
		List<ProjetDto> list = new ArrayList<>();
		if(Functions.isNotEmpty(listEntity)){
        	for(ProjetEntity entity:listEntity){
    			list.add(entityToDto(entity));
    		}
		}
        return list;
    }
}