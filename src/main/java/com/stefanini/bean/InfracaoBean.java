package com.stefanini.bean;



import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.stefanini.model.Infracoes;
import com.stefanini.service.InfracaoService;

@RequestScoped
@Named("infracaoMB")
public class InfracaoBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Inject
	private Infracoes infracao;
	
	@Inject
	private InfracaoService infracaoService;
	
	public Infracoes getInfracao() {
		return infracao;
	}

	public void setInfracao(Infracoes infracao) {
		this.infracao = infracao;
	}

	public InfracaoService getInfracaoService() {
		return infracaoService;
	}
	
	public void setInfracaoService(InfracaoService infracaoService) {
		this.infracaoService = infracaoService;
	}


	public String salvarAgente(){
		infracaoService.incluir(infracao);
	   return "/index.xhtml";
   }
   
    
}
