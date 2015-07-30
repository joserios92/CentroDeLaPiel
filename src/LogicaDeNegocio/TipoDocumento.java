
package LogicaDeNegocio;

import java.io.Serializable;
import javax.persistence.Entity;
@Entity
public class TipoDocumento implements Serializable{
    private int idTipo;
    private String nombreTipo;

    public TipoDocumento() {
    }

    public TipoDocumento(int idTipo, String nombreTipo) {
        this.idTipo = idTipo;
        this.nombreTipo = nombreTipo;
    }

    public int getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(int idTipo) {
        this.idTipo = idTipo;
    }

    public String getNombreTipo() {
        return nombreTipo;
    }

    public void setNombreTipo(String nombreTipo) {
        this.nombreTipo = nombreTipo;
    }
    
}
