package com.stefanini.bean;



import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.stefanini.model.Telefone;
import com.stefanini.service.TelefoneService;

@RequestScoped
@Named("telefoneMB")
public class TelefoneBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Inject
	private Telefone telefone;
	
	@Inject
	private TelefoneService telefoneService;
	
	@Inject
	private ProprietarioBean proprietarioBean;
	
	@Inject
	private TipoTelefoneBean tipoTelefoneBean;
	
	private String cpf;
	
	private Integer idTipoTelefone;
	
	
	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Integer getIdTipoTelefone() {
		return idTipoTelefone;
	}

	public void setIdTipoTelefone(Integer idTipoTelefone) {
		this.idTipoTelefone = idTipoTelefone;
	}

	public Telefone getTelefone() {
		return telefone;
	}

	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}

	public TelefoneService getTelefoneService() {
		return telefoneService;
	}

	public void setTelefoneService(TelefoneService telefoneService) {
		this.telefoneService = telefoneService;
	}

	public ProprietarioBean getProprietarioBean() {
		return proprietarioBean;
	}

	public void setProprietarioBean(ProprietarioBean proprietarioBean) {
		this.proprietarioBean = proprietarioBean;
	}

	public TipoTelefoneBean getTipoTelefoneBean() {
		return tipoTelefoneBean;
	}

	public void setTipoTelefoneBean(TipoTelefoneBean tipoTelefoneBean) {
		this.tipoTelefoneBean = tipoTelefoneBean;
	}

	public String salvarTelefone(){
		telefone.setTipotelefone(tipoTelefoneBean.buscar(idTipoTelefone));
		telefone.setProprietario(proprietarioBean.buscar(cpf.trim()));
		telefoneService.incluir(telefone);
	   return "/index.xhtml";
   }
   
    
}
