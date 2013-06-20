/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.coral.beans;

import java.io.Serializable;

/**
 *
 * @author Samuel
 */ 
public class Corista implements Serializable{
    private String nome;

    public Corista() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return this.nome;
    }
            
}