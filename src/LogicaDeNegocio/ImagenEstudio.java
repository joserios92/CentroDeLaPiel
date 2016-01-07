
package LogicaDeNegocio;

import java.awt.Image;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class ImagenEstudio implements Serializable{
    @Id @GeneratedValue(strategy=GenerationType.AUTO)
    private int idImagenEstudio;
    @Basic
    private String comentario;
    @Basic
    private String nombreImagen;
    @Basic
    private String archivo;

    public ImagenEstudio() {
    }

    public ImagenEstudio(String comentario, String nombreImagen, String archivo) {
        this.comentario = comentario;
        this.nombreImagen = nombreImagen;
        this.archivo = archivo;
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

    public String getNombreImagen() {
        return nombreImagen;
    }

    public void setNombreImagen(String nombreImagen) {
        this.nombreImagen = nombreImagen;
    }

    public String getArchivo() {
        return archivo;
    }

    public void setArchivo(String archivo) {
        this.archivo = archivo;
    }    
}
