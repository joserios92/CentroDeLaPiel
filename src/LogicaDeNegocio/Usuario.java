
package LogicaDeNegocio;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class Usuario implements Serializable{
    @Id @GeneratedValue(strategy=GenerationType.AUTO)
    private int idUsuario;
    @Basic
    private String usuario;
    @Basic
    private String contrasenia;
    @OneToOne
    private TipoUsuario tipo;
    
    public Usuario() {
    }

    public Usuario(String user, String pass, TipoUsuario tipo) {
        this.usuario = user;
        this.contrasenia = pass;
        this.tipo = tipo;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUser() {
        return usuario;
    }

    public void setUser(String user) {
        this.usuario = user;
    }

    public String getPass() {
        return contrasenia;
    }

    public void setPass(String pass) {
        this.contrasenia = pass;
    }

    public TipoUsuario getTipo() {
        return tipo;
    }

    public void setTipo(TipoUsuario tipo) {
        this.tipo = tipo;
    }
    
}