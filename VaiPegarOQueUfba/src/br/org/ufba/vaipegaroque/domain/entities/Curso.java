package br.org.ufba.vaipegaroque.domain.entities;

public class Curso {

	private Integer Id;
	private String nome;
	private String codigo;
	
	public Curso(String nome, String codigo){
		this.nome = nome;
		this.codigo = codigo;
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


	public Integer getId() {
		return Id;
	}


	public void setId(Integer id) {
		Id = id;
	}
	
	
	
}
