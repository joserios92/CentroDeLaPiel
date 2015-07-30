
package LogicaDeNegocio;

import java.io.Serializable;
import java.util.LinkedList;
import javax.persistence.Entity;

@Entity
public class Estudio implements Serializable{
    private Paciente unPaciente;
    private TipoEstudio unTipoEstudio;
    private LinkedList<ImagenEstudio> imagenEstudios = new LinkedList();
    private int idEstudio;
    private String comentario;
    private String fecha;

    public Estudio() {
    }

    public Estudio(Paciente unPaciente, int idEstudio, String comentario, String fecha) {
        this.unPaciente = unPaciente;
        this.idEstudio = idEstudio;
        this.comentario = comentario;
        this.fecha = fecha;
    }

    public Paciente getUnPaciente() {
        return unPaciente;
    }

    public void setUnPaciente(Paciente unPaciente) {
        this.unPaciente = unPaciente;
    }

    public TipoEstudio getUnTipoEstudio() {
        return unTipoEstudio;
    }

    public void setUnTipoEstudio(TipoEstudio unTipoEstudio) {
        this.unTipoEstudio = unTipoEstudio;
    }

    public LinkedList<ImagenEstudio> getImagenEstudios() {
        return imagenEstudios;
    }

    public void setImagenEstudios(LinkedList<ImagenEstudio> imagenEstudios) {
        this.imagenEstudios = imagenEstudios;
    }

    public int getIdEstudio() {
        return idEstudio;
    }

    public void setIdEstudio(int idEstudio) {
        this.idEstudio = idEstudio;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
}
