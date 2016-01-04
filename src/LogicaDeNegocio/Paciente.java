
package LogicaDeNegocio;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import javax.persistence.*;
@Entity
public class Paciente extends Persona implements Serializable{
    
    @Basic
    private int nroFicha;
    @ManyToMany
    private List<ObraSocial> ObrasSociales  = new LinkedList();
    @OneToMany
    private List<Turno> turnos = new LinkedList();
    
    public Paciente() {
    }

    public Paciente(int nroFicha, String nombre, String apellido, String fechaNac, String sexo, long telefonoFijo, long telefonoCelular, long documento, String eMail, TipoDocumento unTipoDocumento, Domicilio unDomicilio) {
        super(nombre, apellido, fechaNac, sexo, telefonoFijo, telefonoCelular, documento, eMail, unTipoDocumento, unDomicilio);
        this.nroFicha = nroFicha;
    }

    public int getNroFicha() {
        return nroFicha;
    }

    public void setNroFicha(int nroFicha) {
        this.nroFicha = nroFicha;
    }

    public List<ObraSocial> getObrasSociales() {
        return ObrasSociales;
    }

    public void setObrasSociales(LinkedList<ObraSocial> ObrasSociales) {
        this.ObrasSociales = ObrasSociales;
    }
}