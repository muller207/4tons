/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.coral.beans;

/**
 *
 * @author aluno
 */
public class Musica {
	
	private String nome;
        private String caminho;
	private String cantada;
	private String playback;
	private String partitura;
	private String letra;
	private String kit;

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
