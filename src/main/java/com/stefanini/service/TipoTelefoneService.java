package com.stefanini.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;

import com.stefanini.model.Tipotelefone;
import com.stefanini.repository.TipoTelefoneRepository;

@Stateless
public class TipoTelefoneService {
	
	@Inject
	private TipoTelefoneRepository tipoTelefoneRepository;

	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void incluir(Tipotelefone tipoTelefone) {
		tipoTelefoneRepository.incluir(tipoTelefone);
		
	}
	
	public List<Tipotelefone> listar(Tipotelefone tipoTelefone){
		return tipoTelefoneRepository.lista();
	}
	
	public Tipotelefone buscar(int idTipoTelefone) {
		return tipoTelefoneRepository.buscar(idTipoTelefone);
	}

}
