
package LogicaDeNegocio;

import java.io.Serializable;
import java.util.LinkedList;
import javax.persistence.Entity;

@Entity
public class Paciente implements Serializable{
    
    private LinkedList<ObraSocial> ObrasSociales  = new LinkedList();
    private int nroFicha;
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