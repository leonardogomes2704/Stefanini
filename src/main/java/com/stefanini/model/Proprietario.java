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
 * Proprietario generated by hbm2java
 */
@Entity
@Table(name = "proprietario", catalog = "hackathon")
public class Proprietario implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "idProprietario", unique = true, nullable = false)
	private Integer idProprietario;
	
	@Column(name = "cpfProprietario", nullable = false)
	private String cpfProprietario;
	
	@Column(name = "nome", length = 100)
	private String nome;
	
	@Column(name = "endereco", length = 100)
	private String endereco;
	
	@Column(name = "bairro", length = 100)
	private String bairro;
	
	@Column(name = "cidade", length = 100)
	private String cidade;
	
	@Column(name = "uf", length = 2)
	private String uf;
	
	@Column(name = "sexo", length = 1)
	private String sexo;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "dtNascimento", length = 10)
	private Date dtNascimento;

	public Proprietario() {
	}

	public Proprietario(String nome, String endereco, String bairro, String cidade, String uf, String sexo,
			Date dtNascimento) {
		this.nome = nome;
		this.endereco = endereco;
		this.bairro = bairro;
		this.cidade = cidade;
		this.uf = uf;
		this.sexo = sexo;
		this.dtNascimento = dtNascimento;
	}

	public Integer getIdProprietario() {
		return this.idProprietario;
	}
	
	public void setIdProprietario(Integer idProprietario) {
		this.idProprietario = idProprietario;
	}

	
	public String getCpfProprietario() {
		return this.cpfProprietario;
	}

	public void setCpfProprietario(String cpfProprietario) {
		this.cpfProprietario = cpfProprietario;
	}

	
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	
	public String getEndereco() {
		return this.endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public String getBairro() {
		return this.bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	
	public String getCidade() {
		return this.cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	
	public String getUf() {
		return this.uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	
	public String getSexo() {
		return this.sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}


	public Date getDtNascimento() {
		return this.dtNascimento;
	}

	public void setDtNascimento(Date dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

}
