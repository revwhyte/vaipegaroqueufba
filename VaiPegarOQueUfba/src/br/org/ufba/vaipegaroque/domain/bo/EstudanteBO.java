package br.org.ufba.vaipegaroque.domain.bo;

import br.org.ufba.vaipegaroque.data.EstudanteDAO;
import br.org.ufba.vaipegaroque.domain.entities.Estudante;
import br.org.ufba.vaipegaroque.view.EstudanteViewModel;

public class EstudanteBO {
	
	private EstudanteDAO dao = new EstudanteDAO();

	public void cadastrarEstudante(Estudante e) throws Exception {
		if(e.equals(null)) {
			throw new Exception("Parametro Estudante inválido. Valor: NULL");
		}
		Estudante eAux = dao.getById(e.getMatricula());
		if(eAux != null) {
			throw new Exception("Estudante com matricula "+ e.getMatricula()+ " já está cadastrado.");
		}
		dao.create(e);
	}
}

