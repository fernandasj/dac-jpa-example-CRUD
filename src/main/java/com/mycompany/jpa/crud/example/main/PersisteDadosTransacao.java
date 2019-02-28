package com.mycompany.jpa.crud.example.main;

import com.mycompany.jpa.crud.example.domain.Pessoa;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
/**
 *
 * @author fernanda
 */
public class PersisteDadosTransacao {
    //instanciando o gerenciador de instancias
    @PersistenceContext(unitName = "crud-jpa")
    private final EntityManager em;

    public PersisteDadosTransacao(EntityManager em) {
        this.em = em;
    }
    
    public void inserirDados(){
        Pessoa p1 = new Pessoa("Ada Lovelace");
        Pessoa p2 = new Pessoa("Dandara");
        
        //abrindo uma transaçao com o banco
        em.getTransaction().begin();
        
        //persistindo os dados no banco
        em.persist(p1);
        em.persist(p2);
        
        //sincronizando os dados
        em.flush();
        
        //confirmando a persistencia dos dados no banco
        em.getTransaction().commit();
    }
}
