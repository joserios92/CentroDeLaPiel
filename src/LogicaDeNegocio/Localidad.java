
package LogicaDeNegocio;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Localidad implements Serializable{
    @Id @GeneratedValue(strategy=GenerationType.AUTO)
    private int idLocalidad;
    @Basic
    private String nombreLocalidad;
    @OneToOne
    private Provincia unaProvincia;

    public Localidad() {
    }

    public Localidad(String nombreLocalidad, Provincia unaProvincia) {
        this.nombreLocalidad = nombreLocalidad;
        this.unaProvincia = unaProvincia;
    }

    public int getIdLocalidad() {
        return idLocalidad;
    }

    public void setIdLocalidad(int idLocalidad) {
        this.idLocalidad = idLocalidad;
    }

    public String getNombreLocalidad() {
        return nombreLocalidad;
    }

    public void setNombreLocalidad(String nombreLocalidad) {
        this.nombreLocalidad = nombreLocalidad;
    }

    public Provincia getUnaProvincia() {
        return unaProvincia;
    }

    public void setUnaProvincia(Provincia unaProvincia) {
        this.unaProvincia = unaProvincia;
    }
    
}
