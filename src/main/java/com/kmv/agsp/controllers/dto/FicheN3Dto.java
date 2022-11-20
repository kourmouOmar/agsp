package com.kmv.agsp.controllers.dto;





import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.kmv.agsp.entities.FicheN3Entity;
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
public class FicheN3Dto implements Serializable {

private static final long serialVersionUID = 1L;

    private Long idFicheN3    ;
    @Size(max=255)
    private String planRef;
    @Size(max=255)
    private String plancher;
    @Size(max=255)
    private String situation;
    private Date dateFiche;
    @Size(max=255)
    private String fissuration;
    @Size(max=255)
    private String enrobage;
    @Size(max=255)
    private String segregation;
    @Size(max=255)
    private String observation;
    private Long idProjet;
    private Long idChantier;
    private Long idClient;
	// Relations
    private List<ChantierDto> listOfChantierDto;  

	// Relation Enum
	public enum FicheN3RelationsEnum {
    	listOfChantier; 
	}
   
	/**
     * Convert FicheN3Entity -> FicheN3Dto
     * @return FicheN3Dto
     */
    public static FicheN3Dto entityToDto(FicheN3Entity entity){
		FicheN3Dto dto = null;
		if(entity != null){
			dto = new FicheN3Dto();
        	dto.setIdFicheN3(entity.getIdFicheN3());
        	dto.setPlanRef(entity.getPlanRef());  
        	dto.setPlancher(entity.getPlancher());  
        	dto.setSituation(entity.getSituation());  
        	dto.setDateFiche(entity.getDateFiche());  
        	dto.setFissuration(entity.getFissuration());  
        	dto.setEnrobage(entity.getEnrobage());  
        	dto.setSegregation(entity.getSegregation());  
        	dto.setObservation(entity.getObservation());  
        	dto.setIdProjet(entity.getIdProjet());  
        	dto.setIdChantier(entity.getIdChantier());  
        	dto.setIdClient(entity.getIdClient());  
		}
		return  dto;
    }
	/**
     * Convert FicheN3Dto -> FicheN3Entity
     * @param FicheN3Dto
     */
    public static FicheN3Entity dtoToEntity(FicheN3Dto dto){
		FicheN3Entity entity = null;
		if(dto != null){
			entity = new FicheN3Entity();
        	entity.setIdFicheN3(dto.getIdFicheN3()) ;
        	entity.setPlanRef(dto.getPlanRef());   
        	entity.setPlancher(dto.getPlancher());   
        	entity.setSituation(dto.getSituation());   
        	entity.setDateFiche(dto.getDateFiche());   
        	entity.setFissuration(dto.getFissuration());   
        	entity.setEnrobage(dto.getEnrobage());   
        	entity.setSegregation(dto.getSegregation());   
        	entity.setObservation(dto.getObservation());   
        	entity.setIdProjet(dto.getIdProjet());   
        	entity.setIdChantier(dto.getIdChantier());   
        	entity.setIdClient(dto.getIdClient());   
		}
		
		return  entity;
    }
    /**
     * Convert list FicheN3Dto -> list FicheN3Entity
     * @param List<FicheN3Dto>
     */
    public static List<FicheN3Entity> dtosToEntities(List<FicheN3Dto> listDto){
		List<FicheN3Entity> list = new ArrayList<>();
 		if(Functions.isNotEmpty(listDto)){
        	for(FicheN3Dto dto:listDto){
    			list.add(dtoToEntity(dto));
    		}
		}
        return list;
    }
    /**
     * Convert list FicheN3Entity -> list FicheN3Dto
     * @param List<FicheN3Entity>
     */
    public static List<FicheN3Dto> entitiesToDtos(List<FicheN3Entity> listEntity){
		List<FicheN3Dto> list = new ArrayList<>();
		if(Functions.isNotEmpty(listEntity)){
        	for(FicheN3Entity entity:listEntity){
    			list.add(entityToDto(entity));
    		}
		}
        return list;
    }
}