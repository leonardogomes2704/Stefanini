package com.stefanini.repository;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import com.stefanini.model.Categoria;

public class CategoriaRepository {
	@Inject
	private EntityManager manager;
	
	public void incluir(Categoria categoria) {
		this.manager.persist(categoria);
	}
	
	public List<Categoria> lista() {
		return this.manager.createQuery("select c from Categoria c", Categoria.class)
				.getResultList();
	}

	public void buscar(Integer idCategoria) {
	
		
	}
	public Categoria buscar(int idCaegoria ) {
		return this.manager.find(Categoria.class, idCaegoria);
	}
}
