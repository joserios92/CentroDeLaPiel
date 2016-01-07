
package LogicaDeNegocio;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
@Entity
public class Persona implements Serializable{
    @Id @GeneratedValue(strategy=GenerationType.AUTO)
    private int idPersona;
    @Basic
    private String nombre;
    @Basic
    private String apellido;
    @Basic
    @Temporal(javax.persistence.TemporalType.DATE)
    private Calendar fechaNac;
    @Basic
    private String sexo;
    @Basic
    private long telefonoFijo;
    @Basic
    private long telefonoCelular;
    @Basic
    private long documento;
    @Basic 
    private String eMail;
    @OneToOne
    private TipoDocumento unTipoDocumento;
    @OneToOne
    private Domicilio unDomicilio;
    
    public Persona() {
    }

    public Persona(String nombre, String apellido, Calendar fechaNac, String sexo, long telefonoFijo, long telefonoCelular, long documento, String eMail, TipoDocumento unTipoDocumento, Domicilio unDomicilio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNac = fechaNac;
        this.sexo = sexo;
        this.telefonoFijo = telefonoFijo;
        this.telefonoCelular = telefonoCelular;
        this.documento = documento;
        this.eMail = eMail;
        this.unTipoDocumento = unTipoDocumento;
        this.unDomicilio = unDomicilio;
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

    public Calendar getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Calendar fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public long getTelefonoFijo() {
        return telefonoFijo;
    }

    public void setTelefonoFijo(long telefonoFijo) {
        this.telefonoFijo = telefonoFijo;
    }

    public long getTelefonoCelular() {
        return telefonoCelular;
    }

    public void setTelefonoCelular(long telefonoCelular) {
        this.telefonoCelular = telefonoCelular;
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

    public Domicilio getUnDomicilio() {
        return unDomicilio;
    }

    public void setUnDomicilio(Domicilio unDomicilio) {
        this.unDomicilio = unDomicilio;
    }
    
}