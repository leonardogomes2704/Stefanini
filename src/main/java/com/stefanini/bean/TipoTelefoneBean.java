package com.stefanini.bean;



import java.io.Serializable;
import java.util.ArrayList;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.stefanini.model.Tipotelefone;
import com.stefanini.service.TipoTelefoneService;

@RequestScoped
@Named("tipoTelefoneMB")
public class TipoTelefoneBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Inject
	private Tipotelefone tipoTelefone;
	
	@Inject
	private TipoTelefoneService tipoTelefoneService;
	
	
      
   public Tipotelefone getTipoTelefone() {
		return tipoTelefone;
	}

	public void setTipoTelefone(Tipotelefone tipoTelefone) {
		this.tipoTelefone = tipoTelefone;
	}

	public TipoTelefoneService getTipoTelefoneService() {
		return tipoTelefoneService;
	}

	public void setTipoTelefoneService(TipoTelefoneService tipoTelefoneService) {
		this.tipoTelefoneService = tipoTelefoneService;
	}

	public String salvarTipoTelefone(){
	   tipoTelefoneService.incluir(tipoTelefone);
	   return "/index.xhtml";
   }
	
	public Tipotelefone buscar(int idTipoTelefone) {
		return tipoTelefoneService.buscar(idTipoTelefone);
	}
	public ArrayList<Tipotelefone> listaTipoTelefone(){
		return (ArrayList<Tipotelefone>) tipoTelefoneService.listar(tipoTelefone);
		
	}
    
}
