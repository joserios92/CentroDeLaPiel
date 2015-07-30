/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LogicaDeNegocio;

import java.io.Serializable;
import java.util.LinkedList;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Profesional extends Persona implements Serializable{
    @Basic
    private int matricula;
    @ManyToOne
    private LinkedList<Agenda> agendas = new LinkedList();
    

    public Profesional() {
    }

    public Profesional(int matricula) {
        this.matricula = matricula;
    }

    public LinkedList<Agenda> getAgendas() {
        return agendas;
    }

    public void setAgendas(LinkedList<Agenda> agendas) {
        this.agendas = agendas;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
}
