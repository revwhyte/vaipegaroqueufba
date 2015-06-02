package br.org.ufba.vaipegaroque.controller;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;

import br.org.ufba.vaipegaroque.domain.bo.CursoBO;
import br.org.ufba.vaipegaroque.domain.bo.EstudanteBO;
import br.org.ufba.vaipegaroque.domain.bo.mapper.CursoMapper;
import br.org.ufba.vaipegaroque.domain.bo.mapper.EstudanteMapper;
import br.org.ufba.vaipegaroque.domain.entities.Curso;
import br.org.ufba.vaipegaroque.view.CursoViewModel;
import br.org.ufba.vaipegaroque.view.EstudanteViewModel;

@ManagedBean
public class CadastroBean {
	
	private EstudanteBO estudanteBO = new EstudanteBO();
	private CursoBO cursoBO = new CursoBO();
	
	private EstudanteViewModel estudante = new EstudanteViewModel();
	
	private String result = null;
	
	public String getResult() {
		return result;
	}
	
	public void setLogin(String login) {
		this.estudante.setLogin(login);
	}
	public String getLogin() {
		return this.estudante.getLogin();
	}

	public void setSenha(String senha) {
		this.estudante.setSenha(senha);
	}
	public String getSenha() {
		return this.estudante.getSenha();
	}

	public void setNome(String nome) {
		this.estudante.setNome(nome);
	}
	public String getNome() {
		return this.estudante.getNome();
	}

	public void setMatricula(Integer matricula) {
		this.estudante.setMatricula(matricula);
	}
	public Integer getMatricula() {
		return this.estudante.getMatricula();
	}

	public void setCurso(String curso) {
		this.estudante.setIdCursoMatriculado(curso);
	}

	public String getCurso() {
		return this.estudante.getIdCursoMatriculado();
	}
	
	public ArrayList<CursoViewModel> getCursos() {
		ArrayList<CursoViewModel> resultList = new ArrayList<CursoViewModel>();
		for(Curso c :  cursoBO.getCursos()) {
			resultList.add(CursoMapper.Map(c));
		}
		return resultList;
	}
	
	public String submit() {
		try {
			estudanteBO.cadastrarEstudante(EstudanteMapper.Map(estudante));
			result = "Cadastrado com sucesso.";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result = "Erro interno.";
		}
		return result;
	}
}
