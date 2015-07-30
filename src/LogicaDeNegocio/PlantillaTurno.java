package LogicaDeNegocio;

import java.io.Serializable;
import java.util.LinkedList;
import javax.persistence.Entity;
@Entity
public class PlantillaTurno implements Serializable{
    private LinkedList<Turno> turnos = new LinkedList();
    private int idPlantilla;
    private Agenda unaAgenda;
    private int dia;
    private int hora;
    private int duracion;
    //private String prestacion;

    public PlantillaTurno() {
    }

    public PlantillaTurno(int idPlantilla, Agenda unaAgenda, int dia, int hora, int duracion) {
        this.idPlantilla = idPlantilla;
        this.unaAgenda = unaAgenda;
        this.dia = dia;
        this.hora = hora;
        this.duracion = duracion;
    }

    public LinkedList<Turno> getTurnos() {
        return turnos;
    }

    public void setTurnos(LinkedList<Turno> Turnos) {
        this.turnos = Turnos;
    }

    public int getIdPlantilla() {
        return idPlantilla;
    }

    public void setIdPlantilla(int idPlantilla) {
        this.idPlantilla = idPlantilla;
    }

    public Agenda getUnaAgenda() {
        return unaAgenda;
    }

    public void setUnaAgenda(Agenda unaAgenda) {
        this.unaAgenda = unaAgenda;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    
}
