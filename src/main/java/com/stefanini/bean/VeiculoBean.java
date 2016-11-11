package com.stefanini.bean;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.stefanini.model.Veiculo;
import com.stefanini.service.VeiculoService;

@RequestScoped
@Named("veiculoMB")
public class VeiculoBean implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Inject
	private Veiculo veiculo;
	
	@Inject
	private VeiculoService veiculoService;
	
	@Inject
	private ModeloBean modeloBean;
	

	
	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public VeiculoService getVeiculoService() {
		return veiculoService;
	}

	public void setVeiculoService(VeiculoService veiculoService) {
		this.veiculoService = veiculoService;
	}

	public String salvarVeiculo(){
		veiculo.setModelo(modeloBean.buscar(idModelo));	
		veiculo.setProprietario(proprietarioBean.buscar(cpf));
		veiculoService.incluir(veiculo);
		return "/index.xhtml";
	}
	




}
