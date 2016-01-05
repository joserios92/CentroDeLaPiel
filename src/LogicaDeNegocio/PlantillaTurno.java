package LogicaDeNegocio;

import java.io.Serializable;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
@Entity
public class PlantillaTurno implements Serializable{
    @Id
    private int idPlantilla;
    @Basic
    @Temporal(javax.persistence.TemporalType.DATE)
    private Calendar fecha;
    @Basic
    private int duracion;
    @ManyToOne
    private Agenda unaAgenda;
    
  public PlantillaTurno() {
    }

    public PlantillaTurno(Calendar fecha, int duracion, Agenda unaAgenda) {
        this.fecha = fecha;
        this.duracion = duracion;
        this.unaAgenda = unaAgenda;
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

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public Agenda getUnaAgenda() {
        return unaAgenda;
    }

    public void setUnaAgenda(Agenda unaAgenda) {
        this.unaAgenda = unaAgenda;
    }

}
