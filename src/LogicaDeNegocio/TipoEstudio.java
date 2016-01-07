
package LogicaDeNegocio;

import java.io.Serializable;
import java.util.LinkedList;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TipoEstudio implements Serializable{
    @Id @GeneratedValue(strategy=GenerationType.AUTO)
    private int idTipoEstudio;
    @Basic
    private String nombreEstudio;
    @Basic
    private int codigoNomenclador;

    public TipoEstudio() {
    }

    public TipoEstudio(String nombreEstudio, int codigoNomenclador) {
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
