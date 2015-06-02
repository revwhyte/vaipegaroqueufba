package br.org.ufba.vaipegaroque.view;

import java.util.ArrayList;

public class EstudanteViewModel {

	private Integer matricula = null;
	private String nome = null;
	private String login = null;
	private String senha = null;
	private String idCursoMatriculado = null;
	private CursoViewModel cursoMatriculado = null;
	private ArrayList<EstudanteViewModel> amigos = null;

	public Integer getMatricula() {
		return matricula;
	}

	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getIdCursoMatriculado() {
		return idCursoMatriculado;
	}

	public void setIdCursoMatriculado(String idCursoMatriculado) {
		this.idCursoMatriculado = idCursoMatriculado;
	}

	public CursoViewModel getCursoMatriculado() {
		return cursoMatriculado;
	}

	public void setCursoMatriculado(CursoViewModel cursoMatriculado) {
		this.cursoMatriculado = cursoMatriculado;
	}

	public ArrayList<EstudanteViewModel> getAmigos() {
		return amigos;
	}

	public void setAmigos(ArrayList<EstudanteViewModel> amigos) {
		this.amigos = amigos;
	}
}
