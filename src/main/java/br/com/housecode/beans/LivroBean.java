package br.com.housecode.beans;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import br.com.housecode.models.Livro;


@Named
@RequestScoped
public class LivroBean {
	
	@Inject
	private Livro livro;
	
	public void Salvar() {
		System.out.println("Livro " + livro +  "Cadastrado Com Sucesso!!");
	}
	
	public Livro getLivro() {
		return livro;
	}
	
	public void setLivro(Livro livro) {
		this.livro = livro;
	}

}
