package br.org.ufba.vaipegaroque.data;

import java.util.ArrayList;

import br.org.ufba.vaipegaroque.domain.entities.Estudante;

public class EstudanteDAO extends BaseDAO<Estudante, Integer> {

	public Estudante getBy(String login, String senha) {
		Estudante e = null;
		// Permite sql injection
		String sql = "SELECT * FROM estudantes WHERE LOGIN = " + login + " AND " + "SENHA = " + senha + ";";
		return e;
	}
	
	@Override
	public void create(Estudante e) {
		
	}

	@Override
	public ArrayList<Estudante> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Estudante getById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Integer id, Estudante entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}
	
}
