package com.kmv.agsp.entities;


 
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Persistent class for entity stored in table "chantier"
 */

@Entity
@Table(name="chantier")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ChantierEntity extends AbstractCommonEntity<Long>  implements Cloneable  {

 
    private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_chantier", nullable = false)
    private Long idChantier ;

    @Column(name="numero", nullable=false, length=255)
    private String numero ;
    @Column(name="designation", nullable=false, length=255)
    private String designation ;
    @Column(name="description", length=255)
    private String description ;
	
    @ManyToOne
    @JoinColumn(name="id_projet", referencedColumnName="id_projet")
    private ProjetEntity projet;


     @Override
	 public Long getId() {
		return idChantier;
	} 
 
  
   
}
