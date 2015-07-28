
package LogicaDeNegocio;

import java.util.LinkedList;


public class Agenda {
    private Profesional unProfesional;
    private LinkedList<PlantillaTurno> PlantillaTurnos = new LinkedList();
    private int idAgenda;
    private String fechaInicio;
    private String fechaFin;
    private String fechaGenerada;
    private String fechaAplicada;

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

    public Profesional getUnProfesional() {
        return unProfesional;
    }

    public void setUnProfesional(Profesional unProfesional) {
        this.unProfesional = unProfesional;
    }

    public LinkedList<PlantillaTurno> getPlantillaTurnos() {
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
