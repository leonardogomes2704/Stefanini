package com.stefanini.model;
// Generated 07/11/2016 12:12:48 by Hibernate Tools 4.3.1.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Infracoes generated by hbm2java
 */
@Entity
@Table(name = "infracoes", catalog = "hackathon")
public class Infracoes implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "idInfracao", unique = true, nullable = false)
	private Integer idInfracao;
	
	@Column(name = "idAgente", nullable = false)
	private int idAgente;
	
	@Column(name = "idLocalInfracao", nullable = false)
	private int idLocalInfracao;
	
	@Column(name = "idTipoInfracao", nullable = false)
	private int idTipoInfracao;
	
	@Column(name = "placa", nullable = false, length = 7)
	private String placa;
	
	@Column(name = "velocidade")
	private Integer velocidade;

	public Infracoes() {
	}

	public Infracoes(int idAgente, int idLocalInfracao, int idTipoInfracao, String placa) {
		this.idAgente = idAgente;
		this.idLocalInfracao = idLocalInfracao;
		this.idTipoInfracao = idTipoInfracao;
		this.placa = placa;
	}

	public Infracoes(int idAgente, int idLocalInfracao, int idTipoInfracao, String placa, Integer velocidade) {
		this.idAgente = idAgente;
		this.idLocalInfracao = idLocalInfracao;
		this.idTipoInfracao = idTipoInfracao;
		this.placa = placa;
		this.velocidade = velocidade;
	}


	public Integer getIdInfracao() {
		return this.idInfracao;
	}

	public void setIdInfracao(Integer idInfracao) {
		this.idInfracao = idInfracao;
	}

	
	public int getIdAgente() {
		return this.idAgente;
	}

	public void setIdAgente(int idAgente) {
		this.idAgente = idAgente;
	}

	
	public int getIdLocalInfracao() {
		return this.idLocalInfracao;
	}

	public void setIdLocalInfracao(int idLocalInfracao) {
		this.idLocalInfracao = idLocalInfracao;
	}

	
	public int getIdTipoInfracao() {
		return this.idTipoInfracao;
	}

	public void setIdTipoInfracao(int idTipoInfracao) {
		this.idTipoInfracao = idTipoInfracao;
	}

	
	public String getPlaca() {
		return this.placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	
	public Integer getVelocidade() {
		return this.velocidade;
	}

	public void setVelocidade(Integer velocidade) {
		this.velocidade = velocidade;
	}

}