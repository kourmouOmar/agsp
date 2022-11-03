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
 * Persistent class for entity stored in table "client"
 */

@Entity
@Table(name="client")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ClientEntity extends AbstractCommonEntity<Long>  implements Cloneable  {

 
    private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_client", nullable = false)
    private Long idClient ;

    @Column(name="a", nullable=false, length=255)
    private String a ;
    @Column(name="designation", nullable=false, length=255)
    private String designation ;
    @Column(name="adresse", length=255)
    private String adresse ;
    @Column(name="ville", length=255)
    private String ville ;
    @Column(name="nom_complet_contact", length=255)
    private String nomCompletContact ;
    @Column(name="ice", nullable=false, length=255)
    private String ice ;
    @Column(name="active")
    private Boolean active ;
    @Column(name="telephone", nullable=false, length=255)
    private String telephone ;
    @Column(name="fax", length=255)
    private String fax ;
    @Column(name="email", length=255)
    private String email ;

    @OneToMany(mappedBy="client", targetEntity=ProjetEntity.class)
    private List<ProjetEntity> listOfProjet;


     @Override
	 public Long getId() {
		return idClient;
	} 
 
  
   
}
