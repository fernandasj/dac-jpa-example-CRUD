package com.mycompany.jpa.crud.example.main;

import com.mycompany.jpa.crud.example.domain.Pessoa;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

/**
 *
 * @author fernanda
 */
public class AppMain {
    public static void main(String[] args) {
        EntityManager em = Persistence
                .createEntityManagerFactory("crud-jpa")
                .createEntityManager();
        new PersisteDados(em).inserirDados();
        
        consultarTodosAsPessoas(em);
    }
    
    private static void consultarTodosAsPessoas(EntityManager em) {
        String sql = "SELECT p FROM Pessoa p"; 
        TypedQuery<Pessoa> query = em.createQuery(sql, Pessoa.class);
        List<Pessoa> resultList = query.getResultList();
        resultList.forEach(
                p -> System.out.println(p.getNome())
        );
    }
}
