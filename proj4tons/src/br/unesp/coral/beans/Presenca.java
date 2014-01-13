/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.unesp.coral.beans;

import java.io.Serializable;

/**
 *
 * @author Samuel
 */
public class Presenca implements Serializable{
    private Corista corista;
    private boolean presente;

    public Presenca() {
    }

    public Corista getCorista() {
        return corista;
    }

    public void setCorista(Corista corista) {
        this.corista = corista;
    }

    public boolean isPresente() {
        return presente;
    }

    public void setPresente(boolean presente) {
        this.presente = presente;
    }
        
}
