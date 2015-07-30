
package LogicaDeNegocio;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class Usuario implements Serializable{
    @Id
    private int idUsuario;
    @Basic
    private String user;
    @Basic
    private String pass;
    @OneToOne
    private TipoUsuario tipo;
    public Usuario() {
    }

    public Usuario(String user, String pass, TipoUsuario tipo) {
        this.user = user;
        this.pass = pass;
        this.tipo = tipo;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public TipoUsuario getTipo() {
        return tipo;
    }

    public void setTipo(TipoUsuario tipo) {
        this.tipo = tipo;
    }
    
}