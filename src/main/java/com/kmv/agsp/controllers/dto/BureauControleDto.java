package com.kmv.agsp.controllers.dto;





import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.kmv.agsp.entities.BureauControleEntity;
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
public class BureauControleDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long idBureauControle ;
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
	public enum BureauControleRelationsEnum {
    	listOfProjet; 
	}
   
	/**
     * Convert BureauControleEntity -> BureauControleDto
     * @return BureauControleDto
     */
    public static BureauControleDto entityToDto(BureauControleEntity entity){
		BureauControleDto dto = null;
		if(entity != null){
			dto = new BureauControleDto();
        	dto.setIdBureauControle(entity.getIdBureauControle());
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
     * Convert BureauControleDto -> BureauControleEntity
     * @param BureauControleDto
     */
    public static BureauControleEntity dtoToEntity(BureauControleDto dto){
		BureauControleEntity entity = null;
		if(dto != null){
			entity = new BureauControleEntity();
        	entity.setIdBureauControle(dto.getIdBureauControle()) ;
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
     * Convert list BureauControleDto -> list BureauControleEntity
     * @param List<BureauControleDto>
     */
    public static List<BureauControleEntity> dtosToEntities(List<BureauControleDto> listDto){
		List<BureauControleEntity> list = new ArrayList<>();
 		if(Functions.isNotEmpty(listDto)){
        	for(BureauControleDto dto:listDto){
    			list.add(dtoToEntity(dto));
    		}
		}
        return list;
    }
    /**
     * Convert list BureauControleEntity -> list BureauControleDto
     * @param List<BureauControleEntity>
     */
    public static List<BureauControleDto> entitiesToDtos(List<BureauControleEntity> listEntity){
		List<BureauControleDto> list = new ArrayList<>();
		if(Functions.isNotEmpty(listEntity)){
        	for(BureauControleEntity entity:listEntity){
    			list.add(entityToDto(entity));
    		}
		}
        return list;
    }
}