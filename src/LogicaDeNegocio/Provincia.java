/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LogicaDeNegocio;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Entity
public class Provincia implements Serializable{
    @Id @GeneratedValue(strategy=GenerationType.AUTO)
    private int idProvincia;

    @Override
    public String toString() {
        return nombreProvincia;
    }
    @Basic
    private String nombreProvincia;
    @OneToOne
    private Pais unPais;

    public void setUnPais(Pais unPais) {
        this.unPais = unPais;
    }

    public Pais getUnPais() {
        return unPais;
    }
    public Provincia() {
    }

    public Provincia(int idProvincia, String nombreProvincia,Pais unPais) {
        this.idProvincia = idProvincia;
        this.nombreProvincia = nombreProvincia;
        this.unPais = unPais;
    }

    public int getIdProvincia() {
        return idProvincia;
    }

    public void setIdProvincia(int idProvincia) {
        this.idProvincia = idProvincia;
    }

    public String getNombreProvincia() {
        return nombreProvincia;
    }

    public void setNombreProvincia(String nombreProvincia) {
        this.nombreProvincia = nombreProvincia;
    }


}
