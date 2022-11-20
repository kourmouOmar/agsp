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
 * Persistent class for entity stored in table "fiche_n1"
 */

@Entity
@Table(name="fiche_n1")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class FicheN1Entity extends AbstractCommonEntity<Long>  implements Cloneable  {

 
    private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_fiche_n1", nullable = false)
    private Long idFicheN1 ;

    @Column(name="plan_ref", length=255)
    private String planRef ;
    @Column(name="plancher", length=255)
    private String plancher ;
    @Column(name="situation", length=255)
    private String situation ;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="date_fiche")
    private Date dateFiche ;
    @Column(name="coffrage_conforme")
    private Boolean coffrageConforme ;
    @Column(name="coffrage_observation", length=255)
    private String coffrageObservation ;
    @Column(name="limite_coffrage_conforme")
    private Boolean limiteCoffrageConforme ;
    @Column(name="limite_coffrage_observation", length=255)
    private String limiteCoffrageObservation ;
    @Column(name="poteaux_coffrage_conforme")
    private Boolean poteauxCoffrageConforme ;
    @Column(name="poteaux_coffrage_observation", length=255)
    private String poteauxCoffrageObservation ;
    @Column(name="voiles_coffrage_conforme")
    private Boolean voilesCoffrageConforme ;
    @Column(name="voiles_coffrage_observation", length=255)
    private String voilesCoffrageObservation ;
    @Column(name="ouverture_coffrage_conforme")
    private Boolean ouvertureCoffrageConforme ;
    @Column(name="ouverture_coffrage_observation", length=255)
    private String ouvertureCoffrageObservation ;
    @Column(name="electricite_conforme")
    private Boolean electriciteConforme ;
    @Column(name="electricite_observation", length=255)
    private String electriciteObservation ;
    @Column(name="escalier_conforme")
    private Boolean escalierConforme ;
    @Column(name="escalier_observation", length=255)
    private String escalierObservation ;
    @Column(name="magasin_conforme")
    private Boolean magasinConforme ;
    @Column(name="magasin_observation", length=255)
    private String magasinObservation ;
    @Column(name="env_hygiens_conforme")
    private Boolean envHygiensConforme ;
    @Column(name="env_hygiens_observation", length=255)
    private String envHygiensObservation ;
    @Column(name="moyen_levage_manutention_conforme")
    private Boolean moyenLevageManutentionConforme ;
    @Column(name="moyen_levage_manutention_observation", length=255)
    private String moyenLevageManutentionObservation ;
    @Column(name="gardes_corps_conforme")
    private Boolean gardesCorpsConforme ;
    @Column(name="gardes_corps_observation", length=255)
    private String gardesCorpsObservation ;
    @Column(name="id_projet")
    private Long idProjet ;
    @Column(name="id_chantier")
    private Long idChantier ;
    @Column(name="id_client")
    private Long idClient ;

    @OneToMany(mappedBy="ficheN1", targetEntity=ChantierEntity.class)
    private List<ChantierEntity> listOfChantier;


     @Override
	 public Long getId() {
		return idFicheN1;
	} 
 
  
   
}
