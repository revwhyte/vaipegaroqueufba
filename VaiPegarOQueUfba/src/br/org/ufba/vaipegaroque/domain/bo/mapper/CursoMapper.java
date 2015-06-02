package br.org.ufba.vaipegaroque.domain.bo.mapper;

import br.org.ufba.vaipegaroque.domain.entities.Curso;
import br.org.ufba.vaipegaroque.view.CursoViewModel;

public class CursoMapper {

	public static Curso Map(CursoViewModel cvm) {
		Curso c = new Curso(cvm.getNome(), cvm.getCodigo());
		return c;
	}

	public static CursoViewModel Map(Curso c) {
		CursoViewModel cvm = new CursoViewModel();
		cvm.setCodigo(c.getCodigo());
		cvm.setNome(c.getNome());
		return cvm;
	}
}
