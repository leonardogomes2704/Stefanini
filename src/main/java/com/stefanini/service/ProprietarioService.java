package com.stefanini.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;

import com.stefanini.model.Proprietario;
import com.stefanini.repository.ProprietarioRepository;

@Stateless
public class ProprietarioService {
	
	@Inject
	private ProprietarioRepository proprietarioRepository;

	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void incluir(Proprietario proprietario) {
		proprietarioRepository.incluir(proprietario);
		
	}
	
	public List<Proprietario> listar(Proprietario proprietario){
		return proprietarioRepository.lista();
	}
	
	public Proprietario buscar(String cpf) {
		ArrayList<Proprietario> proprietarios = new Proprietario();
		proprietarios.addAll(proprietarioRepository.buscar(cpf));
		if(proprietarios..size() == 0)
			return null;
		return proprietarios.get(0);
	}

}
