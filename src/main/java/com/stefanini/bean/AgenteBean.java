package com.stefanini.bean;



import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.stefanini.model.Agente;
import com.stefanini.service.AgenteService;

@RequestScoped
@Named("agenteMB")
public class AgenteBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Inject
	private Agente agente;
	
	@Inject
	private AgenteService agenteService;
	
	
   public Agente getAgente() {
		return agente;
	}

	public void setAgente(Agente agente) {
		this.agente = agente;
	}

	public AgenteService getAgenteService() {
		return agenteService;
	}

	public void setAgenteService(AgenteService agenteService) {
		this.agenteService = agenteService;
	}


   
   public String salvarAgente(){
	   agenteService.incluir(agente);
	   return "/index.xhtml";
   }
   
    
}
