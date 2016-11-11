package com.stefanini.bean;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.stefanini.model.Modelo;
import com.stefanini.service.ModeloService;

@RequestScoped
@Named("modeloMB")
public class ModeloBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Inject
	private Modelo modelo;
	
	@Inject
	private CategoriaBean categoriaBean;
	
	@Inject
	private ModeloService modeloService;
	
	private Integer idCategoria;
	
	public Integer getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(Integer idCategoria) {
		this.idCategoria = idCategoria;
	}

	public Modelo getModelo() {
		return modelo;
	}

	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}

	public ModeloService getModeloService() {
		return modeloService;
	}

	public void setModeloService(ModeloService modeloService) {
		this.modeloService = modeloService;
	}
	
	public String salvarModelo(){
		  modelo.setCategoria(categoriaBean.buscar(idCategoria));	
		  modeloService.incluir(modelo);
		  return "/index.xhtml";
	   }
	public Modelo buscar(int idModelo) {
		return modeloService.buscar(idCategoria);
	}
}
