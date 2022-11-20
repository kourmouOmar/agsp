package com.kmv.agsp.controllers.dto;




import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.kmv.agsp.entities.FicheN2Entity;
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
public class FicheN2Dto implements Serializable {

private static final long serialVersionUID = 1L;

    private Long idFicheN2    ;
    @Size(max=255)
    private String planRef;
    @Size(max=255)
    private String plancher;
    @Size(max=255)
    private String situation;
    private Date dateFiche;
    private Boolean controleVisuel;
    private Boolean alignementtFerraillage;
    private Boolean controleDesMesures;
    private Boolean positionement;
    private Boolean recouvrement;
    private Boolean miseEnPlaceDesCales;
    private Boolean cagesAssemblesAuxPlans;
    private Boolean nombrePlans;
    private Boolean diametrePlan;
    private Boolean positionCadresEpingles;
    private Boolean alignementCables;
    private Boolean positionementCable;
    private Boolean misePlaceTreteaux;
    private Boolean nbrCableInstalle;
    private Boolean typeAncrage;
    @Size(max=255)
    private String observation;
    private Long idProjet;
    private Long idChantier;
    private Long idClient;
	// Relations
    private List<ChantierDto> listOfChantierDto;  

	// Relation Enum
	public enum FicheN2RelationsEnum {
    	listOfChantier; 
	}
   
	/**
     * Convert FicheN2Entity -> FicheN2Dto
     * @return FicheN2Dto
     */
    public static FicheN2Dto entityToDto(FicheN2Entity entity){
		FicheN2Dto dto = null;
		if(entity != null){
			dto = new FicheN2Dto();
        	dto.setIdFicheN2(entity.getIdFicheN2());
        	dto.setPlanRef(entity.getPlanRef());  
        	dto.setPlancher(entity.getPlancher());  
        	dto.setSituation(entity.getSituation());  
        	dto.setDateFiche(entity.getDateFiche());  
        	dto.setControleVisuel(entity.getControleVisuel());  
        	dto.setAlignementtFerraillage(entity.getAlignementtFerraillage());  
        	dto.setControleDesMesures(entity.getControleDesMesures());  
        	dto.setPositionement(entity.getPositionement());  
        	dto.setRecouvrement(entity.getRecouvrement());  
        	dto.setMiseEnPlaceDesCales(entity.getMiseEnPlaceDesCales());  
        	dto.setCagesAssemblesAuxPlans(entity.getCagesAssemblesAuxPlans());  
        	dto.setNombrePlans(entity.getNombrePlans());  
        	dto.setDiametrePlan(entity.getDiametrePlan());  
        	dto.setPositionCadresEpingles(entity.getPositionCadresEpingles());  
        	dto.setAlignementCables(entity.getAlignementCables());  
        	dto.setPositionementCable(entity.getPositionementCable());  
        	dto.setMisePlaceTreteaux(entity.getMisePlaceTreteaux());  
        	dto.setNbrCableInstalle(entity.getNbrCableInstalle());  
        	dto.setTypeAncrage(entity.getTypeAncrage());  
        	dto.setObservation(entity.getObservation());  
        	dto.setIdProjet(entity.getIdProjet());  
        	dto.setIdChantier(entity.getIdChantier());  
        	dto.setIdClient(entity.getIdClient());  
		}
		return  dto;
    }
	/**
     * Convert FicheN2Dto -> FicheN2Entity
     * @param FicheN2Dto
     */
    public static FicheN2Entity dtoToEntity(FicheN2Dto dto){
		FicheN2Entity entity = null;
		if(dto != null){
			entity = new FicheN2Entity();
        	entity.setIdFicheN2(dto.getIdFicheN2()) ;
        	entity.setPlanRef(dto.getPlanRef());   
        	entity.setPlancher(dto.getPlancher());   
        	entity.setSituation(dto.getSituation());   
        	entity.setDateFiche(dto.getDateFiche());   
        	entity.setControleVisuel(dto.getControleVisuel());   
        	entity.setAlignementtFerraillage(dto.getAlignementtFerraillage());   
        	entity.setControleDesMesures(dto.getControleDesMesures());   
        	entity.setPositionement(dto.getPositionement());   
        	entity.setRecouvrement(dto.getRecouvrement());   
        	entity.setMiseEnPlaceDesCales(dto.getMiseEnPlaceDesCales());   
        	entity.setCagesAssemblesAuxPlans(dto.getCagesAssemblesAuxPlans());   
        	entity.setNombrePlans(dto.getNombrePlans());   
        	entity.setDiametrePlan(dto.getDiametrePlan());   
        	entity.setPositionCadresEpingles(dto.getPositionCadresEpingles());   
        	entity.setAlignementCables(dto.getAlignementCables());   
        	entity.setPositionementCable(dto.getPositionementCable());   
        	entity.setMisePlaceTreteaux(dto.getMisePlaceTreteaux());   
        	entity.setNbrCableInstalle(dto.getNbrCableInstalle());   
        	entity.setTypeAncrage(dto.getTypeAncrage());   
        	entity.setObservation(dto.getObservation());   
        	entity.setIdProjet(dto.getIdProjet());   
        	entity.setIdChantier(dto.getIdChantier());   
        	entity.setIdClient(dto.getIdClient());   
		}
		
		return  entity;
    }
    /**
     * Convert list FicheN2Dto -> list FicheN2Entity
     * @param List<FicheN2Dto>
     */
    public static List<FicheN2Entity> dtosToEntities(List<FicheN2Dto> listDto){
		List<FicheN2Entity> list = new ArrayList<>();
 		if(Functions.isNotEmpty(listDto)){
        	for(FicheN2Dto dto:listDto){
    			list.add(dtoToEntity(dto));
    		}
		}
        return list;
    }
    /**
     * Convert list FicheN2Entity -> list FicheN2Dto
     * @param List<FicheN2Entity>
     */
    public static List<FicheN2Dto> entitiesToDtos(List<FicheN2Entity> listEntity){
		List<FicheN2Dto> list = new ArrayList<>();
		if(Functions.isNotEmpty(listEntity)){
        	for(FicheN2Entity entity:listEntity){
    			list.add(entityToDto(entity));
    		}
		}
        return list;
    }
}