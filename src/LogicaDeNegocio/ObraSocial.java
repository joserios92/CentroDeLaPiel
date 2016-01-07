
package LogicaDeNegocio;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class ObraSocial implements Serializable{
    @Id @GeneratedValue(strategy=GenerationType.AUTO)
    private int idObraSocial;
    @Basic
    private String nombreObraSocial;
    @ManyToMany
    private List<Paciente> Pacientes = new LinkedList();
    

    public ObraSocial() {
    }

    public ObraSocial(String nombreObraSocial) {
        this.nombreObraSocial = nombreObraSocial;
    }

    public List<Paciente> getPacientes() {
        return Pacientes;
    }

    public void setPacientes(LinkedList<Paciente> Pacientes) {
        this.Pacientes = Pacientes;
    }

    public int getIdObraSocial() {
        return idObraSocial;
    }

    public void setIdObraSocial(int idObraSocial) {
        this.idObraSocial = idObraSocial;
    }

    public String getNombreObraSocial() {
        return nombreObraSocial;
    }

    public void setNombreObraSocial(String nombreObraSocial) {
        this.nombreObraSocial = nombreObraSocial;
    }
    
}
