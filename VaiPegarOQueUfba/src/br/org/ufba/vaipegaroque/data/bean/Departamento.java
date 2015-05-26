package br.org.ufba.vaipegaroque.data.bean;

import java.util.ArrayList;

public class Departamento {
	private String nome;
	private ArrayList<Curso> cursos;
	private ArrayList<String> professor;
	
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
	public ArrayList<String> getProfessor() {
		return professor;
	}
	public void setProfessor(ArrayList<String> professor) {
		this.professor = professor;
	}
}
