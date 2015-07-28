
package LogicaDeNegocio;

import java.util.LinkedList;


public class EstadoTurno {
    private LinkedList<Turno> Turnos = new LinkedList();
    private String nombreEstado;

    public EstadoTurno() {
    }

    public EstadoTurno(String nombreEstado) {
        this.nombreEstado = nombreEstado;
    }

    public LinkedList<Turno> getTurnos() {
        return Turnos;
    }

    public void setTurnos(LinkedList<Turno> Turnos) {
        this.Turnos = Turnos;
    }

    public String getNombreEstado() {
        return nombreEstado;
    }

    public void setNombreEstado(String nombreEstado) {
        this.nombreEstado = nombreEstado;
    }
    
}
