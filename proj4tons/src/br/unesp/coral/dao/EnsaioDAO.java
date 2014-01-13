/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.unesp.coral.dao;

import br.unesp.coral.beans.Ensaio;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Samuel
 */
public interface EnsaioDAO extends Serializable {

    boolean salvarEnsaio(List<Ensaio> l);
    void verificaExistencia();
    List<Ensaio> carregarEnsaios();
}
