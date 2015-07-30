
package LogicaDeNegocio;

import java.io.Serializable;
import java.util.LinkedList;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class EstadoTurno implements Serializable{
    @Id
    private int idEstadoTurno;
    @Basic
    private String nombreEstado;
    @ManyToOne
    private LinkedList<Turno> Turnos = new LinkedList();

    public EstadoTurno() {
    }

    public EstadoTurno(int idEstadoTurno, String nombreEstado) {
        this.idEstadoTurno = idEstadoTurno;
        this.nombreEstado = nombreEstado;
    }

    public int getIdEstadoTurno() {
        return idEstadoTurno;
    }

    public void setIdEstadoTurno(int idEstadoTurno) {
        this.idEstadoTurno = idEstadoTurno;
    }

    public String getNombreEstado() {
        return nombreEstado;
    }

    public void setNombreEstado(String nombreEstado) {
        this.nombreEstado = nombreEstado;
    }

    public LinkedList<Turno> getTurnos() {
        return Turnos;
    }

    public void setTurnos(LinkedList<Turno> Turnos) {
        this.Turnos = Turnos;
    }
    
}
