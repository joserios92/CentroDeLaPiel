
package LogicaDeNegocio;

import java.io.Serializable;
import java.util.LinkedList;
import javax.persistence.Entity;

@Entity
public class EstadoTurno implements Serializable{
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
