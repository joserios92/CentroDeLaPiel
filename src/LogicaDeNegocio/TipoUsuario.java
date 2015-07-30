
package LogicaDeNegocio;

import java.io.Serializable;
import javax.persistence.Entity;

@Entity
public class TipoUsuario implements Serializable{
    private String tipo;

    public TipoUsuario() {
    }

    public TipoUsuario(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
