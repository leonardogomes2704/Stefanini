package com.stefanini.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;

import com.stefanini.model.Modelo;
import com.stefanini.repository.ModeloRepository;

@Stateless
public class ModeloService {

	@Inject
	private ModeloRepository modeloRepository;

	public ModeloRepository getModeloRepository() {
		return modeloRepository;
	}

	public void setModeloRepository(ModeloRepository modeloRepository) {
		this.modeloRepository = modeloRepository;
	}
	
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void incluir(Modelo modelo) {
		modeloRepository.incluir(modelo);
		
	}
	
	public List<Modelo> listar(Modelo modelo){
		return modeloRepository.lista();
	}
	
	public Modelo buscar(int idModelo) {
		return modeloRepository.buscar(idModelo);
	}
	
}
