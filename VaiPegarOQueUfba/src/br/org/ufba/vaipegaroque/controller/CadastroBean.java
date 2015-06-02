package br.org.ufba.vaipegaroque.controller;

import javax.faces.bean.ManagedBean;

import br.org.ufba.vaipegaroque.view.CursoViewModel;
import br.org.ufba.vaipegaroque.view.EstudanteViewModel;

@ManagedBean
public class CadastroBean {
	private EstudanteViewModel estudante = new EstudanteViewModel();
	
	private String result = null;
	
	public String getResult() {
		return result;
	}
	
	public void setLogin(String login) {
		this.estudante.login = login;
	}
	public String getLogin() {
		return this.estudante.login;
	}

	public void setSenha(String senha) {
		this.estudante.senha = senha;
	}
	public String getSenha() {
		return this.estudante.senha;
	}

	public void setNome(String nome) {
		this.estudante.nome = nome;
	}
	public String getNome() {
		return this.estudante.nome;
	}

	public void setMatricula(int matricula) {
		this.estudante.matricula = matricula;
	}
	public Integer getMatricula() {
		return this.estudante.matricula;
	}

	public void setCurso(String curso) {
		
	}
	public CursoViewModel getCurso() {
		return null;
	}
	
	public void submit() {
		result = estudante.login;
	}
}
