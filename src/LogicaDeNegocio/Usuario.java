
package LogicaDeNegocio;

public class Usuario {
    
    private String user;
    
    private String pass;
    
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