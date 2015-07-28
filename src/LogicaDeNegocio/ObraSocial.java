
package LogicaDeNegocio;

import java.util.LinkedList;


public class ObraSocial {
    private LinkedList<Paciente> Pacientes = new LinkedList();
    private int idObraSocial;
    private String nombreObraSocial;

    public ObraSocial() {
    }

    public ObraSocial(int idObraSocial, String nombreObraSocial) {
        this.idObraSocial = idObraSocial;
        this.nombreObraSocial = nombreObraSocial;
    }

    public LinkedList<Paciente> getPacientes() {
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
