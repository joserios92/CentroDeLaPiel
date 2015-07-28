
package LogicaDeNegocio;

import java.util.LinkedList;


public class Paciente {
    LinkedList<Turno> Turnos = new LinkedList();
    LinkedList<Estudio> Estudios  = new LinkedList();
    LinkedList<ObraSocial> ObrasSociales  = new LinkedList();
    private String nombre;
    private String apellido;
    private String domicilio;
    private long documento;
    private int ficha;
    private String fechaNac;
    private long telefono1;
    private long telefono2;
}
