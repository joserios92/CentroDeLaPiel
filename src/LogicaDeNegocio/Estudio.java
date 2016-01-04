
package LogicaDeNegocio;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Estudio implements Serializable{
    @Id
    private int idEstudio;
    @Basic
    private String comentario;
    @Basic
    private String fecha;
    @OneToOne
    private Paciente unPaciente;
    @OneToOne
    private TipoEstudio unTipoEstudio;
    @OneToMany
    private List<ImagenEstudio> imagenEstudios = new LinkedList();
    

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

    public List<ImagenEstudio> getImagenEstudios() {
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
