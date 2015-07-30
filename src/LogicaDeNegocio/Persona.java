
package LogicaDeNegocio;

import java.io.Serializable;
import javax.persistence.Entity;
@Entity
public class Persona implements Serializable{
    private int idPersona;
    private String nombre;
    private String apellido;
    private String fechaNac;
    private String sexo;
    private long telefono1;
    private long telefono2;
    private long documento;
    private TipoDocumento unTipoDocumento;
    private Localidad unaLocalidad;
    private String calle;
    private int altura;
    private int piso;
    private String depto;
    private String torre;
    private String barrio;
    private int codigoPostal;

    public Persona() {
    }

    public Persona(int idPersona, String nombre, String apellido, String fechaNac, String sexo, long telefono1, long telefono2, long documento, TipoDocumento unTipoDocumento, Localidad unaLocalidad, String calle, int altura, int piso, String depto, String torre, String barrio, int codigoPostal) {
        this.idPersona = idPersona;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNac = fechaNac;
        this.sexo = sexo;
        this.telefono1 = telefono1;
        this.telefono2 = telefono2;
        this.documento = documento;
        this.unTipoDocumento = unTipoDocumento;
        this.unaLocalidad = unaLocalidad;
        this.calle = calle;
        this.altura = altura;
        this.piso = piso;
        this.depto = depto;
        this.torre = torre;
        this.barrio = barrio;
        this.codigoPostal = codigoPostal;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public long getTelefono1() {
        return telefono1;
    }

    public void setTelefono1(long telefono1) {
        this.telefono1 = telefono1;
    }

    public long getTelefono2() {
        return telefono2;
    }

    public void setTelefono2(long telefono2) {
        this.telefono2 = telefono2;
    }

    public long getDocumento() {
        return documento;
    }

    public void setDocumento(long documento) {
        this.documento = documento;
    }

    public TipoDocumento getUnTipoDocumento() {
        return unTipoDocumento;
    }

    public void setUnTipoDocumento(TipoDocumento unTipoDocumento) {
        this.unTipoDocumento = unTipoDocumento;
    }

    public Localidad getUnaLocalidad() {
        return unaLocalidad;
    }

    public void setUnaLocalidad(Localidad unaLocalidad) {
        this.unaLocalidad = unaLocalidad;
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

    public String getTorre() {
        return torre;
    }

    public void setTorre(String torre) {
        this.torre = torre;
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
    
}
