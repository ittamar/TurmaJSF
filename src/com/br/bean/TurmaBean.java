package com.br.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.html.HtmlDataTable;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import com.br.pojo.AlunosMatriculado;
import com.br.pojo.Turmas;

@ManagedBean(name = "turmaBean")
@SessionScoped
public class TurmaBean implements Serializable {

	private long cpf;
	
	private String email;

	private HtmlDataTable tabelaPessoa;

	private Turmas turmas;
	
	private AlunosMatriculado am;

	List<Turmas> turma = new ArrayList<Turmas>();

	public TurmaBean() {
		turmas = new Turmas();
		am = new AlunosMatriculado();

	}

	public AlunosMatriculado getAm() {
		return am;
	}

	public void setAm(AlunosMatriculado am) {
		this.am = am;
	}

	public Collection<Turmas> getTurma() {
		return turma;
	}

	public Turmas getTurmas() {

		return turmas;
	}

	public void setTurmas(Turmas turmas) {
		this.turmas = turmas;
	}

	public void setTurma(List<Turmas> turma) {
		this.turma = turma;
	}

	public HtmlDataTable getTabelaPessoa() {
		return tabelaPessoa;
	}

	public void setTabelaPessoa(HtmlDataTable tabelaPessoa) {
		this.tabelaPessoa = tabelaPessoa;
	}

	public void addTurma() {

		int x;
		turma.add(turmas);

		this.turmas = new Turmas();

		for (int i = 0; i < turma.size(); i++) {
			x = turmas.getId();
			x++;
			turmas.setId(x);
		}

		if (turma.contains(turmas)) {
			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_INFO, "Adiconado com sucesso", ""));
		} else {
			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_INFO, "Curso já cadastrado", ""));
		}

	}

	public String ativar() {
		/*
		 * String d = this.turmas.getNome(); List<String> d = new
		 * ArrayList<String>();
		 */
		// am.add(alunosMatriculado);
		// this.alunosMatriculado = new AlunosMatriculado();
		// this.alunosMatriculado.setAtivoAluno(true);
		return "aluno?faces-redirect=true";

	}

	public String voltar() {
		this.turmas = new Turmas();
		this.turmas.setAtivo(true);
		return "turma?faces-redirect=true";
	}

	public String addAluno() {
		
		turmas = (Turmas) tabelaPessoa.getRowData();
		turmas.aluMatriculados.add(am);
		//turmas.getaddAlunos();
		this.turmas = new Turmas();
		//this.turma = new ArrayList<Turmas>();
		//turmas.getaddAlunos(this.am);
		

		// turmas = (Turmas) tabelaPessoa.getRowData();
		// turma.add((Turmas) alunoMatriculados);
		// turma.addAll(turmas.getAluMatriculados());

		return "aluno?faces-redirect=true";

	}

	public String retorneTurma() {
		turmas = (Turmas) tabelaPessoa.getRowData();
		turmas.setNome(turmas.getNome());

		return "aluno?faces-redirect=true";

	}
	public List<AlunosMatriculado> getListAlM(){
		return turmas.getAluMatriculados();
	}

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
