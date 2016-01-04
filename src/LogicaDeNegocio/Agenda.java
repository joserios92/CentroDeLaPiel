
package LogicaDeNegocio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import javax.persistence.*;
@Entity
public class Agenda implements Serializable{
    @Id
    private int idAgenda;
    @Basic
    private String fechaInicio;
    @Basic
    private String fechaFin;
    @Basic
    private String fechaGenerada;
    @Basic
    private String fechaAplicada;
    @OneToMany
    private List<PlantillaTurno> PlantillaTurnos = new LinkedList();

    public Agenda() {
    }

    public Agenda(int idAgenda, String fechaInicio, String fechaFin, String fechaGenerada, String fechaAplicada) {
        this.idAgenda = idAgenda;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.fechaGenerada = fechaGenerada;
        this.fechaAplicada = fechaAplicada;
    }

    public int getIdAgenda() {
        return idAgenda;
    }

    public void setIdAgenda(int idAgenda) {
        this.idAgenda = idAgenda;
    }
    public List<PlantillaTurno> getPlantillaTurnos() {
        return PlantillaTurnos;
    }

    public void setPlantillaTurnos(LinkedList<PlantillaTurno> PlantillaTurnos) {
        this.PlantillaTurnos = PlantillaTurnos;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getFechaGenerada() {
        return fechaGenerada;
    }

    public void setFechaGenerada(String fechaGenerada) {
        this.fechaGenerada = fechaGenerada;
    }

    public String getFechaAplicada() {
        return fechaAplicada;
    }

    public void setFechaAplicada(String fechaAplicada) {
        this.fechaAplicada = fechaAplicada;
    }
    
}
