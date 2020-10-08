package br.com.housecode.beans;

import java.util.List;

import javax.enterprise.inject.Model;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.transaction.Transactional;

import br.com.housecode.dao.AutorDAO;
import br.com.housecode.dao.LivroDAO;
import br.com.housecode.models.Autor;
import br.com.housecode.models.Livro;

@Model
public class LivroBean {

	
	private Livro livro = new Livro();
	
	@Inject
	private LivroDAO livrodao;
	@Inject
	private AutorDAO autordao;
	@Inject
	private FacesContext fc;
	
	@Transactional
	public String Salvar() {
	
		fc.getExternalContext().getFlash().setKeepMessages(true);
		fc.addMessage(null, new FacesMessage("Cadastro Realizado Com Sucesso!!"));
		livrodao.salvar(livro);
		
		return "/livros/list?faces-redirect=true";
	}
	
	public List<Autor> getAutores(){
		return autordao.listar();
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

}
