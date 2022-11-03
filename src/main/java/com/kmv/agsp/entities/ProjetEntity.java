package com.kmv.agsp.entities;


 
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Persistent class for entity stored in table "projet"
 */

@Entity
@Table(name="projet")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ProjetEntity extends AbstractCommonEntity<Long>  implements Cloneable  {

 
    private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_projet", nullable = false)
    private Long idProjet ;

    @Column(name="numero", nullable=false, length=255)
    private String numero ;
    @Column(name="designation", nullable=false, length=255)
    private String designation ;
    @Column(name="active")
    private Boolean active ;
    @Column(name="email_responsable", length=255)
    private String emailResponsable ;
    @Column(name="telephone_responsable", length=255)
    private String telephoneResponsable ;
    @Column(name="nom_complet_responsable", length=255)
    private String nomCompletResponsable ;
	
    @OneToMany(mappedBy="projet", targetEntity=ChantierEntity.class)
    private List<ChantierEntity> listOfChantier;

    @ManyToOne
    @JoinColumn(name="id_client", referencedColumnName="id_client")
    private ClientEntity client;


     @Override
	 public Long getId() {
		return idProjet;
	} 
 
  
   
}
