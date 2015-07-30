/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LogicaDeNegocio;

import java.io.Serializable;
import javax.persistence.Entity;

@Entity
public class Turno implements Serializable{
    
    private PlantillaTurno unaPlantilla;
    private Paciente unPaciente;
    private EstadoTurno unEstadoTurno;
    private int idTurno;
    private String fecha;
    private int hora;
    
}
