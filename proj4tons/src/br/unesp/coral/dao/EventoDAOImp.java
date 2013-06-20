/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.coral.dao;

import br.unesp.coral.beans.Evento;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author aluno
 */
public class EventoDAOImp implements EventoDAO{
	
	@Override
	public List<Evento> carregarEventos(){
		try {
			InputStream i = new FileInputStream("eventos.txt");
			ObjectInputStream oi = new ObjectInputStream(i);
			List<Evento> l = (List<Evento>) oi.readObject();
			oi.close();
			return l;
		} catch (Exception e) {
			return null;
		} 				
	}
	
	@Override
	public boolean salvarEevntos(List<Evento> l){
		try{
			OutputStream o = new FileOutputStream("eventos.txt");
			ObjectOutputStream oo = new ObjectOutputStream(o);
			oo.writeObject(l);
			oo.close();
			return true;
		}catch(Exception e){
			return false;
		}
	}
	
}
