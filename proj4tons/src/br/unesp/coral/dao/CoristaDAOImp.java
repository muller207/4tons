/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.coral.dao;

import br.unesp.coral.beans.Corista;
import java.io.File;
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
public class CoristaDAOImp implements CoristaDAO{
	
    
    @Override
    public void verificaExistencia(){
            boolean exists = (new File("coristas.txt")).exists();  
            if (exists) {  
                
          } else {  
              try{
                   File f = new File("coristas.txt");      
                   f.createNewFile();
          }catch(Exception e){              
          }
            }  
        }
    
	@Override
	public List<Corista> carregarCoristas(){
		try {
			InputStream i = new FileInputStream("coristas.txt");
			ObjectInputStream oi = new ObjectInputStream(i);
			List<Corista> l = (List<Corista>) oi.readObject();
			oi.close();
			return l;
		} catch (Exception e) {
			return null;
		} 				
	}
	
	@Override
	public boolean salvarCoristas(List<Corista> l){
		try{
			OutputStream o = new FileOutputStream("coristas.txt");
			ObjectOutputStream oo = new ObjectOutputStream(o);
			oo.writeObject(l);
			oo.close();
			return true;
		}catch(Exception e){
			return false;
		}
	}
	
}
