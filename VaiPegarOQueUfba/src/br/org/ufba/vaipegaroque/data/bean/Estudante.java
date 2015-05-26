package br.org.ufba.vaipegaroque.data.bean;

import java.util.ArrayList;

public class Estudante {
	private String nome;
	private int matricula;
	private String login;
	private String senha;
	private ArrayList<Estudante> amigos;
	private Curso cursoMatriculado;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
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
	public ArrayList<Estudante> getAmigos() {
		return amigos;
	}
	public void setAmigos(ArrayList<Estudante> amigos) {
		this.amigos = amigos;
	}
	public Curso getCursoMatriculado() {
		return cursoMatriculado;
	}
	public void setCursoMatriculado(Curso cursoMatriculado) {
		this.cursoMatriculado = cursoMatriculado;
	}
	
}
