package com.stefanini.repository;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import com.stefanini.model.Localinfracao;

public class LocalInfracaoRepository {
	
	@Inject
	private EntityManager manager;
	
	public void incluir(Localinfracao localinfracao) {
		this.manager.persist(localinfracao);
	}
	
	public List<Localinfracao> lista() {
		return this.manager.createQuery("select c from Localinfracao c", Localinfracao.class).getResultList();
	}
}
