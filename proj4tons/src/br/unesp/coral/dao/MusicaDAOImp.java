/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.coral.dao;

import br.unesp.coral.beans.Musica;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.List;

/**
 *
 * @author aluno
 */
public class MusicaDAOImp implements MusicaDAO{

	public MusicaDAOImp() {
	}

	
	@Override
	public List<Musica> carregarMusicas(){
		try {
			InputStream i = new FileInputStream("musicas.txt");
			ObjectInputStream oi = new ObjectInputStream(i);
			List<Musica> l = (List<Musica>) oi.readObject();
			oi.close();
			return l;
		} catch (Exception e) {
			return null;
		} 				
	}
	
	@Override
	public boolean salvarMusicas(List<Musica> l){
		try{
			OutputStream o = new FileOutputStream("musicas.txt");
			ObjectOutputStream oo = new ObjectOutputStream(o);
			oo.writeObject(l);
			oo.close();
			return true;
		}catch(Exception e){
			return false;
		}
	}
	
}
