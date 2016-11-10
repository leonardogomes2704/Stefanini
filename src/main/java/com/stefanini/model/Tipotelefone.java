package com.stefanini.model;
// Generated 07/11/2016 12:12:48 by Hibernate Tools 4.3.1.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Tipotelefone generated by hbm2java
 */
@Entity
@Table(name = "tipotelefone", catalog = "hackathon")
public class Tipotelefone implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "idTipoTelefone", unique = true, nullable = false)
	private Integer idTipoTelefone;
	
	@Column(name = "descricaoTipoTelefone", length = 20)
	private String descricaoTipoTelefone;

	public Tipotelefone() {
	}

	public Tipotelefone(String descricaoTipoTelefone) {
		this.descricaoTipoTelefone = descricaoTipoTelefone;
	}


	public Integer getIdTipoTelefone() {
		return this.idTipoTelefone;
	}

	public void setIdTipoTelefone(Integer idTipoTelefone) {
		this.idTipoTelefone = idTipoTelefone;
	}

	
	public String getDescricaoTipoTelefone() {
		return this.descricaoTipoTelefone;
	}

	public void setDescricaoTipoTelefone(String descricaoTipoTelefone) {
		this.descricaoTipoTelefone = descricaoTipoTelefone;
	}

}
