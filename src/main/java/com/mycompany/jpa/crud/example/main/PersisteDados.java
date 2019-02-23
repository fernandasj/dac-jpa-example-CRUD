package com.mycompany.jpa.crud.example.main;

import com.mycompany.jpa.crud.example.domain.Pessoa;
import javax.persistence.EntityManager;

/**
 *
 * @author fernanda
 */
public class PersisteDados {
    private final EntityManager em;

    public PersisteDados(EntityManager em) {
        this.em = em;
    }
    
    public void inserirDados(){
        Pessoa p1 = new Pessoa("Fernanda");
        Pessoa p2 = new Pessoa("Fer");
        
        em.getTransaction().begin();
        em.persist(p1);
        em.persist(p2);
        em.getTransaction().commit();
    }
}
