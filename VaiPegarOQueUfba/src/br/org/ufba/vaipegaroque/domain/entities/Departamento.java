package br.org.ufba.vaipegaroque.domain.entities;

import java.util.ArrayList;

public class Departamento {

	private Integer Id;
	private String nome;
	private ArrayList<Curso> cursos;
	private ArrayList<String> professores;
	
	public Departamento(Integer Id, String nome, ArrayList<Curso> curso, ArrayList<String> professores){
		this.Id = Id;
		this.nome = nome;
		this.cursos = curso;
		this.professores = professores;
	}
	
	
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public ArrayList<Curso> getCursos() {
		return cursos;
	}
	public void setCursos(ArrayList<Curso> cursos) {
		this.cursos = cursos;
	}
	public ArrayList<String> getProfessores() {
		return professores;
	}
	public void setProfessores(ArrayList<String> professores) {
		this.professores = professores;
	}
	
}
