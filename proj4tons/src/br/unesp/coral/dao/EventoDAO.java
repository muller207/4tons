/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.coral.dao;

import br.unesp.coral.beans.Evento;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author aluno
 */
public interface EventoDAO extends Serializable {

	abstract void verificaExistencia();
    
        List<Evento> carregarEventos();

	boolean salvarEevntos(List<Evento> l);
	
}
