/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LogicaDeNegocio;

import java.util.LinkedList;

/**
 *
 * @author Ruso
 */
public class Agenda {
    Profesional unProfesional = new Profesional();
    LinkedList<PlantillaTurno> PlantillaTurnos = new LinkedList();
    private String fechaInicio;
    private String fechaFin;
    private String fechaGenerada;
    private String fechaAplicada;

    public Agenda() {
    }

    public Agenda(String fechaInicio, String fechaFin, String fechaGenerada, String fechaAplicada) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.fechaGenerada = fechaGenerada;
        this.fechaAplicada = fechaAplicada;
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
