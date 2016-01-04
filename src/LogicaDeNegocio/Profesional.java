
package LogicaDeNegocio;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Entity
public class Profesional extends Persona implements Serializable{
    @Basic
    private int matricula;
    @OneToOne
    private Usuario unUsuario;
    @OneToMany
    private List<Agenda> agendas = new LinkedList();

    public Profesional() {
    }

    public Profesional(int matricula, Usuario unUsuario, String nombre, String apellido, String fechaNac, String sexo, long telefonoFijo, long telefonoCelular, long documento, String eMail, TipoDocumento unTipoDocumento, Domicilio unDomicilio) {
        super(nombre, apellido, fechaNac, sexo, telefonoFijo, telefonoCelular, documento, eMail, unTipoDocumento, unDomicilio);
        this.matricula = matricula;
        this.unUsuario = unUsuario;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public Usuario getUnUsuario() {
        return unUsuario;
    }

    public void setUnUsuario(Usuario unUsuario) {
        this.unUsuario = unUsuario;
    }

    public List<Agenda> getAgendas() {
        return agendas;
    }

    public void setAgendas(List<Agenda> agendas) {
        this.agendas = agendas;
    }

}
