/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.coral.beans;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Samuel
 */ 
public class Corista implements Serializable{
    private String nome;
    private Date dataNas;
    private String rua;
    private int numero;
    private String bairro;
    private String email;
    private String telefone;
    private String celular;
    private String naipe;

    public Corista() {
    }

    public void setNaipe(String naipe) {
        this.naipe = naipe;
    }

    public String getNaipe() {
        return naipe;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getTelefone() {
        return telefone;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
    
    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
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

    /**
     * @return the dataNas
     */
    public Date getDataNas() {
        return dataNas;
    }

    /**
     * @param dataNas the dataNas to set
     */
    public void setDataNas(Date dataNas) {
        this.dataNas = dataNas;
    }

    /**
     * @return the rua
     */
    public String getRua() {
        return rua;
    }

    /**
     * @param rua the rua to set
     */
    public void setRua(String rua) {
        this.rua = rua;
    }

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return the bairro
     */
    public String getBairro() {
        return bairro;
    }

    /**
     * @param bairro the bairro to set
     */
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
            
}