
package Visual;

import LogicaDeNegocio.*;
import Persistencia.exceptions.NonexistentEntityException;
import java.awt.Image;
import java.util.Calendar;
import java.util.Date;
import java.util.List;


public class ControladoraVisual {
    Centro miCentro = new Centro();
    
    public String validarUsuario(String usuario,String contrasenia){
         return miCentro.validarUsuario(usuario,contrasenia);
    }
    public int dameUltimoNumeroDeFicha(){
        return miCentro.dameUltimoNumeroDeFicha();
    }
        
    //              METODOS AGENDA

    public void crearAgenda(int idAgenda, String fechaInicio, String fechaFin, String fechaGenerada, String fechaAplicada) throws Exception {
        this.miCentro.crearAgenda(idAgenda,fechaInicio,fechaFin,fechaGenerada,fechaAplicada);
    }

    public void editarAgenda(Agenda miAgenda) throws Exception{
        this.miCentro.editarAgenda(miAgenda);
    }

    public void eliminarAgenda(int id) throws NonexistentEntityException{
        this.miCentro.eliminarAgenda(id);
    }

    public Agenda dameAgenda(int id) {
        return this.miCentro.dameAgenda(id);
    }
    public List<Agenda> dameAgendas() {
        return this.miCentro.dameAgendas();
    }
    //              METODOS DOMICILIO

    public Domicilio crearDomicilio(String calle,int altura,int piso,String depto,String barrio,int codigoPostal,Pais unPais,Provincia unaProvincia,Localidad unaLocalidad) throws Exception {
        return this.miCentro.crearDomicilio(calle,altura,piso,depto,barrio,codigoPostal,unPais,unaProvincia,unaLocalidad);
    }

    public void editarDomicilio(Domicilio miDomicilio) throws Exception{
        this.miCentro.editarDomicilio(miDomicilio);
    }

    public void eliminarDomicilio(int idDomicilio) throws NonexistentEntityException{
        this.miCentro.eliminarDomicilio(idDomicilio);
    }

    public Domicilio dameDomicilio(int idDomicilio) {
        return this.miCentro.dameDomicilio(idDomicilio);
    }

    public List<Domicilio> dameDomicilios() {
        return this.miCentro.dameDomicilios();
    }
    
    //              METODOS ESTADOTURNO

    public EstadoTurno crearEstadoTurno(int idEstadoTurno, String nombreEstado) throws Exception {
        this.miCentro.crearEstadoTurno(idEstadoTurno,nombreEstado);
        return this.dameEstadoTurno(idEstadoTurno);
    }

    public void editarEstadoTurno(EstadoTurno miEstadoTurno) throws Exception{
        this.miCentro.editarEstadoTurno(miEstadoTurno);
    }

    public void eliminarEstadoTurno(int id) throws NonexistentEntityException{
        this.miCentro.eliminarEstadoTurno(id);
    }

    public EstadoTurno dameEstadoTurno(int id) {
        return this.miCentro.dameEstadoTurno(id);
    }
    public List<EstadoTurno> dameEstadoTurnos() {
        return this.miCentro.dameEstadoTurnos();
    }
    
    //              METODOS ESTUDIO

    public Estudio crearEstudio(Paciente unPaciente, int idEstudio, String comentario, String fecha) throws Exception {
        return this.miCentro.crearEstudio(unPaciente,idEstudio,comentario,fecha);
    }

    public void editarEstudio(Estudio miEstudio) throws Exception{
        this.miCentro.editarEstudio(miEstudio);
    }

    public void eliminarEstudio(int id) throws NonexistentEntityException{
        this.miCentro.eliminarEstudio(id);
    }

    public Estudio dameEstudio(int id) {
        return this.miCentro.dameEstudio(id);
    }
    public List<Estudio> dameEstudios() {
        return this.miCentro.dameEstudios();
    }
    
    //              METODOS IMAGENESTUDIO

    public ImagenEstudio crearImagenEstudio(int idImagenEstudio, String comentario, String nombreImagen, String archivo) throws Exception {
        return this.miCentro.crearImagenEstudio(idImagenEstudio,comentario,nombreImagen,archivo);
    }

    public void editarImagenEstudio(ImagenEstudio miImagenEstudio) throws Exception{
        this.miCentro.editarImagenEstudio(miImagenEstudio);
    }

    public void eliminarImagenEstudio(int id) throws NonexistentEntityException{
        this.miCentro.eliminarImagenEstudio(id);
    }

    public ImagenEstudio dameImagenEstudio(int id) {
        return this.miCentro.dameImagenEstudio(id);
    }
    public List<ImagenEstudio> dameImagenEstudios() {
        return this.miCentro.dameImagenEstudios();
    }
    
    //              METODOS LOCALIDAD

    public Localidad crearLocalidad(int idLocalidad, String nombreLocalidad, Provincia unaProvincia) throws Exception {
        return this.miCentro.crearLocalidad(idLocalidad,nombreLocalidad,unaProvincia);
    }

    public void editarLocalidad(Localidad miLocalidad) throws Exception{
        this.miCentro.editarLocalidad(miLocalidad);
    }

    public void eliminarLocalidad(int id) throws NonexistentEntityException{
        this.miCentro.eliminarLocalidad(id);
    }

    public Localidad dameLocalidad(int id) {
        return this.miCentro.dameLocalidad(id);
    }
    public List<Localidad> dameLocalidades() {
        return this.miCentro.dameLocalidades();
    }
    
    //              METODOS OBRASOCIAL

    public ObraSocial crearObraSocial(int idObraSocial, String nombreObraSocial) throws Exception {
        return this.miCentro.crearObraSocial(idObraSocial,nombreObraSocial);
    }

    public void editarObraSocial(ObraSocial miObraSocial) throws Exception{
        this.miCentro.editarObraSocial(miObraSocial);
    }

    public void eliminarObraSocial(int id) throws NonexistentEntityException{
        this.miCentro.eliminarObraSocial(id);
    }

    public ObraSocial dameObraSocial(int id) {
        return this.miCentro.dameObraSocial(id);
    }
    public List<ObraSocial> dameObraSociales() {
        return this.miCentro.dameObraSociales();
    }
    
    //              METODOS PACIENTE    

    public Paciente crearPaciente(int nroFicha, String nombre, String apellido, String fechaNac, String sexo, long telefonoFijo, long telefonoCelular, long documento, String eMail, TipoDocumento unTipoDocumento, Domicilio unDomicilio) throws Exception {
        return this.miCentro.crearPaciente(nroFicha,nombre,apellido,fechaNac,sexo,telefonoFijo,telefonoCelular,documento,eMail,unTipoDocumento,unDomicilio);
    }

    public void editarPaciente(Paciente miPaciente) throws Exception{
        this.miCentro.editarPaciente(miPaciente);
    }

    public void eliminarPaciente(int id) throws NonexistentEntityException{
        this.miCentro.eliminarPaciente(id);
    }

    public Paciente damePaciente(int id) {
        return this.miCentro.damePaciente(id);
    }
    public List<Paciente> damePacientes() {
        return this.miCentro.damePacientes();
    }
    public Paciente damePacientePorDatos(int nroFicha, String apellido,String nombre, long nroDoc){
        return this.miCentro.damePacientePorDatos(nroFicha,apellido,nombre,nroDoc);
    }
    //              METODOS PAIS

    public Pais crearPais(int idPais, String nombrePais) throws Exception {
        return this.miCentro.crearPais(idPais,nombrePais);
    }

    public void editarPais(Pais miPais) throws Exception{
        this.miCentro.editarPais(miPais);
    }

    public void eliminarPais(int id) throws NonexistentEntityException{
        this.miCentro.eliminarPais(id);
    }

    public Pais damePais(int id) {
        return this.miCentro.damePais(id);
    }
    public List<Pais> damePaises() {
        return this.miCentro.damePaises();
    }
    
    //              METODOS PERSONA

    public Persona crearPersona(String nombre, String apellido, String fechaNac, String sexo, long telefonoFijo, long telefonoCelular, long documento, String eMail, TipoDocumento unTipoDocumento, Domicilio unDomicilio) throws Exception {
        return this.miCentro.crearPersona(nombre,apellido,fechaNac,sexo,telefonoFijo,telefonoCelular,documento,eMail,unTipoDocumento,unDomicilio);
    }

    public void editarPersona(Persona miPersona) throws Exception{
        this.miCentro.editarPersona(miPersona);
    }

    public void eliminarPersona(int id) throws NonexistentEntityException{
        this.miCentro.eliminarPersona(id);
    }

    public Persona damePersona(int id) {
        return this.miCentro.damePersona(id);
    }
    public List<Persona> damePersonas() {
        return this.miCentro.damePersonas();
    }
    
    //              METODOS PLANTILLATURNO

    public PlantillaTurno crearPlantillaTurno(int idPlantilla, Agenda unaAgenda, int dia, int hora, int duracion) throws Exception {
        return this.miCentro.crearPlantillaTurno(idPlantilla,unaAgenda,dia,hora,duracion);
    }

    public void editarPlantillaTurno(PlantillaTurno miPlantillaTurno) throws Exception{
        this.miCentro.editarPlantillaTurno(miPlantillaTurno);
    }

    public void eliminarPlantillaTurno(int id) throws NonexistentEntityException{
        this.miCentro.eliminarPlantillaTurno(id);
    }

    public PlantillaTurno damePlantillaTurno(int id) {
        return this.miCentro.damePlantillaTurno(id);
    }
    public List<PlantillaTurno> damePlantillaTurnos() {
        return this.miCentro.damePlantillaTurnos();
    }
    
    //              METODOS PROFESIONAL

    public Profesional crearProfesional(int matricula, Usuario unUsuario, String nombre, String apellido, String fechaNac, String sexo, long telefonoFijo, long telefonoCelular, long documento, String eMail, TipoDocumento unTipoDocumento, Domicilio unDomicilio) throws Exception {
        return this.miCentro.crearProfesional(matricula,unUsuario,nombre,apellido,fechaNac,sexo,telefonoFijo,telefonoCelular,documento,eMail,unTipoDocumento,unDomicilio);
    }

    public void editarProfesional(Profesional miProfesional) throws Exception{
        this.miCentro.editarProfesional(miProfesional);
    }

    public void eliminarProfesional(int id) throws NonexistentEntityException{
        this.miCentro.eliminarProfesional(id);
    }

    public Profesional dameProfesional(int id) {
        return this.miCentro.dameProfesional(id);
    }
    public List<Profesional> dameProfesionales() {
        return this.miCentro.dameProfesionales();
    }
    
    //              METODOS PROVINCIA

    public Provincia crearProvincia(int idProvincia, String nombreProvincia) throws Exception {
        return this.miCentro.crearProvincia(idProvincia, nombreProvincia);
    }

    public void editarProvincia(Provincia miProvincia) throws Exception{
        this.miCentro.editarProvincia(miProvincia);
    }

    public void eliminarProvincia(int id) throws NonexistentEntityException{
        this.miCentro.eliminarProvincia(id);
    }

    public Provincia dameProvincia(int id) {
        return this.miCentro.dameProvincia(id);
    }
    public List<Provincia> dameProvincias() {
        return this.miCentro.dameProvincias();
    }
    
    //              METODOS TIPODOCUMENTO

    public TipoDocumento crearTipoDocumento(int idTipo, String nombreTipo) throws Exception {
        return this.miCentro.crearTipoDocumento(idTipo,nombreTipo);
    }

    public void editarTipoDocumento(TipoDocumento miTipoDocumento) throws Exception{
        this.miCentro.editarTipoDocumento(miTipoDocumento);
    }

    public void eliminarTipoDocumento(int id) throws NonexistentEntityException{
        this.miCentro.eliminarTipoDocumento(id);
    }

    public TipoDocumento dameTipoDocumento(int id) {
        return this.miCentro.dameTipoDocumento(id);
    }
    public List<TipoDocumento> dameTipoDocumentos() {
        return this.miCentro.dameTipoDocumentos();
    }
    
     //              METODOS TIPOESTUDIO

    public TipoEstudio crearTipoEstudio(int idTipoEstudio, String nombreEstudio, int codigoNomenclador) throws Exception {
        return this.miCentro.crearTipoEstudio(idTipoEstudio,nombreEstudio,codigoNomenclador);
    }

    public void editarTipoEstudio(TipoEstudio miTipoEstudio) throws Exception{
        this.miCentro.editarTipoEstudio(miTipoEstudio);
    }

    public void eliminarTipoEstudio(int id) throws NonexistentEntityException{
        this.miCentro.eliminarTipoEstudio(id);
    }

    public TipoEstudio dameTipoEstudio(int id) {
        return this.miCentro.dameTipoEstudio(id);
    }
    public List<TipoEstudio> dameTipoEstudios() {
        return this.miCentro.dameTipoEstudios();
    }
     //              METODOS TURNO

    public Turno crearTurno(Date fecha, int hora,EstadoTurno unEstadoTurno) throws Exception {
        return this.miCentro.crearTurno(fecha,hora,unEstadoTurno);
    }

    public void editarTurno(Turno miTurno) throws Exception{
        this.miCentro.editarTurno(miTurno);
    }

    public void eliminarTurno(int id) throws NonexistentEntityException{
        this.miCentro.eliminarTurno(id);
    }

    public Turno dameTurno(int id) {
        return this.miCentro.dameTurno(id);
    }
    public List<Turno> dameTurnos() {
        return this.miCentro.dameTurnos();
    }
    public List<Turno> dameTurnosPorFecha(Calendar fecha){
        return this.miCentro.dameTurnosPorFecha(fecha);
    }
    //              METODOS USUARIOS

    public Usuario crearUsuario(String user,String pass, TipoUsuario tipo) throws Exception{
        return this.miCentro.crearUsuario(user,pass,tipo);
    }

    public void editarUsuario(Usuario miUsuario) throws Exception{
        this.miCentro.editarUsuario(miUsuario);
    }

    public void eliminarUsuario(int id) throws NonexistentEntityException{
        this.miCentro.eliminarUsuario(id);
    }

    public Usuario dameUsuario(int id) {
        return this.miCentro.dameUsuario(id);
    }

    public List<Usuario> dameUsuarios() {
        return this.miCentro.dameUsuarios();
    }
    //              METODOS TIPOS USUARIOS

    public TipoUsuario crearTipoUsuario(String tipo) throws Exception {
        return this.miCentro.crearTipoUsuario(tipo);
    }

    public void editarTipoUsuario(TipoUsuario miTipoUsuario) throws Exception{
        this.miCentro.editarTipoUsuario(miTipoUsuario);
    }

    public void eliminarTipoUsuario(int idTipoUsuario) throws NonexistentEntityException{
        this.miCentro.eliminarTipoUsuario(idTipoUsuario);
    }

    public TipoUsuario dameTipoUsuario(int idTipoUsuario) {
        return this.miCentro.dameTipoUsuario(idTipoUsuario);
    }

    public List<TipoUsuario> dameTipoUsuarios() {
        return this.miCentro.dameTipoUsuarios();
    }
    
    public TipoUsuario dameTipoUsuarioPorNombreTipo(String nombreTipo){
        return this.miCentro.dameTipoUsuarioPorNombreTipo(nombreTipo);
    }

    
}
