package com.stefanini.repository;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import com.stefanini.model.Proprietario;
import com.stefanini.model.Tipotelefone;

public class TipoTelefoneRepository {
	
	@Inject
	private EntityManager manager;
	
	public void incluir(Tipotelefone tipoTelefone) {
		this.manager.persist(tipoTelefone);
	}
	
	public List<Tipotelefone> lista() {
		return this.manager.createQuery("select c from Tipotelefone c", Tipotelefone.class)
				.getResultList();
	}
	
	public Tipotelefone buscar(int idTipoTelefone ) {
		return this.manager.find(Tipotelefone.class, idTipoTelefone);
	}
}

