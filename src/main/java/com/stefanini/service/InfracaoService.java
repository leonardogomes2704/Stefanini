package com.stefanini.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;

import com.stefanini.model.Infracoes;
import com.stefanini.repository.InfracaoRepository;

@Stateless
public class InfracaoService {
	
	@Inject
	private InfracaoRepository infracaoRepository;
	
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void incluir(Infracoes infracao) {
		infracaoRepository.incluir(infracao);
		
	}
	public List<Infracoes> listar(Infracoes infracao){
		return infracaoRepository.lista();
	}
	
	public Infracoes buscar(int idInfracao) {
		return infracaoRepository.buscar(idInfracao);
	}

}
