package com.mycompany.jpa.crud.example.main;

import com.mycompany.jpa.crud.example.domain.Pessoa;
import javax.persistence.EntityManager;

/**
 *
 * @author fernanda
 */
public class PersisteDados {
    //instanciando o gerenciador de instancias
    private final EntityManager em;

    public PersisteDados(EntityManager em) {
        this.em = em;
    }
    
    public void inserirDados(){
        Pessoa p1 = new Pessoa("Fernanda");
        Pessoa p2 = new Pessoa("Fer");
        
        //abrindo uma transaçao com o banco
        em.getTransaction().begin();
        
        //persistindo os dados no banco
        em.persist(p1);
        em.persist(p2);
        
        //confirmando a persistencia dos dados no banco
        em.getTransaction().commit();
    }
}
