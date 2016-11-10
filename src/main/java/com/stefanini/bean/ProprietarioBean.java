package com.stefanini.bean;



import java.io.Serializable;
import java.util.ArrayList;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.stefanini.model.Categoria;
import com.stefanini.model.Proprietario;
import com.stefanini.service.ProprietarioService;

@SessionScoped
@Named("proprietarioMB")
public class ProprietarioBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Inject
	private Proprietario proprietario;
	
	@Inject
	private ProprietarioService  proprietarioService;
	
	
   public Proprietario getProprietario() {
		return proprietario;
	}


	public void setProprietario(Proprietario proprietario) {
		this.proprietario = proprietario;
	}


	public ProprietarioService getProprietarioService() {
		return proprietarioService;
	}

	public void setProprietarioService(ProprietarioService proprietarioService) {
		this.proprietarioService = proprietarioService;
	}
	
	public Proprietario buscar(String cpf) {
		return proprietarioService.buscar(cpf);
	}

	public ArrayList<Proprietario> listaProprietario(){
		return (ArrayList<Proprietario>) proprietarioService.listar(proprietario);
		
	}
	public String salvarProprietario(){
	   proprietarioService.incluir(proprietario);
	   return "/index.xhtml";
   }
   
    
}
