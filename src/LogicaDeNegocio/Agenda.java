
package LogicaDeNegocio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;
import javax.persistence.*;
@Entity
public class Agenda implements Serializable{
    @Id @GeneratedValue(strategy=GenerationType.AUTO)
    private int idAgenda;
    @Basic
    @Temporal(javax.persistence.TemporalType.DATE)
    private Calendar fechaInicio;
    @Basic
    @Temporal(javax.persistence.TemporalType.DATE)
    private Calendar fechaFin;
    @Basic
    @Temporal(javax.persistence.TemporalType.DATE)
    private Calendar fechaAplicada;
    

    public Agenda() {
    }

    public Agenda(Calendar fechaInicio, Calendar fechaFin,Calendar fechaAplicada) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.fechaAplicada = fechaAplicada;
    }

    public int getIdAgenda() {
        return idAgenda;
    }

    public void setIdAgenda(int idAgenda) {
        this.idAgenda = idAgenda;
    }
    
    public Calendar getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Calendar fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Calendar getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Calendar fechaFin) {
        this.fechaFin = fechaFin;
    }
    
    public Calendar getFechaAplicada() {
        return fechaAplicada;
    }

    public void setFechaAplicada(Calendar fechaAplicada) {
        this.fechaAplicada = fechaAplicada;
    }
    
}
