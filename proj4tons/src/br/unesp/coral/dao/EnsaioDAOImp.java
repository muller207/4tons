/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.unesp.coral.dao;

import br.unesp.coral.beans.Ensaio;
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
 * @author Samuel
 */
public class EnsaioDAOImp implements EnsaioDAO {
    
    @Override
    public void verificaExistencia(){
            boolean exists = (new File("ensaios.txt")).exists();  
            if (exists) {  
                
          } else {  
              try{
                   File f = new File("ensaios.txt");      
                   f.createNewFile();
              }catch(Exception e){
                  
              }
          }  
    }
    
    @Override
    public List<Ensaio> carregarEnsaios(){
        try {
                InputStream i = new FileInputStream("ensaios.txt");
                ObjectInputStream oi = new ObjectInputStream(i);
                List<Ensaio> l = (List<Ensaio>) oi.readObject();
                oi.close();
                return l;
        } catch (Exception e) {
                return null;
        }
    }
    
    @Override
    public boolean salvarEnsaio(List<Ensaio> l){
		try{
			OutputStream o = new FileOutputStream("ensaios.txt");
			ObjectOutputStream oo = new ObjectOutputStream(o);
			oo.writeObject(l);
			oo.close();
			return true;
		}catch(Exception e){
			return false;
		}
	}
}
