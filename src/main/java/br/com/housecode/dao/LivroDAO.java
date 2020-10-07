package br.com.housecode.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import br.com.housecode.models.Livro;

public class LivroDAO {
	

	@PersistenceContext
	private EntityManager manager;
	
	public void salvar(Livro livro) {
		manager.persist(livro);
	}
	
	public 	List<Livro> listar(){
		String jpql = "Select distinct(l) from Livro l join fetch l.autores";
		
		return manager.createQuery(jpql, Livro.class).getResultList();
	}

}
