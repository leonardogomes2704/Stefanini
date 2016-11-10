package com.stefanini.repository;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import com.stefanini.model.Infracoes;

public class InfracaoRepository {

	@Inject
	private EntityManager manager;
	
	public void incluir(Infracoes infracao) {
		this.manager.persist(infracao);
	}
	
	public List<Infracoes> lista() {
		return this.manager.createQuery("select c from Infracoes c", Infracoes.class).getResultList();
	}
	
	public Infracoes buscar(int idInfracao ) {
		return this.manager.find(Infracoes.class, idInfracao);
	}
}
