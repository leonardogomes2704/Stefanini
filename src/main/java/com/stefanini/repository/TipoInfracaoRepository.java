package com.stefanini.repository;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import com.stefanini.model.Tipoinfracao;

public class TipoInfracaoRepository {
	
	@Inject
	private EntityManager manager;
	
	public void incluir(Tipoinfracao tipoInfracao) {
		this.manager.persist(tipoInfracao);
	}
	
	public List<Tipoinfracao> lista() {
		return this.manager.createQuery("select c from Tipoinfracao c", Tipoinfracao.class)
				.getResultList();
	}
}

