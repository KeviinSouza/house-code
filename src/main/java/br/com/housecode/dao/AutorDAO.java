package br.com.housecode.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.housecode.models.Autor;

public class autorDAO {
	
	@PersistenceContext
    private EntityManager manager;
	
	
    public List<Autor> getLista() {
        return  manager.createQuery("select a from Autor a", Autor.class)
                .getResultList();
    }

}
