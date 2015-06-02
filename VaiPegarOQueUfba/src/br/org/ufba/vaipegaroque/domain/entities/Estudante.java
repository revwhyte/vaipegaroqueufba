package br.org.ufba.vaipegaroque.domain.entities;

import java.util.ArrayList;

public class Estudante {

	private int matricula = -1;
	private String nome = null;
	private String login = null;
	private String senha = null;
	private Curso cursoMatriculado = null;
	private String idCursoMatriculado = null;
	private ArrayList<Estudante> amigos = null;
	
	
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
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
	public Curso getCursoMatriculado() {
		return cursoMatriculado;
	}
	public void setCursoMatriculado(Curso cursoMatriculado) {
		this.cursoMatriculado = cursoMatriculado;
	}
	public ArrayList<Estudante> getAmigos() {
		return amigos;
	}
	public void setAmigos(ArrayList<Estudante> amigos) {
		this.amigos = amigos;
	}
	public String getIdCursoMatriculado() {
		return idCursoMatriculado;
	}
	public void setIdCursoMatriculado(String idCursoMatriculado) {
		this.idCursoMatriculado = idCursoMatriculado;
	}
}
