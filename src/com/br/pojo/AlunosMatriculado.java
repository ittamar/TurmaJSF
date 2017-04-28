package com.br.pojo;

public class AlunosMatriculado{
	private boolean ativoAluno;
	private String nome;
	private Integer matricula;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getMatricula() {
		return matricula;
	}
	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}
	public boolean isAtivoAluno() {
		return ativoAluno;
	}
	public void setAtivoAluno(boolean ativoAluno) {
		this.ativoAluno = ativoAluno;
	}
	
	

}
