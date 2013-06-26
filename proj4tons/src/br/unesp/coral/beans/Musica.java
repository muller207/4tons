/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.coral.beans;

import java.io.Serializable;

/**
 *
 * @author aluno
 */
public class Musica implements Serializable{
	
	private String nome;
        private String caminho;
        
	public Musica() {           
	}

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCaminho(String caminho) {
        this.caminho = caminho;
    }

    public String getCaminho() {
        return caminho;
    }

    @Override
    public String toString() {
        return this.nome;
    }
		
    
}
