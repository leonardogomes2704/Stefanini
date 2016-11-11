package com.stefanini.repository;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import com.stefanini.model.Proprietario;

public class ProprietarioRepository {
	@Inject
	private EntityManager manager;
	
	public void incluir(Proprietario proprietario) {
		this.manager.persist(proprietario);
	}
	
	public List<Proprietario> lista() {
		return this.manager.createQuery("select c from Proprietario c", Proprietario.class)
				.getResultList();
	}
	
	public List<Proprietario>  buscar(String cpf ) {
		return this.manager.createQuery("SELECT p FROM Proprietario p WHERE p.cpfProprietario='"+cpf+"'").getResultList();
	}
}

