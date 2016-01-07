package LogicaDeNegocio;

import java.io.Serializable;
import javax.persistence.*;
@Entity
public class Provincia implements Serializable{
    @Id @GeneratedValue(strategy=GenerationType.AUTO)
    private int idProvincia;
    @Basic
    private String nombreProvincia;
    @OneToOne
    private Pais unPais;
    
    public Provincia() {
    }

    public Provincia(String nombreProvincia) {
        this.nombreProvincia = nombreProvincia;
    }

    public int getIdProvincia() {
        return idProvincia;
    }

    public void setIdProvincia(int idProvincia) {
        this.idProvincia = idProvincia;
    }

    public String getNombreProvincia() {
        return nombreProvincia;
    }

    public void setNombreProvincia(String nombreProvincia) {
        this.nombreProvincia = nombreProvincia;
    }

    public void setUnPais(Pais unPais) {
        this.unPais = unPais;
    }

    public Pais getUnPais() {
        return unPais;
    }

    public Provincia(String nombreProvincia, Pais unPais) {
        this.nombreProvincia = nombreProvincia;
        this.unPais = unPais;
    }

    
}
