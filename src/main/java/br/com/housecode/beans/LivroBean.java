package br.com.housecode.beans;

import java.util.ArrayList;
import java.util.List;
import javax.enterprise.inject.Model;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.transaction.Transactional;
import br.com.housecode.dao.LivroDAO;
import br.com.housecode.models.Autor;
import br.com.housecode.models.Livro;

@Model
public class LivroBean {

	@Inject
	private Livro livro;
	@Inject
	private LivroDAO livrodao;
	@Inject
	private FacesContext fc;
	
	private List<Integer> autoresId = new ArrayList<>();
	
	@Transactional
	public String Salvar() {
		for (Integer autoresId : autoresId) {
			livro.getAutores().add(new Autor(autoresId));
		}
		fc.getExternalContext().getFlash().setKeepMessages(true);
		fc.addMessage(null, new FacesMessage("Cadastro Realizado Com Sucesso!!"));
		livrodao.salvar(livro);
		
		return "/livros/list?faces-redirect=true";
	}

	public List<Integer> getAutoresId() {
		return autoresId;
	}

	public void setAutoresId(List<Integer> autoresId) {
		this.autoresId = autoresId;
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

}
