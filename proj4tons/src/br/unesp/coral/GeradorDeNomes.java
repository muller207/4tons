/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.coral;

import java.util.Random;

/**
 *
 * @author Samuel
 */
public class GeradorDeNomes {
    private static String[] nomes = {
        "Fuga ",
        "Viagem ",
        "Cilada ",
        "Jornada ",
        "Armadilha ",
        "Noite "
    };
    
    private static String[] adjetivos = {
        "Sangrenta",
        "dos Desesperados",
        "Fatal",
        "do Barba Ruiva",
        "dos Bravos",
        "do Heroi"
    };
    
    
    public static String prox() {
        Random g = new Random();        
        int sort = g.nextInt(5);
        int sort2 = g.nextInt(5);
        String nome = nomes[sort]+adjetivos[sort2];
        return nome;
    }
    
    
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(prox());
        }
    }
}
