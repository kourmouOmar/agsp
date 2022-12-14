package com.kmv.agsp.entities;



 
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Persistent class for entity stored in table "utilisateur"
 */

@Entity
@Table(name="utilisateur")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UtilisateurEntity extends AbstractCommonEntity<Long>  implements Cloneable  {
 
    private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_utilisateur", nullable = false)
    private Long idUtilisateur ;

    @Column(name="nom", nullable=false, length=255)
    private String nom ;
    @Column(name="prenom", nullable=false, length=255)
    private String prenom ;
    @Column(name="telephone", length=255)
    private String telephone ;
    @Column(name="email", length=255)
    private String email ;
    @Column(name="cin", length=255)
    private String cin ;
    @Column(name="username", nullable=false, length=255)
    private String username ;
    @Column(name="active")
    private Boolean active ;
    @Column(name="bloque")
    private Boolean bloque ;
    @Column(name="password", nullable=false, length=255)
    private String password ;
    @Column(name="roles", length=255)
    private String roles ;


     @Override
	 public Long getId() {
		return idUtilisateur;
	} 
 
  
   
}
