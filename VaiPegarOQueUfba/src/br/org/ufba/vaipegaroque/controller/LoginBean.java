package br.org.ufba.vaipegaroque.controller;

import javax.faces.bean.ManagedBean;

import br.org.ufba.vaipegaroque.domain.bo.EstudanteBO;
import br.org.ufba.vaipegaroque.domain.bo.mapper.EstudanteMapper;
import br.org.ufba.vaipegaroque.view.EstudanteViewModel;

@ManagedBean
public class LoginBean {

	private EstudanteBO estudanteBO = new EstudanteBO();
	private EstudanteViewModel estudante = new EstudanteViewModel();

	private String result = null;

	public String getResult() {
		return result;
	}

	public String getLogin() {
		return this.estudante.getLogin();
	}

	public void setLogin(String login) {
		this.estudante.setLogin(login);
	}

	public String getSenha() {
		return this.estudante.getSenha();
	}

	public void setSenha(String senha) {
		this.estudante.setSenha(senha);
	}

	public String submit() {
		result = "";
		try {
			if (estudanteBO.autenticarEstudante(EstudanteMapper.Map(estudante)))
				result = "Autenticado com sucesso.";
			else
				result = "Login e/ou Senha incorretos.";
		} catch (Exception e) {
			result = e.getMessage();
		}
		return result;
	}
}
