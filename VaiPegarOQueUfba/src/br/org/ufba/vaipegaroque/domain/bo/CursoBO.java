package br.org.ufba.vaipegaroque.domain.bo;

import java.util.ArrayList;

import br.org.ufba.vaipegaroque.data.CursoDAO;
import br.org.ufba.vaipegaroque.domain.entities.Curso;

public class CursoBO {
	private CursoDAO cursoDAO = new CursoDAO();
	public ArrayList<Curso> getCursos() {
		return cursoDAO.getAll();
	}
}
