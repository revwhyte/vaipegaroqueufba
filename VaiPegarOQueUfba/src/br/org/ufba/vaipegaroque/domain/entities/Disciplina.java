package br.org.ufba.vaipegaroque.domain.entities;

import java.util.ArrayList;

public class Disciplina {
	
	private String nome;
	private String codigo;
	private String professor;
	private Curso cursoAssociado;
	private Integer cargaHoraria;
	private ArrayList<Estudante> vagasPreenchidas;
	private Integer vagas;
	private String local;
	private String horario;
	
	public Disciplina(String nome, String codigo, String professor,
	 Curso cursoAssociado, Integer cargaHoraria, ArrayList<Estudante> vagasPreenchidas,
	 Integer vagas,	 String local, String horario){
		this.nome = nome;
		this.codigo = codigo;
		this.cursoAssociado = cursoAssociado;
		this.cargaHoraria = cargaHoraria;
		this.vagasPreenchidas = vagasPreenchidas;
		this.vagas = vagas;
		this.local = local;
		this.horario = horario;
				
	}
	
	
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
	public Integer getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(Integer cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	public ArrayList<Estudante> getVagasPreenchidas() {
		return vagasPreenchidas;
	}
	public void setVagasPreenchidas(ArrayList<Estudante> vagasPreenchidas) {
		this.vagasPreenchidas = vagasPreenchidas;
	}
	public Integer getVagas() {
		return vagas;
	}
	public void setVagas(Integer vagas) {
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
