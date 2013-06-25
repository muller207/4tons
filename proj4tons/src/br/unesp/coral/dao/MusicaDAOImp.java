/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.coral.dao;

import br.unesp.coral.beans.Musica;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
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
	public void verificaExistencia(){
            boolean exists = (new File("musicas.txt")).exists();  
            if (exists) {  
                
          } else {  
              try{
                   File f = new File("musicas.txt");      
                   f.createNewFile();
          }catch(Exception e){              
          }
            }  
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
