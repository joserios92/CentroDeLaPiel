
package LogicaDeNegocio;

import java.io.Serializable;
import java.util.LinkedList;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity
public class Paciente extends Persona implements Serializable{
    
    @Basic
    private int nroFicha;
    @ManyToMany
    private LinkedList<ObraSocial> ObrasSociales  = new LinkedList();

    public Paciente() {
    }

    public Paciente(int nroFicha) {
        this.nroFicha = nroFicha;
    }

    public Paciente(int nroFicha, int idPersona, String nombre, String apellido, String fechaNac, String sexo, long telefono1, long telefono2, long documento, TipoDocumento unTipoDocumento, Localidad unaLocalidad, String calle, int altura, int piso, String depto, String torre, String barrio, int codigoPostal) {
        super(idPersona, nombre, apellido, fechaNac, sexo, telefono1, telefono2, documento, unTipoDocumento, unaLocalidad, calle, altura, piso, depto, torre, barrio, codigoPostal);
        this.nroFicha = nroFicha;
    }

    public int getNroFicha() {
        return nroFicha;
    }

    public void setNroFicha(int nroFicha) {
        this.nroFicha = nroFicha;
    }

    public LinkedList<ObraSocial> getObrasSociales() {
        return ObrasSociales;
    }

    public void setObrasSociales(LinkedList<ObraSocial> ObrasSociales) {
        this.ObrasSociales = ObrasSociales;
    }
    

    
}