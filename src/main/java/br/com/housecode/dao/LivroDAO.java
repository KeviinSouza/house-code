package br.com.housecode.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import br.com.housecode.models.Livro;

public class LivroDAO {
	
	@PersistenceContext
	private EntityManager manager;
	
	public void salvar(Livro livro) {
		manager.persist(livro);
	}

}
