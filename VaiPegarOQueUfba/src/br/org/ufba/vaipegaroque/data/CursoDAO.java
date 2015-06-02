package br.org.ufba.vaipegaroque.data;

import java.util.ArrayList;

import br.org.ufba.vaipegaroque.domain.entities.Curso;

public class CursoDAO extends BaseDAO<Curso, String> {

	@Override
	public ArrayList<Curso> getAll() {
		ArrayList<Curso> cursos = new ArrayList<Curso>();
		Curso c = new Curso("Matemática", "MAT");
		cursos.add(c);
		c = new Curso("Ciência da Computação", "COMP");
		cursos.add(c);
		c = new Curso("Estatística", "EST");
		cursos.add(c);
		return cursos;
	}

	@Override
	public Curso getById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void create(Curso entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(String id, Curso entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub

	}
}
