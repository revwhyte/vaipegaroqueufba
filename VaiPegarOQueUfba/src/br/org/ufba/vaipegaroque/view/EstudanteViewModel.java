package br.org.ufba.vaipegaroque.view;

import java.util.ArrayList;


public class EstudanteViewModel {

	public Integer matricula = null;
	public String nome = null;
	public String login = null;
	public String senha = null;
	public String idCursoMatriculado = null;
	public CursoViewModel cursoMatriculado = null;
	public ArrayList<EstudanteViewModel> amigos = null;
}
