
package LogicaDeNegocio;

import Persistencia.ControladoraPersistencia;
import Persistencia.exceptions.NonexistentEntityException;
import Visual.Login;
import java.awt.Image;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Centro {
    LinkedList<Persona> personas = new LinkedList();
    LinkedList<ObraSocial> ObrasSociales = new LinkedList();
    LinkedList<Usuario> Usuarios = new LinkedList();
    ControladoraPersistencia miPersistencia = new ControladoraPersistencia();
    public static void main(String[] args) {
        Login miL = new Login();
        miL.setVisible(true);
        miL.setTitle("Login Centro De La Piel");
        miL.setLocationRelativeTo(null);
    }
    
    public String validarUsuario(String user,String pass){
        String valor=null;
        Usuario unS = this.dameUsuarioPorUser(user);
        
            if(unS!=null){
                if (unS.getPass().equals(pass)) {
                    TipoUsuario tipo = unS.getTipo();
                    if(tipo.getTipo().equals("Profesional")){
                        valor="Profesional";
                    }
                    if (tipo.getTipo().equals("Secretario")) {
                        valor="Secretario";
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
    public int dameUltimoNumeroDeFicha(){
        int num = 0;
        int ultimoNum = 0;
        List<Paciente> pacientes = this.miPersistencia.damePacientes();
        for (Paciente unP:pacientes) {
            if (unP.getNroFicha()>ultimoNum) {
                num = unP.getNroFicha();
            }

        }
        return num;
    }
    //              METODOS AGENDA

    public void crearAgenda(Calendar fechaInicio, Calendar fechaFin, int duracion) throws Exception {
        Calendar fechaAplicada = Calendar.getInstance();
        Agenda unaAgenda = new Agenda(fechaInicio,fechaFin,fechaAplicada);
        this.miPersistencia.crearAgenda(unaAgenda);
        Calendar fecha = fechaInicio;
        if (unaAgenda!=null) {
            do{
                if ((fecha.getTime().getDay()!=6)&&(fecha.getTime().getDay()!=0)) {
                    this.crearPlantillaTurno(duracion, unaAgenda, duracion, duracion, duracion)
                }
                
            }while();
            
        }
    }

    public void editarAgenda(Agenda miAgenda) throws Exception{
        this.miPersistencia.editarAgenda(miAgenda);
    }

    public void eliminarAgenda(int id) throws NonexistentEntityException{
        this.miPersistencia.eliminarAgenda(id);
    }

    public Agenda dameAgenda(int id) {
        return this.miPersistencia.dameAgenda(id);
    }
    public List<Agenda> dameAgendas() {
        return this.miPersistencia.dameAgendas();
    }
    //              METODOS DOMICILIO

    public Domicilio crearDomicilio(String calle,int altura,int piso,String depto,String barrio,int codigoPostal,Pais unPais,Provincia unaProvincia,Localidad unaLocalidad) throws Exception {
        Domicilio unDomicilio = new Domicilio(calle,altura,piso,depto,barrio,codigoPostal,unPais,unaProvincia,unaLocalidad);
        this.miPersistencia.crearDomicilio(unDomicilio);
        Domicilio unD = this.dameUltimoDomicilio(unDomicilio);
        return unD;
    }

    public void editarDomicilio(Domicilio miDomicilio) throws Exception{
        this.miPersistencia.editarDomicilio(miDomicilio);
    }

    public void eliminarDomicilio(int idDomicilio) throws NonexistentEntityException{
        this.miPersistencia.eliminarDomicilio(idDomicilio);
    }

    public Domicilio dameDomicilio(int idDomicilio) {
        return this.miPersistencia.dameDomicilio(idDomicilio);
    }

    public List<Domicilio> dameDomicilios() {
        return this.miPersistencia.dameDomicilios();
    }
    
    public Domicilio dameUltimoDomicilio(Domicilio unD){
    List<Domicilio> domicilios = this.dameDomicilios();
    int index = domicilios.indexOf(unD);
    Domicilio unDom = domicilios.get(index);
    return unDom;
    }
    //              METODOS ESTADOTURNO

    public EstadoTurno crearEstadoTurno(int idEstadoTurno, String nombreEstado) throws Exception {
        EstadoTurno unEstadoTurno = new EstadoTurno(idEstadoTurno,nombreEstado);
        this.miPersistencia.crearEstadoTurno(unEstadoTurno);
        return this.dameEstadoTurno(idEstadoTurno);
    }

    public void editarEstadoTurno(EstadoTurno miEstadoTurno) throws Exception{
        this.miPersistencia.editarEstadoTurno(miEstadoTurno);
    }

    public void eliminarEstadoTurno(int id) throws NonexistentEntityException{
        this.miPersistencia.eliminarEstadoTurno(id);
    }

    public EstadoTurno dameEstadoTurno(int id) {
        return this.miPersistencia.dameEstadoTurno(id);
    }
    public List<EstadoTurno> dameEstadoTurnos() {
        return this.miPersistencia.dameEstadoTurnos();
    }
    
    //              METODOS ESTUDIO

    public Estudio crearEstudio(Paciente unPaciente, int idEstudio, String comentario, String fecha) throws Exception {
        Estudio unEstudio = new Estudio(unPaciente,idEstudio,comentario,fecha);
        this.miPersistencia.crearEstudio(unEstudio);
        return this.miPersistencia.dameEstudio(idEstudio);
    }

    public void editarEstudio(Estudio miEstudio) throws Exception{
        this.miPersistencia.editarEstudio(miEstudio);
    }

    public void eliminarEstudio(int id) throws NonexistentEntityException{
        this.miPersistencia.eliminarEstudio(id);
    }

    public Estudio dameEstudio(int id) {
        return this.miPersistencia.dameEstudio(id);
    }
    public List<Estudio> dameEstudios() {
        return this.miPersistencia.dameEstudios();
    }
    
    //              METODOS IMAGENESTUDIO

    public ImagenEstudio crearImagenEstudio(int idImagenEstudio, String comentario, String nombreImagen, String archivo) throws Exception {
        ImagenEstudio unImagenEstudio = new ImagenEstudio(idImagenEstudio,comentario,nombreImagen,archivo);
        this.miPersistencia.crearImagenEstudio(unImagenEstudio);
        return this.miPersistencia.dameImagenEstudio(idImagenEstudio);
    }

    public void editarImagenEstudio(ImagenEstudio miImagenEstudio) throws Exception{
        this.miPersistencia.editarImagenEstudio(miImagenEstudio);
    }

    public void eliminarImagenEstudio(int id) throws NonexistentEntityException{
        this.miPersistencia.eliminarImagenEstudio(id);
    }

    public ImagenEstudio dameImagenEstudio(int id) {
        return this.miPersistencia.dameImagenEstudio(id);
    }
    public List<ImagenEstudio> dameImagenEstudios() {
        return this.miPersistencia.dameImagenEstudios();
    }
    
    //              METODOS LOCALIDAD

    public Localidad crearLocalidad(int idLocalidad, String nombreLocalidad, Provincia unaProvincia) throws Exception {
        Localidad unaLocalidad = new Localidad(idLocalidad,nombreLocalidad,unaProvincia);
        this.miPersistencia.crearLocalidad(unaLocalidad);
        return this.miPersistencia.dameLocalidad(idLocalidad);
    }

    public void editarLocalidad(Localidad miLocalidad) throws Exception{
        this.miPersistencia.editarLocalidad(miLocalidad);
    }

    public void eliminarLocalidad(int id) throws NonexistentEntityException{
        this.miPersistencia.eliminarLocalidad(id);
    }

    public Localidad dameLocalidad(int id) {
        return this.miPersistencia.dameLocalidad(id);
    }
    public List<Localidad> dameLocalidades() {
        return this.miPersistencia.dameLocalidades();
    }
    
    //              METODOS OBRASOCIAL

    public ObraSocial crearObraSocial(int idObraSocial, String nombreObraSocial) throws Exception {
        ObraSocial unaObraSocial = new ObraSocial(idObraSocial,nombreObraSocial);
        this.miPersistencia.crearObraSocial(unaObraSocial);
        return this.miPersistencia.dameObraSocial(idObraSocial);
    }

    public void editarObraSocial(ObraSocial miObraSocial) throws Exception{
        this.miPersistencia.editarObraSocial(miObraSocial);
    }

    public void eliminarObraSocial(int id) throws NonexistentEntityException{
        this.miPersistencia.eliminarObraSocial(id);
    }

    public ObraSocial dameObraSocial(int id) {
        return this.miPersistencia.dameObraSocial(id);
    }
    public List<ObraSocial> dameObraSociales() {
        return this.miPersistencia.dameObraSociales();
    }
    
    //              METODOS PACIENTE    

    public Paciente crearPaciente(int nroFicha, String nombre, String apellido, String fechaNac, String sexo, long telefonoFijo, long telefonoCelular, long documento, String eMail, TipoDocumento unTipoDocumento, Domicilio unDomicilio) throws Exception {
        Paciente unPaciente = new Paciente(nroFicha,nombre,apellido,fechaNac,sexo,telefonoFijo,telefonoCelular,documento,eMail,unTipoDocumento,unDomicilio);
        this.miPersistencia.crearPaciente(unPaciente);
        return this.miPersistencia.damePaciente(nroFicha);
    }

    public void editarPaciente(Paciente miPaciente) throws Exception{
        this.miPersistencia.editarPaciente(miPaciente);
    }

    public void eliminarPaciente(int id) throws NonexistentEntityException{
        this.miPersistencia.eliminarPaciente(id);
    }

    public Paciente damePaciente(int id) {
        return this.miPersistencia.damePaciente(id);
    }
    public List<Paciente> damePacientes() {
        return this.miPersistencia.damePacientes();
    }
    public Paciente damePacientePorDatos(int nroFicha,String apellido,String nombre,long nroDoc){
        Paciente unP=null;
        if (nroFicha!=0){
            unP = this.buscarPacientePorNroFicha(nroFicha);
        }else{
            if (!apellido.isEmpty()) {
                if (!nombre.isEmpty()) {
                    unP = this.buscarPacientePorApellidoYNombre(apellido,nombre);
                }
            }else{
                if (nroDoc!=0) {
                   unP = this.buscarPacientePorNroDoc(nroDoc);     
                }
                
            }
        }
        return unP;
    }
    public Paciente buscarPacientePorNroFicha(int nroFicha){
        Paciente unP=null;
        List<Paciente> pacientes = this.miPersistencia.damePacientes();
        for (Paciente unPa:pacientes) {
            if (unPa.getNroFicha()==nroFicha) {
                unP=unPa;
            }
        }
        return unP;
    }
    public Paciente buscarPacientePorApellidoYNombre(String apellido,String nombre){
        Paciente unP=null;
        List<Paciente> pacientes = this.miPersistencia.damePacientes();
        for (Paciente unPa:pacientes) {
            if (unPa.getApellido().equals(apellido)) {
                if(unPa.getNombre().equals(nombre)){
                    unP=unPa;
                }
            }
        }
        return unP;
    }
    public Paciente buscarPacientePorNroDoc(long nroDoc){
        Paciente unP=null;
        List<Paciente> pacientes = this.miPersistencia.damePacientes();
        for (Paciente unPa:pacientes) {
            if (unPa.getDocumento()==nroDoc) {
                unP=unPa;
            }
        }
        return unP;
    }
    
    //              METODOS PAIS

    public Pais crearPais(int idPais, String nombrePais) throws Exception {
        Pais unPais = new Pais(idPais,nombrePais);
        this.miPersistencia.crearPais(unPais);
        return this.miPersistencia.damePais(idPais);
    }

    public void editarPais(Pais miPais) throws Exception{
        this.miPersistencia.editarPais(miPais);
    }

    public void eliminarPais(int id) throws NonexistentEntityException{
        this.miPersistencia.eliminarPais(id);
    }

    public Pais damePais(int id) {
        return this.miPersistencia.damePais(id);
    }
    public List<Pais> damePaises() {
        return this.miPersistencia.damePaises();
    }
    
    //              METODOS PERSONA

    public Persona crearPersona(String nombre, String apellido, String fechaNac, String sexo, long telefonoFijo, long telefonoCelular, long documento, String eMail, TipoDocumento unTipoDocumento, Domicilio unDomicilio) throws Exception {
        Persona unaPersona = new Persona(nombre,apellido,fechaNac,sexo,telefonoFijo,telefonoCelular,documento,eMail,unTipoDocumento,unDomicilio);
        this.miPersistencia.crearPersona(unaPersona);
        Persona unaP = this.damePersonaPorNombre(nombre,apellido,documento);
        return this.miPersistencia.damePersona(unaP.getIdPersona());
    }

    public void editarPersona(Persona miPersona) throws Exception{
        this.miPersistencia.editarPersona(miPersona);
    }

    public void eliminarPersona(int id) throws NonexistentEntityException{
        this.miPersistencia.eliminarPersona(id);
    }

    public Persona damePersona(int id) {
        return this.miPersistencia.damePersona(id);
    }
    public List<Persona> damePersonas() {
        return this.miPersistencia.damePersonas();
    }
    public Persona damePersonaPorNombre(String nombre,String apellido,long documento){
    Persona unaP = null;
    List<Persona> personas = this.miPersistencia.damePersonas();
        for (Persona unaPers:personas) {
            if (unaPers.getApellido().equals(apellido)) {
                if (unaPers.getNombre().equals(nombre)) {
                    if (unaPers.getDocumento()==documento) {
                        unaP = unaPers;
                    }
                }
            }
        }
    return unaP;
    }
    //              METODOS PLANTILLATURNO

    public PlantillaTurno crearPlantillaTurno(int idPlantilla, Agenda unaAgenda, int dia, int hora, int duracion) throws Exception {
        PlantillaTurno unaPlantillaTurno = new PlantillaTurno(idPlantilla,unaAgenda,dia,hora,duracion);
        this.miPersistencia.crearPlantillaTurno(unaPlantillaTurno);
        return this.miPersistencia.damePlantillaTurno(idPlantilla);
    }

    public void editarPlantillaTurno(PlantillaTurno miPlantillaTurno) throws Exception{
        this.miPersistencia.editarPlantillaTurno(miPlantillaTurno);
    }

    public void eliminarPlantillaTurno(int id) throws NonexistentEntityException{
        this.miPersistencia.eliminarPlantillaTurno(id);
    }

    public PlantillaTurno damePlantillaTurno(int id) {
        return this.miPersistencia.damePlantillaTurno(id);
    }
    public List<PlantillaTurno> damePlantillaTurnos() {
        return this.miPersistencia.damePlantillaTurnos();
    }
    
    //              METODOS PROFESIONAL

    public Profesional crearProfesional(int matricula, Usuario unUsuario, String nombre, String apellido, String fechaNac, String sexo, long telefonoFijo, long telefonoCelular, long documento, String eMail, TipoDocumento unTipoDocumento, Domicilio unDomicilio) throws Exception {
        Profesional unProfesional = new Profesional(matricula,unUsuario,nombre,apellido,fechaNac,sexo,telefonoFijo,telefonoCelular,documento,eMail,unTipoDocumento,unDomicilio);
        this.miPersistencia.crearProfesional(unProfesional);
        return this.miPersistencia.dameProfesional(matricula);
    }

    public void editarProfesional(Profesional miProfesional) throws Exception{
        this.miPersistencia.editarProfesional(miProfesional);
    }

    public void eliminarProfesional(int id) throws NonexistentEntityException{
        this.miPersistencia.eliminarProfesional(id);
    }

    public Profesional dameProfesional(int id) {
        return this.miPersistencia.dameProfesional(id);
    }
    public List<Profesional> dameProfesionales() {
        return this.miPersistencia.dameProfesionales();
    }
    
    //              METODOS PROVINCIA

    public Provincia crearProvincia(int idProvincia, String nombreProvincia) throws Exception {
        Provincia unaProvincia = new Provincia(idProvincia, nombreProvincia);
        this.miPersistencia.crearProvincia(unaProvincia);
        return this.miPersistencia.dameProvincia(idProvincia);
    }

    public void editarProvincia(Provincia miProvincia) throws Exception{
        this.miPersistencia.editarProvincia(miProvincia);
    }

    public void eliminarProvincia(int id) throws NonexistentEntityException{
        this.miPersistencia.eliminarProvincia(id);
    }

    public Provincia dameProvincia(int id) {
        return this.miPersistencia.dameProvincia(id);
    }
    public List<Provincia> dameProvincias() {
        return this.miPersistencia.dameProvincias();
    }
    
    //              METODOS TIPODOCUMENTO

    public TipoDocumento crearTipoDocumento(int idTipo, String nombreTipo) throws Exception {
        TipoDocumento unTipoDocumento = new TipoDocumento(idTipo,nombreTipo);
        this.miPersistencia.crearTipoDocumento(unTipoDocumento);
        return this.miPersistencia.dameTipoDocumento(idTipo);
    }

    public void editarTipoDocumento(TipoDocumento miTipoDocumento) throws Exception{
        this.miPersistencia.editarTipoDocumento(miTipoDocumento);
    }

    public void eliminarTipoDocumento(int id) throws NonexistentEntityException{
        this.miPersistencia.eliminarTipoDocumento(id);
    }

    public TipoDocumento dameTipoDocumento(int id) {
        return this.miPersistencia.dameTipoDocumento(id);
    }
    public List<TipoDocumento> dameTipoDocumentos() {
        return this.miPersistencia.dameTipoDocumentos();
    }
    
     //              METODOS TIPOESTUDIO

    public TipoEstudio crearTipoEstudio(int idTipoEstudio, String nombreEstudio, int codigoNomenclador) throws Exception {
        TipoEstudio unTipoEstudio = new TipoEstudio(idTipoEstudio,nombreEstudio,codigoNomenclador);
        this.miPersistencia.crearTipoEstudio(unTipoEstudio);
        return this.miPersistencia.dameTipoEstudio(idTipoEstudio);
    }

    public void editarTipoEstudio(TipoEstudio miTipoEstudio) throws Exception{
        this.miPersistencia.editarTipoEstudio(miTipoEstudio);
    }

    public void eliminarTipoEstudio(int id) throws NonexistentEntityException{
        this.miPersistencia.eliminarTipoEstudio(id);
    }

    public TipoEstudio dameTipoEstudio(int id) {
        return this.miPersistencia.dameTipoEstudio(id);
    }
    public List<TipoEstudio> dameTipoEstudios() {
        return this.miPersistencia.dameTipoEstudios();
    }
     //              METODOS TURNO

    public Turno crearTurno(Date fecha, int hora, EstadoTurno unEstadoTurno) throws Exception {
        Turno unTurno = new Turno(fecha,hora,unEstadoTurno);
        this.miPersistencia.crearTurno(unTurno);
        return this.dameTurnoPorFechaYHora(fecha,hora);
    }

    public void editarTurno(Turno miTurno) throws Exception{
        this.miPersistencia.editarTurno(miTurno);
    }

    public void eliminarTurno(int id) throws NonexistentEntityException{
        this.miPersistencia.eliminarTurno(id);
    }

    public Turno dameTurno(int id) {
        return this.miPersistencia.dameTurno(id);
    }
    public List<Turno> dameTurnos() {
        return this.miPersistencia.dameTurnos();
    }
    public Turno dameTurnoPorFechaYHora(Date fecha, int hora){
        Turno unTurno = null;
        List<Turno> turnos = this.miPersistencia.dameTurnos();
        for (Turno unT:turnos) {
            if (unT.getFecha().equals(fecha)) {
                if (hora == unT.getHora()) {
                    unTurno = unT;
                }
            }
        }
        return unTurno;
    }
    public List<Turno> dameTurnosPorFecha(Calendar fecha){
        List<Turno> turno = new LinkedList();
        List<Turno> turnos = this.miPersistencia.dameTurnos();
        for (Turno unT:turnos) {
            if(unT.getUnEstadoTurno().getNombreEstado().equals("activo")){
                if (fecha.getTime().getYear()==unT.getFecha().getYear()) {
                    if (fecha.getTime().getMonth()==unT.getFecha().getMonth()) {
                        if (fecha.getTime().getDay()==unT.getFecha().getDay()) {
                            turno.add(unT);
                        }
                    }
                }
            }
        }
        return turno;
    }
    //              METODOS USUARIOS

    public Usuario crearUsuario(String user,String pass, TipoUsuario tipo) throws Exception{
        Usuario miUsuario = new Usuario(user,pass,tipo);
        this.miPersistencia.crearUsuario(miUsuario);
        return this.dameUsuarioPorUser(user);
    }

    public void editarUsuario(Usuario miUsuario) throws Exception{
        this.miPersistencia.editarUsuario(miUsuario);
    }

    public void eliminarUsuario(int id) throws NonexistentEntityException{
        this.miPersistencia.eliminarUsuario(id);
    }

    public Usuario dameUsuario(int id) {
        return this.miPersistencia.dameUsuario(id);
    }

    public List<Usuario> dameUsuarios() {
        return this.miPersistencia.dameUsuarios();
    }
    
    public Usuario dameUsuarioPorUser(String user){
        Usuario unUsuario = null;
        List<Usuario> users = this.miPersistencia.dameUsuarios();
        for (Usuario unS:users) {
            if (unS.getUser().equals(user)) {
                unUsuario = unS;
            }
        }
        return unUsuario;
    }
    //              METODOS TIPOS USUARIOS

    public TipoUsuario crearTipoUsuario(String tipo) throws Exception {
        TipoUsuario miTipoUsuario = new TipoUsuario(tipo);
        this.miPersistencia.crearTipoUsuario(miTipoUsuario);
        TipoUsuario nuevoTipo = this.dameTipoUsuarioPorNombreTipo(tipo);
        return this.miPersistencia.dameTipoUsuario(nuevoTipo.getIdTipoUsuario());
    }

    public void editarTipoUsuario(TipoUsuario miTipoUsuario) throws Exception{
        this.miPersistencia.editarTipoUsuario(miTipoUsuario);
    }

    public void eliminarTipoUsuario(int idTipoUsuario) throws NonexistentEntityException{
        this.miPersistencia.eliminarTipoUsuario(idTipoUsuario);
    }

    public TipoUsuario dameTipoUsuario(int idTipoUsuario) {
        return this.miPersistencia.dameTipoUsuario(idTipoUsuario);
    }

    public List<TipoUsuario> dameTipoUsuarios() {
        return this.miPersistencia.dameTipoUsuarios();
    }
    
    public TipoUsuario dameTipoUsuarioPorNombreTipo(String tipo){
        TipoUsuario unTipo = null;
        List<TipoUsuario> tipos = this.miPersistencia.dameTipoUsuarios();
        for (TipoUsuario unaT:tipos) {
            if (unaT.getTipo().equals(tipo)) {
                unTipo=unaT;
            }
        }
        return unTipo;
    }
}
