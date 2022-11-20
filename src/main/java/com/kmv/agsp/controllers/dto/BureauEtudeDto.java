package com.kmv.agsp.controllers.dto;





import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.kmv.agsp.entities.BureauEtudeEntity;
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
public class BureauEtudeDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long idBureauEtude ;
    @NotNull
    @Size(max=255)
    private String numero;
    @NotNull
    @Size(max=255)
    private String designation;
    @Size(max=255)
    private String description;
    @Size(max=255)
    private String fax;
    @Size(max=255)
    private String emailResponsable;
    @Size(max=255)
    private String telephoneResponsable;
    @Size(max=255)
    private String nomCompletResponsable;
	// Relations
    private List<ProjetDto> listOfProjetDto;  

	// Relation Enum
	public enum BureauEtudeRelationsEnum {
    	listOfProjet; 
	}
   
	/**
     * Convert BureauEtudeEntity -> BureauEtudeDto
     * @return BureauEtudeDto
     */
    public static BureauEtudeDto entityToDto(BureauEtudeEntity entity){
		BureauEtudeDto dto = null;
		if(entity != null){
			dto = new BureauEtudeDto();
        	dto.setIdBureauEtude(entity.getIdBureauEtude());
        	dto.setNumero(entity.getNumero());  
        	dto.setDesignation(entity.getDesignation());  
        	dto.setDescription(entity.getDescription());  
        	dto.setFax(entity.getFax());  
        	dto.setEmailResponsable(entity.getEmailResponsable());  
        	dto.setTelephoneResponsable(entity.getTelephoneResponsable());  
        	dto.setNomCompletResponsable(entity.getNomCompletResponsable());  
		}
		return  dto;
    }
	/**
     * Convert BureauEtudeDto -> BureauEtudeEntity
     * @param BureauEtudeDto
     */
    public static BureauEtudeEntity dtoToEntity(BureauEtudeDto dto){
		BureauEtudeEntity entity = null;
		if(dto != null){
			entity = new BureauEtudeEntity();
        	entity.setIdBureauEtude(dto.getIdBureauEtude()) ;
        	entity.setNumero(dto.getNumero());   
        	entity.setDesignation(dto.getDesignation());   
        	entity.setDescription(dto.getDescription());   
        	entity.setFax(dto.getFax());   
        	entity.setEmailResponsable(dto.getEmailResponsable());   
        	entity.setTelephoneResponsable(dto.getTelephoneResponsable());   
        	entity.setNomCompletResponsable(dto.getNomCompletResponsable());   
		}
		
		return  entity;
    }
    /**
     * Convert list BureauEtudeDto -> list BureauEtudeEntity
     * @param List<BureauEtudeDto>
     */
    public static List<BureauEtudeEntity> dtosToEntities(List<BureauEtudeDto> listDto){
		List<BureauEtudeEntity> list = new ArrayList<>();
 		if(Functions.isNotEmpty(listDto)){
        	for(BureauEtudeDto dto:listDto){
    			list.add(dtoToEntity(dto));
    		}
		}
        return list;
    }
    /**
     * Convert list BureauEtudeEntity -> list BureauEtudeDto
     * @param List<BureauEtudeEntity>
     */
    public static List<BureauEtudeDto> entitiesToDtos(List<BureauEtudeEntity> listEntity){
		List<BureauEtudeDto> list = new ArrayList<>();
		if(Functions.isNotEmpty(listEntity)){
        	for(BureauEtudeEntity entity:listEntity){
    			list.add(entityToDto(entity));
    		}
		}
        return list;
    }
}