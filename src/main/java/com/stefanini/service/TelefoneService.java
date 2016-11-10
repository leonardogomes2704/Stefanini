package com.stefanini.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;

import com.stefanini.model.Telefone;
import com.stefanini.repository.TelefoneRepository;

@Stateless
public class TelefoneService {
	
	@Inject
	private TelefoneRepository telefoneRepository;

	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void incluir(Telefone telefone) {
		telefoneRepository.incluir(telefone);
		
	}
	
	public List<Telefone> listar(Telefone telefone){
		return telefoneRepository.lista();
	}
}
