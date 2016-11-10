package com.stefanini.bean;



import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.stefanini.model.Localinfracao;
import com.stefanini.service.LocalInfracaoService;

@RequestScoped
@Named("localInfracaoMB")
public class LocalInfracaoBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Inject
	private Localinfracao localInfracao;
	
	@Inject
	private LocalInfracaoService localInfracaoService;
	
	public Localinfracao getLocalinfracao() {
		return localInfracao;
	}

	public void setLocalinfracao(Localinfracao localinfracao) {
		this.localInfracao = localinfracao;
	}

	public LocalInfracaoService getLocalInfracaoService() {
		return localInfracaoService;
	}

	public void setLocalInfracaoService(LocalInfracaoService localInfracaoService) {
		this.localInfracaoService = localInfracaoService;
	}


	public String salvarLocalInfracao(){
	   localInfracaoService.incluir(localInfracao);
	   return "/index.xhtml";
   }
   
    
    
}
