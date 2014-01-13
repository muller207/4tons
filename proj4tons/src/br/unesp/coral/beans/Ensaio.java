/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.unesp.coral.beans;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

/**
 *
 * @author Samuel
 */
public class Ensaio implements Serializable{
    private Date data;
    private List<Presenca> presentes;
    private String obs;

    public Ensaio() {
    }

    public Date getData() {
        return data;
    }

    public String getObs() {
        return obs;
    }

    public List<Presenca> getPresentes() {
        return presentes;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public void setPresentes(List<Presenca> presentes) {
        this.presentes = presentes;
    }
        
    @Override
    public String toString(){                
        SimpleDateFormat dt = new SimpleDateFormat("dd/MM/YYYY");
        GregorianCalendar c = new GregorianCalendar();
        c.setTime(data);              
        return diaSemana(c.get(Calendar.DAY_OF_WEEK))+", "+dt.format(data);        
    }

    public String diaSemana(int day){
        switch(day){
            case 1:{  
                return "Domingo";                
            }  
            case 2:{  
                return "Segunda";
            }
            case 3:{  
                return "Terça";
            }
            case 4:{  
                return "Quarta";
            }
            case 5:{  
                return "Quinta";
            }
            case 6:{  
                return "Sexta";
            }
            case 7:{  
                return "Sábado";                
            }
        }
        return "Erro";
    }
}
