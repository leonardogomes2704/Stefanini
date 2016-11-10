package com.stefanini.repository;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import com.stefanini.model.Veiculo;

public class VeiculoRepository {
	@Inject
	private EntityManager manager;
	
	public void incluir(Veiculo veiculo) {
		this.manager.persist(veiculo);
	}
	
	public List<Veiculo> lista() {
		return this.manager.createQuery("select c from Veiculo c", Veiculo.class)
				.getResultList();
	}
}
