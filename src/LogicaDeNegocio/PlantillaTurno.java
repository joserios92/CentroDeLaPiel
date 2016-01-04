package LogicaDeNegocio;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
public class PlantillaTurno implements Serializable{
    @Id
    private int idPlantilla;
    @Basic
    private int dia;
    @Basic
    private int hora;
    @Basic
    private int duracion;
    @ManyToOne
    private Agenda unaAgenda;
    @OneToMany
    private List<Turno> turnos = new LinkedList();
    

    public PlantillaTurno() {
    }

    public PlantillaTurno(int idPlantilla, Agenda unaAgenda, int dia, int hora, int duracion) {
        this.idPlantilla = idPlantilla;
        this.unaAgenda = unaAgenda;
        this.dia = dia;
        this.hora = hora;
        this.duracion = duracion;
    }

    public List<Turno> getTurnos() {
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
