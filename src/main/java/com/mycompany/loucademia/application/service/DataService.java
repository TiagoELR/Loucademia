package com.mycompany.loucademia.application.service;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import com.mycompany.loucademia.domain.aluno.Aluno.Sexo;
import com.mycompany.loucademia.domain.aluno.Aluno.Situacao;
import com.mycompany.loucademia.domain.aluno.Estado;
import com.mycompany.loucademia.domain.aluno.EstadoRepository;

@Stateless
public class DataService {
	
	@EJB
	private EstadoRepository estadoRepository;

	public List<Estado> listEstados() {
		List<Estado> estados = estadoRepository.listEstados();
		return estados;
	}
	
	public Sexo[] getSexos() {
		return Sexo.values();
	}
	
	public Situacao[] getSituacoes() {
		return Situacao.values();
	}
}
