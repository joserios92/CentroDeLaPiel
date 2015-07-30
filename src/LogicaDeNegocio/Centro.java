
package LogicaDeNegocio;

import Persistencia.ControladoraPersistencia;
import Visual.Login;
import java.util.LinkedList;
import java.util.List;


public class Centro {
    LinkedList<Persona> personas = new LinkedList();
    LinkedList<ObraSocial> ObrasSociales = new LinkedList();
    LinkedList<Usuario> Usuarios = new LinkedList();
    ControladoraPersistencia miPersistencia = new ControladoraPersistencia();
    public static void main(String[] args) {
        Login miL = new Login();
        miL.setVisible(true);
        miL.setTitle("Login Centro De La Piel");
    }
    
    public String validarUsuario(String user,String pass){
        String valor=null;
        Usuario unS = this.miPersistencia.dameUsuario(user);
        
            if(unS!=null){
                if (unS.getPass().equals(pass)) {
                    TipoUsuario tipo = unS.getTipo();
                    if(tipo.getTipo().equals("Secretario")){
                        valor="Secretario";
                    }
                    if (tipo.getTipo().equals("Abogado")) {
                        valor="Abogado";
                    }
                    if (tipo.getTipo().equals("Administrador")) {
                        valor = "Administrador";
                    }
                 }
            }else{
                valor=null;
            }
        
       
    return valor;
    }
    
    //              METODOS AGENDA

    public Agenda crearAgenda(String apellido,String nombres,Localidad localidad,String domicilio,String email,String tel,String cel,String dni,String sexo,String fecha) {
        
        return this.miPersistencia.crearAgenda(unAgenda);
    }

    public void editarAgenda(Agenda miAgenda){
        this.miPersistencia.editarAgenda(miAgenda);
    }

    public void eliminarAgenda(int id){
        this.miPersistencia.eliminarAgenda(id);
    }

    public Agenda dameAgenda(int id) {
        return this.miPersistencia.dameAgenda(id);
    }
    public List<Agenda> dameAgendas() {
        return this.miPersistencia.dameAgenda();
    }
    
    //              METODOS ESTADOTURNO

    public EstadoTurno crearEstadoTurno() {
        
        return this.miPersistencia.crearEstadoTurno(unEstadoTurno);
    }

    public void editarEstadoTurno(EstadoTurno miEstadoTurno){
        this.miPersistencia.editarEstadoTurno(miEstadoTurno);
    }

    public void eliminarEstadoTurno(int id){
        this.miPersistencia.eliminarEstadoTurno(id);
    }

    public EstadoTurno dameEstadoTurno(int id) {
        return this.miPersistencia.dameEstadoTurno(id);
    }
    public List<EstadoTurno> dameEstadoTurnos() {
        return this.miPersistencia.dameEstadoTurno();
    }
    
    //              METODOS ESTUDIO

    public Estudio crearEstudio() {
        
        return this.miPersistencia.crearEstudio(unEstudio);
    }

    public void editarEstudio(Estudio miEstudio){
        this.miPersistencia.editarEstudio(miEstudio);
    }

    public void eliminarEstudio(int id){
        this.miPersistencia.eliminarEstudio(id);
    }

    public Estudio dameEstudio(int id) {
        return this.miPersistencia.dameEstudio(id);
    }
    public List<Estudio> dameEstudios() {
        return this.miPersistencia.dameEstudio();
    }
    
    //              METODOS IMAGENESTUDIO

    public ImagenEstudio crearImagenEstudio() {
        
        return this.miPersistencia.crearImagenEstudio(unImagenEstudio);
    }

    public void editarImagenEstudio(ImagenEstudio miImagenEstudio){
        this.miPersistencia.editarImagenEstudio(miImagenEstudio);
    }

    public void eliminarImagenEstudio(int id){
        this.miPersistencia.eliminarImagenEstudio(id);
    }

    public Agenda dameImagenEstudio(int id) {
        return this.miPersistencia.dameImagenEstudio(id);
    }
    public List<ImagenEstudio> dameImagenEstudios() {
        return this.miPersistencia.dameImagenEstudio();
    }
    
    //              METODOS LOCALIDAD

    public Localidad crearLocalidad() {
        
        return this.miPersistencia.crearLocalidad(unLocalidad);
    }

    public void editarLocalidad(Localidad miLocalidad){
        this.miPersistencia.editarLocalidad(miLocalidad);
    }

    public void eliminarLocalidad(int id){
        this.miPersistencia.eliminarLocalidad(id);
    }

    public Agenda dameLocalidad(int id) {
        return this.miPersistencia.dameLocalidad(id);
    }
    public List<Localidad> dameLocalidades() {
        return this.miPersistencia.dameLocalidades();
    }
    
    //              METODOS OBRASOCIAL

    public ObraSocial crearObraSocial() {
        
        return this.miPersistencia.crearObraSocial(unObraSocial);
    }

    public void editarObraSocial(ObraSocial miObraSocial){
        this.miPersistencia.editarObraSocial(miObraSocial);
    }

    public void eliminarObraSocial(int id){
        this.miPersistencia.eliminarObraSocial(id);
    }

    public Agenda dameObraSocial(int id) {
        return this.miPersistencia.dameObraSocial(id);
    }
    public List<Agenda> dameObraSocials() {
        return this.miPersistencia.dameObraSocial();
    }
}
