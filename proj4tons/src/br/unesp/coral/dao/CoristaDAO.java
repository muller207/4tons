/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.coral.dao;

import br.unesp.coral.beans.Corista;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author aluno
 */
public interface CoristaDAO extends Serializable {
    
        abstract void verificaExistencia();

	List<Corista> carregarCoristas();

	boolean salvarCoristas(List<Corista> l);
	
}
