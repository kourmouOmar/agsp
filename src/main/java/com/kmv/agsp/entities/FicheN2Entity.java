package com.kmv.agsp.entities;



 
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Persistent class for entity stored in table "fiche_n2"
 */

@Entity
@Table(name="fiche_n2")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class FicheN2Entity extends AbstractCommonEntity<Long>  implements Cloneable  {

 
    private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_fiche_n2", nullable = false)
    private Long idFicheN2 ;

    @Column(name="plan_ref", length=255)
    private String planRef ;
    @Column(name="plancher", length=255)
    private String plancher ;
    @Column(name="situation", length=255)
    private String situation ;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="date_fiche")
    private Date dateFiche ;
    @Column(name="controle_visuel")
    private Boolean controleVisuel ;
    @Column(name="alignementt_ferraillage")
    private Boolean alignementtFerraillage ;
    @Column(name="controle_des_mesures")
    private Boolean controleDesMesures ;
    @Column(name="positionement")
    private Boolean positionement ;
    @Column(name="recouvrement")
    private Boolean recouvrement ;
    @Column(name="mise_en_place_des_cales")
    private Boolean miseEnPlaceDesCales ;
    @Column(name="cages_assembles_aux_plans")
    private Boolean cagesAssemblesAuxPlans ;
    @Column(name="nombre_plans")
    private Boolean nombrePlans ;
    @Column(name="diametre_plan")
    private Boolean diametrePlan ;
    @Column(name="position_cadres_epingles")
    private Boolean positionCadresEpingles ;
    @Column(name="alignement_cables")
    private Boolean alignementCables ;
    @Column(name="positionement_cable")
    private Boolean positionementCable ;
    @Column(name="mise_place_treteaux")
    private Boolean misePlaceTreteaux ;
    @Column(name="nbr_cable_installe")
    private Boolean nbrCableInstalle ;
    @Column(name="type_ancrage")
    private Boolean typeAncrage ;
    @Column(name="observation", length=255)
    private String observation ;
    @Column(name="id_projet")
    private Long idProjet ;
    @Column(name="id_chantier")
    private Long idChantier ;
    @Column(name="id_client")
    private Long idClient ;

    @OneToMany(mappedBy="ficheN2", targetEntity=ChantierEntity.class)
    private List<ChantierEntity> listOfChantier;


     @Override
	 public Long getId() {
		return idFicheN2;
	} 
 
  
   
}
