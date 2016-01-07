
package LogicaDeNegocio;

import java.io.Serializable;
import javax.persistence.*;
@Entity
public class Domicilio implements Serializable{
    @Id @GeneratedValue(strategy=GenerationType.AUTO)
    private int idDomicilio;
    @Basic
    private String calle;
    @Basic
    private int altura;
    @Basic
    private int piso;
    @Basic
    private String depto;
    @Basic
    private String barrio;
    @Basic
    private int codigoPostal;
    @OneToOne
    private Pais unPais;
    @OneToOne
    private Provincia unaProvincia;
    @OneToOne
    private Localidad unaLocalidad;

    public Domicilio() {
    }

    public Domicilio(String calle, int altura, int piso, String depto, String barrio, int codigoPostal, Pais unPais, Provincia unaProvincia, Localidad unaLocalidad) {
        this.calle = calle;
        this.altura = altura;
        this.piso = piso;
        this.depto = depto;
        this.barrio = barrio;
        this.codigoPostal = codigoPostal;
        this.unPais = unPais;
        this.unaProvincia = unaProvincia;
        this.unaLocalidad = unaLocalidad;
    }

    public int getIdDomicilio() {
        return idDomicilio;
    }

    public void setIdDomicilio(int idDomicilio) {
        this.idDomicilio = idDomicilio;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public String getDepto() {
        return depto;
    }

    public void setDepto(String depto) {
        this.depto = depto;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public Pais getUnPais() {
        return unPais;
    }

    public void setUnPais(Pais unPais) {
        this.unPais = unPais;
    }

    public Provincia getUnaProvincia() {
        return unaProvincia;
    }

    public void setUnaProvincia(Provincia unaProvincia) {
        this.unaProvincia = unaProvincia;
    }

    public Localidad getUnaLocalidad() {
        return unaLocalidad;
    }

    public void setUnaLocalidad(Localidad unaLocalidad) {
        this.unaLocalidad = unaLocalidad;
    }
    
    
    
}
