package com.stefanini.bean;



import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.stefanini.model.Tipoinfracao;
import com.stefanini.service.TipoInfracaoService;

@RequestScoped
@Named("tipoInfracaoMB")
public class TipoInfracaoBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Inject
	private Tipoinfracao tipoInfracao;
	
	@Inject
	private TipoInfracaoService tipoInfracaoService;
	
   public Tipoinfracao getTipoInfracao() {
		return tipoInfracao;
	}

	public void setTipoInfracao(Tipoinfracao tipoInfracao) {
		this.tipoInfracao = tipoInfracao;
	}

	public TipoInfracaoService getTipoInfracaoService() {
		return tipoInfracaoService;
	}

	public void setTipoInfracaoService(TipoInfracaoService tipoInfracaoService) {
		this.tipoInfracaoService = tipoInfracaoService;
	}


	public String salvarTipoInfracao(){
	   tipoInfracaoService.incluir(tipoInfracao);
	   return "/index.xhtml";
   }
   
    
}
