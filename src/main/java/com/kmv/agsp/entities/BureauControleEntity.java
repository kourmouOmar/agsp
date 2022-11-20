package com.kmv.agsp.entities;



 
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Persistent class for entity stored in table "bureau_controle"
 */

@Entity
@Table(name="bureau_controle")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class BureauControleEntity extends AbstractCommonEntity<Long>  implements Cloneable  {

 
    private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_bureau_controle", nullable = false)
    private Long idBureauControle ;

    @Column(name="numero", nullable=false, length=255)
    private String numero ;
    @Column(name="designation", nullable=false, length=255)
    private String designation ;
    @Column(name="description", length=255)
    private String description ;
    @Column(name="fax", length=255)
    private String fax ;
    @Column(name="email_responsable", length=255)
    private String emailResponsable ;
    @Column(name="telephone_responsable", length=255)
    private String telephoneResponsable ;
    @Column(name="nom_complet_responsable", length=255)
    private String nomCompletResponsable ;

    @OneToMany(mappedBy="bureauControle", targetEntity=ProjetEntity.class)
    private List<ProjetEntity> listOfProjet;


     @Override
	 public Long getId() {
		return idBureauControle;
	} 
 
  
   
}
