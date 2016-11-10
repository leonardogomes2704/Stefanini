package com.stefanini.repository;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import com.stefanini.model.Telefone;

public class TelefoneRepository {
	
	@Inject
	private EntityManager manager;
	
	public void incluir(Telefone telefone) {
		this.manager.persist(telefone);
	}
	
	public List<Telefone> lista() {
		return this.manager.createQuery("select c from Telefone c", Telefone.class).getResultList();
	}
}

