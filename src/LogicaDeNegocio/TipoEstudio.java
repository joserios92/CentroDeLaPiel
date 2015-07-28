
package LogicaDeNegocio;

import java.util.LinkedList;


public class TipoEstudio {
    
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
