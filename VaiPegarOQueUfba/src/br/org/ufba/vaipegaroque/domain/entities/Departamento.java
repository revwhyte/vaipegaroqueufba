package br.org.ufba.vaipegaroque.domain.entities;

public class Departamento {

	private Integer Id;
	private String nome;
	private List<Curso> cursos;
	private List<String> professores;
	
	public Departamento(Integer Id, String nome, List<Curso> curso, List<String> professores){
		this.Id = id;
		this.nome = nome;
		this.cursos = cursos;
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
	public List<Curso> getCursos() {
		return cursos;
	}
	public void setCursos(List<Curso> cursos) {
		this.cursos = cursos;
	}
	public List<String> getProfessores() {
		return professores;
	}
	public void setProfessores(List<String> professores) {
		this.professores = professores;
	}
	
}
