package com.br.pojo;

import java.util.ArrayList;
import java.util.List;

public class Turmas {
	
	public static List<AlunosMatriculado> aluMatriculados;
	private AlunosMatriculado auAlunosMatriculado;
	private boolean ativo;
	private int id = 1;
	private String nome;
	

	/*public Turmas() {
		aluMatriculados.add(auAlunosMatriculado);
	}*/


	public void getaddAlunos(AlunosMatriculado auAlunosMatriculado) {
		this.auAlunosMatriculado = auAlunosMatriculado;
		this.aluMatriculados.add(auAlunosMatriculado);
		//return aluMatriculados;
		
	}
	

	public AlunosMatriculado getAuAlunosMatriculado() {
		return auAlunosMatriculado;
	}


	public void setAuAlunosMatriculado(AlunosMatriculado auAlunosMatriculado) {
		this.auAlunosMatriculado = auAlunosMatriculado;
	}


	public List<AlunosMatriculado> getAluMatriculados() {
		return aluMatriculados;
	}

	public void setAluMatriculados(List<AlunosMatriculado> aluMatriculados) {
		this.aluMatriculados = aluMatriculados;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

}
