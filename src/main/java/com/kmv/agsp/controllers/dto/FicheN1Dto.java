package com.kmv.agsp.controllers.dto;





import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.kmv.agsp.entities.FicheN1Entity;
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
public class FicheN1Dto implements Serializable {

private static final long serialVersionUID = 1L;

    private Long idFicheN1    ;
    @Size(max=255)
    private String planRef;
    @Size(max=255)
    private String plancher;
    @Size(max=255)
    private String situation;
    private Date dateFiche;
    private Boolean coffrageConforme;
    @Size(max=255)
    private String coffrageObservation;
    private Boolean limiteCoffrageConforme;
    @Size(max=255)
    private String limiteCoffrageObservation;
    private Boolean poteauxCoffrageConforme;
    @Size(max=255)
    private String poteauxCoffrageObservation;
    private Boolean voilesCoffrageConforme;
    @Size(max=255)
    private String voilesCoffrageObservation;
    private Boolean ouvertureCoffrageConforme;
    @Size(max=255)
    private String ouvertureCoffrageObservation;
    private Boolean electriciteConforme;
    @Size(max=255)
    private String electriciteObservation;
    private Boolean escalierConforme;
    @Size(max=255)
    private String escalierObservation;
    private Boolean magasinConforme;
    @Size(max=255)
    private String magasinObservation;
    private Boolean envHygiensConforme;
    @Size(max=255)
    private String envHygiensObservation;
    private Boolean moyenLevageManutentionConforme;
    @Size(max=255)
    private String moyenLevageManutentionObservation;
    private Boolean gardesCorpsConforme;
    @Size(max=255)
    private String gardesCorpsObservation;
    private Long idProjet;
    private Long idChantier;
    private Long idClient;
	// Relations
    private List<ChantierDto> listOfChantierDto;  

	// Relation Enum
	public enum FicheN1RelationsEnum {
    	listOfChantier; 
	}
   
	/**
     * Convert FicheN1Entity -> FicheN1Dto
     * @return FicheN1Dto
     */
    public static FicheN1Dto entityToDto(FicheN1Entity entity){
		FicheN1Dto dto = null;
		if(entity != null){
			dto = new FicheN1Dto();
        	dto.setIdFicheN1(entity.getIdFicheN1());
        	dto.setPlanRef(entity.getPlanRef());  
        	dto.setPlancher(entity.getPlancher());  
        	dto.setSituation(entity.getSituation());  
        	dto.setDateFiche(entity.getDateFiche());  
        	dto.setCoffrageConforme(entity.getCoffrageConforme());  
        	dto.setCoffrageObservation(entity.getCoffrageObservation());  
        	dto.setLimiteCoffrageConforme(entity.getLimiteCoffrageConforme());  
        	dto.setLimiteCoffrageObservation(entity.getLimiteCoffrageObservation());  
        	dto.setPoteauxCoffrageConforme(entity.getPoteauxCoffrageConforme());  
        	dto.setPoteauxCoffrageObservation(entity.getPoteauxCoffrageObservation());  
        	dto.setVoilesCoffrageConforme(entity.getVoilesCoffrageConforme());  
        	dto.setVoilesCoffrageObservation(entity.getVoilesCoffrageObservation());  
        	dto.setOuvertureCoffrageConforme(entity.getOuvertureCoffrageConforme());  
        	dto.setOuvertureCoffrageObservation(entity.getOuvertureCoffrageObservation());  
        	dto.setElectriciteConforme(entity.getElectriciteConforme());  
        	dto.setElectriciteObservation(entity.getElectriciteObservation());  
        	dto.setEscalierConforme(entity.getEscalierConforme());  
        	dto.setEscalierObservation(entity.getEscalierObservation());  
        	dto.setMagasinConforme(entity.getMagasinConforme());  
        	dto.setMagasinObservation(entity.getMagasinObservation());  
        	dto.setEnvHygiensConforme(entity.getEnvHygiensConforme());  
        	dto.setEnvHygiensObservation(entity.getEnvHygiensObservation());  
        	dto.setMoyenLevageManutentionConforme(entity.getMoyenLevageManutentionConforme());  
        	dto.setMoyenLevageManutentionObservation(entity.getMoyenLevageManutentionObservation());  
        	dto.setGardesCorpsConforme(entity.getGardesCorpsConforme());  
        	dto.setGardesCorpsObservation(entity.getGardesCorpsObservation());  
        	dto.setIdProjet(entity.getIdProjet());  
        	dto.setIdChantier(entity.getIdChantier());  
        	dto.setIdClient(entity.getIdClient());  
		}
		return  dto;
    }
	/**
     * Convert FicheN1Dto -> FicheN1Entity
     * @param FicheN1Dto
     */
    public static FicheN1Entity dtoToEntity(FicheN1Dto dto){
		FicheN1Entity entity = null;
		if(dto != null){
			entity = new FicheN1Entity();
        	entity.setIdFicheN1(dto.getIdFicheN1()) ;
        	entity.setPlanRef(dto.getPlanRef());   
        	entity.setPlancher(dto.getPlancher());   
        	entity.setSituation(dto.getSituation());   
        	entity.setDateFiche(dto.getDateFiche());   
        	entity.setCoffrageConforme(dto.getCoffrageConforme());   
        	entity.setCoffrageObservation(dto.getCoffrageObservation());   
        	entity.setLimiteCoffrageConforme(dto.getLimiteCoffrageConforme());   
        	entity.setLimiteCoffrageObservation(dto.getLimiteCoffrageObservation());   
        	entity.setPoteauxCoffrageConforme(dto.getPoteauxCoffrageConforme());   
        	entity.setPoteauxCoffrageObservation(dto.getPoteauxCoffrageObservation());   
        	entity.setVoilesCoffrageConforme(dto.getVoilesCoffrageConforme());   
        	entity.setVoilesCoffrageObservation(dto.getVoilesCoffrageObservation());   
        	entity.setOuvertureCoffrageConforme(dto.getOuvertureCoffrageConforme());   
        	entity.setOuvertureCoffrageObservation(dto.getOuvertureCoffrageObservation());   
        	entity.setElectriciteConforme(dto.getElectriciteConforme());   
        	entity.setElectriciteObservation(dto.getElectriciteObservation());   
        	entity.setEscalierConforme(dto.getEscalierConforme());   
        	entity.setEscalierObservation(dto.getEscalierObservation());   
        	entity.setMagasinConforme(dto.getMagasinConforme());   
        	entity.setMagasinObservation(dto.getMagasinObservation());   
        	entity.setEnvHygiensConforme(dto.getEnvHygiensConforme());   
        	entity.setEnvHygiensObservation(dto.getEnvHygiensObservation());   
        	entity.setMoyenLevageManutentionConforme(dto.getMoyenLevageManutentionConforme());   
        	entity.setMoyenLevageManutentionObservation(dto.getMoyenLevageManutentionObservation());   
        	entity.setGardesCorpsConforme(dto.getGardesCorpsConforme());   
        	entity.setGardesCorpsObservation(dto.getGardesCorpsObservation());   
        	entity.setIdProjet(dto.getIdProjet());   
        	entity.setIdChantier(dto.getIdChantier());   
        	entity.setIdClient(dto.getIdClient());   
		}
		
		return  entity;
    }
    /**
     * Convert list FicheN1Dto -> list FicheN1Entity
     * @param List<FicheN1Dto>
     */
    public static List<FicheN1Entity> dtosToEntities(List<FicheN1Dto> listDto){
		List<FicheN1Entity> list = new ArrayList<>();
 		if(Functions.isNotEmpty(listDto)){
        	for(FicheN1Dto dto:listDto){
    			list.add(dtoToEntity(dto));
    		}
		}
        return list;
    }
    /**
     * Convert list FicheN1Entity -> list FicheN1Dto
     * @param List<FicheN1Entity>
     */
    public static List<FicheN1Dto> entitiesToDtos(List<FicheN1Entity> listEntity){
		List<FicheN1Dto> list = new ArrayList<>();
		if(Functions.isNotEmpty(listEntity)){
        	for(FicheN1Entity entity:listEntity){
    			list.add(entityToDto(entity));
    		}
		}
        return list;
    }
}