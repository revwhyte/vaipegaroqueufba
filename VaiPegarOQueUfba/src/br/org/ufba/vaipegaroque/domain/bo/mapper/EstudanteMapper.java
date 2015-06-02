package br.org.ufba.vaipegaroque.domain.bo.mapper;

import br.org.ufba.vaipegaroque.domain.entities.Estudante;
import br.org.ufba.vaipegaroque.view.EstudanteViewModel;


public class EstudanteMapper {
	public static Estudante Map(EstudanteViewModel evm) {
		Estudante e = new Estudante();
		e.setLogin(evm.getLogin());
		e.setNome(evm.getNome());
		e.setSenha(evm.getSenha());
		e.setMatricula(evm.getMatricula());
		e.setIdCursoMatriculado(evm.getIdCursoMatriculado());
		return e;
	}
	
	public static EstudanteViewModel Map(Estudante e) {
		EstudanteViewModel evm = new EstudanteViewModel();
		evm.setLogin(e.getLogin());
		evm.setNome(e.getNome());
		evm.setSenha(e.getSenha());
		evm.setMatricula(e.getMatricula());
		evm.setIdCursoMatriculado(e.getIdCursoMatriculado());
		return evm;
	}
}
