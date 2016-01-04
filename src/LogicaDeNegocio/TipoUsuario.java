
package LogicaDeNegocio;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TipoUsuario implements Serializable{
    @Id @GeneratedValue(strategy=GenerationType.AUTO)
    private int idTipoUsuario;
    @Basic
    private String nombreTipo;

    public TipoUsuario() {
    }

    public TipoUsuario(String tipo) {
        this.nombreTipo = tipo;
    }

    @Override
    public String toString() {
        return  nombreTipo ;
    }

    public int getIdTipoUsuario() {
        return idTipoUsuario;
    }

    public void setIdTipoUsuario(int idTipoUsuario) {
        this.idTipoUsuario = idTipoUsuario;
    }


    public String getTipo() {
        return nombreTipo;
    }

    public void setTipo(String tipo) {
        this.nombreTipo = tipo;
    }
    
}
