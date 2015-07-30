
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
    @OneToOne
    private Persona unaPersona;

    public Paciente() {
    }

    public Paciente(int nroFicha, Persona unaPersona) {
        this.nroFicha = nroFicha;
        this.unaPersona = unaPersona;
    }

    public LinkedList<ObraSocial> getObrasSociales() {
        return ObrasSociales;
    }

    public void setObrasSociales(LinkedList<ObraSocial> ObrasSociales) {
        this.ObrasSociales = ObrasSociales;
    }

    public int getNroFicha() {
        return nroFicha;
    }

    public void setNroFicha(int nroFicha) {
        this.nroFicha = nroFicha;
    }

    public Persona getUnaPersona() {
        return unaPersona;
    }

    public void setUnaPersona(Persona unaPersona) {
        this.unaPersona = unaPersona;
    }
   
}