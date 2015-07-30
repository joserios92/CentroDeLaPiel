/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LogicaDeNegocio;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Turno implements Serializable{
    @Id
    private int idTurno;
    @Basic
    private String fecha;
    @Basic
    private int hora;
    @OneToMany
    private PlantillaTurno unaPlantilla;
    @OneToOne
    private Paciente unPaciente;
    @OneToMany
    private EstadoTurno unEstadoTurno;

    public Turno() {
    }

    public Turno(int idTurno, String fecha, int hora, PlantillaTurno unaPlantilla, Paciente unPaciente, EstadoTurno unEstadoTurno) {
        this.idTurno = idTurno;
        this.fecha = fecha;
        this.hora = hora;
        this.unaPlantilla = unaPlantilla;
        this.unPaciente = unPaciente;
        this.unEstadoTurno = unEstadoTurno;
    }

    public int getIdTurno() {
        return idTurno;
    }

    public void setIdTurno(int idTurno) {
        this.idTurno = idTurno;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public PlantillaTurno getUnaPlantilla() {
        return unaPlantilla;
    }

    public void setUnaPlantilla(PlantillaTurno unaPlantilla) {
        this.unaPlantilla = unaPlantilla;
    }

    public Paciente getUnPaciente() {
        return unPaciente;
    }

    public void setUnPaciente(Paciente unPaciente) {
        this.unPaciente = unPaciente;
    }

    public EstadoTurno getUnEstadoTurno() {
        return unEstadoTurno;
    }

    public void setUnEstadoTurno(EstadoTurno unEstadoTurno) {
        this.unEstadoTurno = unEstadoTurno;
    }
    
    
}
