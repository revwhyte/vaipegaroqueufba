package br.org.ufba.vaipegaroque.domain.entities;

public class Disciplina {
	
	private String nome;
	private String codigo;
	private String professor;
	private Curso cursoAssociado;
	private Integer cargaHoraria;
	private List<Estudantes> vagasPreenchidas;
	private Integer vagas;
	private String local;
	private String horario;
	
	public Disciplina(String nome, String codigo, String professor,
	 Curso cursoAssociado, Integer cargaHoraria, List<Estudantes> vagasPreenchidas,
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
	public List<Estudantes> getVagasPreenchidas() {
		return vagasPreenchidas;
	}
	public void setVagasPreenchidas(List<Estudantes> vagasPreenchidas) {
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
