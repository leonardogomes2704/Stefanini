package com.stefanini.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;

import com.stefanini.model.Categoria;
import com.stefanini.repository.CategoriaRepository;

@Stateless
public class CategoriaService {
	
	@Inject
	private CategoriaRepository categoriaRepository;
	
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void incluir(Categoria categoria) {
		categoriaRepository.incluir(categoria);
		
	}
	public List<Categoria> listar(Categoria categoria){
		return categoriaRepository.lista();
	}
	
	public Categoria buscar(int idCategoria) {
		return categoriaRepository.buscar(idCategoria);
	}

}
