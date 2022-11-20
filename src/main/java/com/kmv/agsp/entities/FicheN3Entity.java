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
 * Persistent class for entity stored in table "fiche_n3"
 */

@Entity
@Table(name="fiche_n3")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class FicheN3Entity extends AbstractCommonEntity<Long>  implements Cloneable  {

 
    private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_fiche_n3", nullable = false)
    private Long idFicheN3 ;

    @Column(name="plan_ref", length=255)
    private String planRef ;
    @Column(name="plancher", length=255)
    private String plancher ;
    @Column(name="situation", length=255)
    private String situation ;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="date_fiche")
    private Date dateFiche ;
    @Column(name="fissuration", length=255)
    private String fissuration ;
    @Column(name="enrobage", length=255)
    private String enrobage ;
    @Column(name="segregation", length=255)
    private String segregation ;
    @Column(name="observation", length=255)
    private String observation ;
    @Column(name="id_projet")
    private Long idProjet ;
    @Column(name="id_chantier")
    private Long idChantier ;
    @Column(name="id_client")
    private Long idClient ;

    @OneToMany(mappedBy="ficheN3", targetEntity=ChantierEntity.class)
    private List<ChantierEntity> listOfChantier;


     @Override
	 public Long getId() {
		return idFicheN3;
	} 
 
  
   
}
