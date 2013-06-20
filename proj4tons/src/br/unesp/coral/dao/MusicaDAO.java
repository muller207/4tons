/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.coral.dao;

import br.unesp.coral.beans.Musica;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author aluno
 */
public interface MusicaDAO extends Serializable {
	
	abstract List<Musica> carregarMusicas();
	abstract boolean salvarMusicas(List<Musica> l);
	
}
