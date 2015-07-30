
package LogicaDeNegocio;

import java.io.Serializable;
import javax.persistence.Entity;

@Entity
public class ImagenEstudio implements Serializable{
    private Estudio unEstudio;
    private int idImagenEstudio;
    private String comentario;
    private String imagen;

    public ImagenEstudio() {
    }

    public ImagenEstudio(Estudio unEstudio, int idImagenEstudio, String comentario, String imagen) {
        this.unEstudio = unEstudio;
        this.idImagenEstudio = idImagenEstudio;
        this.comentario = comentario;
        this.imagen = imagen;
    }

    public Estudio getUnEstudio() {
        return unEstudio;
    }

    public void setUnEstudio(Estudio unEstudio) {
        this.unEstudio = unEstudio;
    }

    public int getIdImagenEstudio() {
        return idImagenEstudio;
    }

    public void setIdImagenEstudio(int idImagenEstudio) {
        this.idImagenEstudio = idImagenEstudio;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
    
}
