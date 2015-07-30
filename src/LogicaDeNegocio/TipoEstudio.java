
package LogicaDeNegocio;

import java.io.Serializable;
import java.util.LinkedList;
import javax.persistence.Entity;

@Entity
public class TipoEstudio implements Serializable{
    
    private int idTipoEstudio;
    private String nombreEstudio;
    private int codigoNomenclador;

    public TipoEstudio() {
    }

    public TipoEstudio(int idTipoEstudio, String nombreEstudio, int codigoNomenclador) {
        this.idTipoEstudio = idTipoEstudio;
        this.nombreEstudio = nombreEstudio;
        this.codigoNomenclador = codigoNomenclador;
    }

    public int getIdTipoEstudio() {
        return idTipoEstudio;
    }

    public void setIdTipoEstudio(int idTipoEstudio) {
        this.idTipoEstudio = idTipoEstudio;
    }

    public String getNombreEstudio() {
        return nombreEstudio;
    }

    public void setNombreEstudio(String nombreEstudio) {
        this.nombreEstudio = nombreEstudio;
    }

    public int getCodigoNomenclador() {
        return codigoNomenclador;
    }

    public void setCodigoNomenclador(int codigoNomenclador) {
        this.codigoNomenclador = codigoNomenclador;
    }
    
    
}
