
package LogicaDeNegocio;


public class Localidad {
    private int idLocalidad;
    private String nombreLocalidad;
    private Provincia unaProvincia;

    public Localidad() {
    }

    public Localidad(int idLocalidad, String nombreLocalidad, Provincia unaProvincia) {
        this.idLocalidad = idLocalidad;
        this.nombreLocalidad = nombreLocalidad;
        this.unaProvincia = unaProvincia;
    }

    public int getIdLocalidad() {
        return idLocalidad;
    }

    public void setIdLocalidad(int idLocalidad) {
        this.idLocalidad = idLocalidad;
    }

    public String getNombreLocalidad() {
        return nombreLocalidad;
    }

    public void setNombreLocalidad(String nombreLocalidad) {
        this.nombreLocalidad = nombreLocalidad;
    }

    public Provincia getUnaProvincia() {
        return unaProvincia;
    }

    public void setUnaProvincia(Provincia unaProvincia) {
        this.unaProvincia = unaProvincia;
    }
    
}
