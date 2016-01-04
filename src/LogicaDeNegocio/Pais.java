
package LogicaDeNegocio;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import javax.persistence.*;
import javax.persistence.Id;

@Entity
public class Pais implements Serializable{
    @Id @GeneratedValue(strategy=GenerationType.AUTO)
    private int idPais;
    @Basic
    private String nombrePais;

    public Pais() {
    }

    @Override
    public String toString() {
        return nombrePais;
    }

    
    public Pais(String nombrePais) {
        this.nombrePais = nombrePais;
    }

    public int getIdPais() {
        return idPais;
    }

    public void setIdPais(int idPais) {
        this.idPais = idPais;
    }

    public String getNombrePais() {
        return nombrePais;
    }

    public void setNombrePais(String nombrePais) {
        this.nombrePais = nombrePais;
    }
    
}
