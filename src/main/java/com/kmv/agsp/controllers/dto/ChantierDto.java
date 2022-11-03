package com.kmv.agsp.controllers.dto;






import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.kmv.agsp.entities.ChantierEntity;
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
public class ChantierDto implements Serializable {

private static final long serialVersionUID = 1L;

    private Long idChantier   ;
    @NotNull
    @Size(max=255)
    private String numero;
    @NotNull
    @Size(max=255)
    private String designation;
    @Size(max=255)
    private String description;
	// Relations
    private ProjetDto projetDto;

	// Relation Enum
	public enum ChantierRelationsEnum {
    	projet; 
	}
   
	/**
     * Convert ChantierEntity -> ChantierDto
     * @return ChantierDto
     */
    public static ChantierDto entityToDto(ChantierEntity entity){
		ChantierDto dto = null;
		if(entity != null){
			dto = new ChantierDto();
        	dto.setIdChantier(entity.getIdChantier());
        	dto.setNumero(entity.getNumero());  
        	dto.setDesignation(entity.getDesignation());  
        	dto.setDescription(entity.getDescription());  
		}
		return  dto;
    }
	/**
     * Convert ChantierDto -> ChantierEntity
     * @param ChantierDto
     */
    public static ChantierEntity dtoToEntity(ChantierDto dto){
		ChantierEntity entity = null;
		if(dto != null){
			entity = new ChantierEntity();
        	entity.setIdChantier(dto.getIdChantier()) ;
        	entity.setNumero(dto.getNumero());   
        	entity.setDesignation(dto.getDesignation());   
        	entity.setDescription(dto.getDescription());   
		}
		
		return  entity;
    }
    /**
     * Convert list ChantierDto -> list ChantierEntity
     * @param List<ChantierDto>
     */
    public static List<ChantierEntity> dtosToEntities(List<ChantierDto> listDto){
		List<ChantierEntity> list = new ArrayList<>();
 		if(Functions.isNotEmpty(listDto)){
        	for(ChantierDto dto:listDto){
    			list.add(dtoToEntity(dto));
    		}
		}
        return list;
    }
    /**
     * Convert list ChantierEntity -> list ChantierDto
     * @param List<ChantierEntity>
     */
    public static List<ChantierDto> entitiesToDtos(List<ChantierEntity> listEntity){
		List<ChantierDto> list = new ArrayList<>();
		if(Functions.isNotEmpty(listEntity)){
        	for(ChantierEntity entity:listEntity){
    			list.add(entityToDto(entity));
    		}
		}
        return list;
    }
}