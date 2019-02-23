package com.mycompany.jpa.crud.example.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author fernanda
 */

@Entity
public class Pessoa implements Serializable{
    
    @Id
    @GeneratedValue
    private int id;
    private String nome;

    public Pessoa(String nome) {
        this(); 
        this.nome = nome;
    }

    public Pessoa() {
    }
        
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "id=" + id + ", nome=" + nome + '}';
    } 
}
