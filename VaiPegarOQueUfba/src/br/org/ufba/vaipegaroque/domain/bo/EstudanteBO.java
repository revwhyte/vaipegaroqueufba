package br.org.ufba.vaipegaroque.domain.bo;

import br.org.ufba.vaipegaroque.data.EstudanteDAO;
import br.org.ufba.vaipegaroque.domain.entities.Estudante;
import br.org.ufba.vaipegaroque.view.EstudanteViewModel;

public class EstudanteBO {
	
	private EstudanteDAO dao = new EstudanteDAO();

	public void cadastrarEstudante(Estudante e) throws Exception {
		if(e.equals(null)) {
			throw new Exception();
		}
		dao.create(e);
	}
	
}

class EstudanteMapper {
	static Estudante Map(EstudanteViewModel evm) {
		Estudante e = new Estudante();
		e.setLogin(evm.login);
		e.setNome(evm.nome);
		e.setSenha(evm.senha);
		e.setMatricula(evm.matricula);
		e.setIdCursoMatriculado(evm.idCursoMatriculado);
		return e;
	}
	
	static EstudanteViewModel Map(Estudante e) {
		EstudanteViewModel evm = new EstudanteViewModel();
		evm.login = e.getLogin();
		evm.nome = e.getNome();
		evm.senha = e.getSenha();
		evm.matricula = e.getMatricula();
		evm.idCursoMatriculado = e.getIdCursoMatriculado();
		return evm;
	}
}