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
	
	public Proprietario buscar(String cpf ) {
		return (Proprietario) manager.createQuery("select c FROM Proprietario c where c.cpfProprietario = :cpfProprietario").setParameter("cpfProprietario", cpf);
	}
}

