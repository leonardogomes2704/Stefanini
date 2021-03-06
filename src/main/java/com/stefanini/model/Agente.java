package com.stefanini.model;
// Generated 07/11/2016 12:12:48 by Hibernate Tools 4.3.1.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Agente generated by hbm2java
 */
@Entity
@Table(name = "agente", catalog = "hackathon")
public class Agente implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "idAgente", unique = true, nullable = false)
	private Integer idAgente;
	
	@Column(name = "nome", length = 100)
	private String nome;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "dtContratacao", length = 10)
	private Date dtContratacao;
	
	@Column(name = "tempoServico")
	private Integer tempoServico;
	
	@Column(name = "cpfAgente")
	private String cpfAgente;
	

	public Agente() {
	}

	public Agente(String nome, Date dtContratacao, Integer tempoServico) {
		this.nome = nome;
		this.dtContratacao = dtContratacao;
		this.tempoServico = tempoServico;
	}


	public Integer getIdAgente() {
		return this.idAgente;
	}

	public void setIdAgente(Integer idAgente) {
		this.idAgente = idAgente;
	}

	
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


	public Date getDtContratacao() {
		return this.dtContratacao;
	}

	public void setDtContratacao(Date dtContratacao) {
		this.dtContratacao = dtContratacao;
	}

	public Integer getTempoServico() {
		return this.tempoServico;
	}

	public void setTempoServico(Integer tempoServico) {
		this.tempoServico = tempoServico;
	}

	public String getCpfAgente() {
		return cpfAgente;
	}

	public void setCpfAgente(String cpfAgente) {
		this.cpfAgente = cpfAgente;
	}

	
	

}
