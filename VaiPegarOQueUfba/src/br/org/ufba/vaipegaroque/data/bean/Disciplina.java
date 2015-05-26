package br.org.ufba.vaipegaroque.data.bean;

import java.util.ArrayList;

public class Disciplina {
	private String nome;
	private String codigo;
	private String professor;
	private Curso cursoAssociado;
	private int cargaHoraria;
	private ArrayList<Estudante> vagasPreenchidas;
	private int vagas;
	private String local;
	private String horario;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getProfessor() {
		return professor;
	}
	public void setProfessor(String professor) {
		this.professor = professor;
	}
	public Curso getCursoAssociado() {
		return cursoAssociado;
	}
	public void setCursoAssociado(Curso cursoAssociado) {
		this.cursoAssociado = cursoAssociado;
	}
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	public ArrayList<Estudante> getVagasPreenchidas() {
		return vagasPreenchidas;
	}
	public void setVagasPreenchidas(ArrayList<Estudante> vagasPreenchidas) {
		this.vagasPreenchidas = vagasPreenchidas;
	}
	public int getVagas() {
		return vagas;
	}
	public void setVagas(int vagas) {
		this.vagas = vagas;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
}
