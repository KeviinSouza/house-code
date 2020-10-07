package br.com.housecode.beans;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.inject.Model;
import javax.inject.Inject;
import br.com.housecode.dao.LivroDAO;
import br.com.housecode.models.Livro;

@Model
public class ListaBean {
	
	@Inject
	private LivroDAO livrodao;
	
	private List<Livro> livros = new ArrayList<>();
	
	public List<Livro> getLivros(){
		this.livros = livrodao.listar();
		
		return livros;
	}

}
