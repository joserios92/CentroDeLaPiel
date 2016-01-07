package LogicaDeNegocio;

import java.io.Serializable;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
@Entity
public class PlantillaTurno implements Serializable{
    @Id @GeneratedValue(strategy=GenerationType.AUTO)
    private int idPlantilla;
    @Basic
    @Temporal(javax.persistence.TemporalType.DATE)
    private Calendar fecha;
    @Basic
    private float duracion;
    @ManyToOne
    private Agenda unaAgenda;
    @OneToMany
    private List<Turno> turnos;
    
  public PlantillaTurno() {
    }

    public PlantillaTurno(Calendar fecha, float duracion, Agenda unaAgenda, List<Turno> turnos) {
        this.fecha = fecha;
        this.duracion = duracion;
        this.unaAgenda = unaAgenda;
        this.turnos = turnos;
    }

    public int getIdPlantilla() {
        return idPlantilla;
    }

    public void setIdPlantilla(int idPlantilla) {
        this.idPlantilla = idPlantilla;
    }

    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    public float getDuracion() {
        return duracion;
    }

    public void setDuracion(float duracion) {
        this.duracion = duracion;
    }

    public Agenda getUnaAgenda() {
        return unaAgenda;
    }

    public void setUnaAgenda(Agenda unaAgenda) {
        this.unaAgenda = unaAgenda;
    }

    public List<Turno> getTurnos() {
        return turnos;
    }

    public void setTurnos(List<Turno> turnos) {
        this.turnos = turnos;
    }

}
