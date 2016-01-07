
package LogicaDeNegocio;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

@Entity
public class Turno implements Serializable{
    @Id @GeneratedValue(strategy=GenerationType.AUTO)
    private int idTurno;
    @Basic
    @Temporal(javax.persistence.TemporalType.DATE)
    private Calendar fecha;
    @Basic
    private float hora;
    @OneToOne
    private EstadoTurno unEstadoTurno;

    public Turno() {
    }

    public Turno(Calendar fecha, float hora, EstadoTurno unEstadoTurno) {
        this.fecha = fecha;
        this.hora = hora;
        this.unEstadoTurno = unEstadoTurno;
    }

    public int getIdTurno() {
        return idTurno;
    }

    public void setIdTurno(int idTurno) {
        this.idTurno = idTurno;
    }

    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    public float getHora() {
        return hora;
    }

    public void setHora(float hora) {
        this.hora = hora;
    }

    public EstadoTurno getUnEstadoTurno() {
        return unEstadoTurno;
    }

    public void setUnEstadoTurno(EstadoTurno unEstadoTurno) {
        this.unEstadoTurno = unEstadoTurno;
    }

}
