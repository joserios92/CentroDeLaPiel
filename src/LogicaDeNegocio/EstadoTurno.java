
package LogicaDeNegocio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class EstadoTurno implements Serializable{
    @Id @GeneratedValue(strategy=GenerationType.AUTO)
    private int idEstadoTurno;
    @Basic
    private String nombreEstado;
    

    public EstadoTurno() {
    }

    public EstadoTurno(String nombreEstado) {
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
}
