package com.stefanini.bean;

import java.io.Serializable;
import java.util.ArrayList;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.stefanini.model.Categoria;
import com.stefanini.service.CategoriaService;

@RequestScoped
@Named("categoriaMB")
public class CategoriaBean implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Inject
	private Categoria categoria;
	
	@Inject
	private CategoriaService categoriaService;

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public CategoriaService getCategoriaService() {
		return categoriaService;
	}

	public void setCategoriaService(CategoriaService categoriaService) {
		this.categoriaService = categoriaService;
	}
	
	public String salvarCategoria(){
		categoriaService.incluir(categoria);
		return "/index.xhtml";
	}
	
	public ArrayList<Categoria> listaCategoria(){
		return (ArrayList<Categoria>) categoriaService.listar(categoria);
		
	}

	public Categoria buscar(int idCategoria) {
		return categoriaService.buscar(idCategoria);
	}

}
