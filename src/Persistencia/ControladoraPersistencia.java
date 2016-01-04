
package Persistencia;

import LogicaDeNegocio.Agenda;
import LogicaDeNegocio.Domicilio;
import LogicaDeNegocio.EstadoTurno;
import LogicaDeNegocio.Estudio;
import LogicaDeNegocio.ImagenEstudio;
import LogicaDeNegocio.Localidad;
import LogicaDeNegocio.ObraSocial;
import LogicaDeNegocio.Paciente;
import LogicaDeNegocio.Pais;
import LogicaDeNegocio.Persona;
import LogicaDeNegocio.PlantillaTurno;
import LogicaDeNegocio.Profesional;
import LogicaDeNegocio.Provincia;
import LogicaDeNegocio.TipoDocumento;
import LogicaDeNegocio.TipoEstudio;
import LogicaDeNegocio.TipoUsuario;
import LogicaDeNegocio.Turno;
import LogicaDeNegocio.Usuario;
import Persistencia.exceptions.NonexistentEntityException;
import java.util.List;


public class ControladoraPersistencia {
    private static final AgendaJpaController miAgendaJpa = new AgendaJpaController();
    private static final DomicilioJpaController miDomicilioJpa = new DomicilioJpaController();
    private static final EstadoTurnoJpaController miEstadoTurnoJpa = new EstadoTurnoJpaController();
    private static final EstudioJpaController miEstudioJpa = new EstudioJpaController();
    private static final ImagenEstudioJpaController miImagenEstudioJpa = new ImagenEstudioJpaController();
    private static final LocalidadJpaController miLocalidadJpa = new LocalidadJpaController();
    private static final ObraSocialJpaController miObraSocialJpa = new ObraSocialJpaController();
    private static final PacienteJpaController miPacienteJpa = new PacienteJpaController();
    private static final PaisJpaController miPaisJpa = new PaisJpaController();
    private static final PersonaJpaController miPersonaJpa = new PersonaJpaController();
    private static final PlantillaTurnoJpaController miPlantillaTurnoJpa = new PlantillaTurnoJpaController();
    private static final ProfesionalJpaController miProfesionalJpa = new ProfesionalJpaController();
    private static final ProvinciaJpaController miProvinciaJpa = new ProvinciaJpaController();
    private static final TipoDocumentoJpaController miTipoDocumentoJpa = new TipoDocumentoJpaController();
    private static final TipoEstudioJpaController miTipoEstudioJpa = new TipoEstudioJpaController();
    private static final TurnoJpaController miTurnoJpa = new TurnoJpaController();
    private static final UsuarioJpaController miUsuarioJpa = new UsuarioJpaController();
    private static final TipoUsuarioJpaController miTipoUsuarioJpa = new TipoUsuarioJpaController();
      
       //              METODOS AGENDA

    public void crearAgenda(Agenda unaAgenda) throws Exception {
        ControladoraPersistencia.miAgendaJpa.create(unaAgenda);
    }

    public void editarAgenda(Agenda miAgenda) throws Exception{
        ControladoraPersistencia.miAgendaJpa.edit(miAgenda);
    }

    public void eliminarAgenda(int id) throws NonexistentEntityException{
        ControladoraPersistencia.miAgendaJpa.destroy(id);
    }

    public Agenda dameAgenda(int id) {
        return ControladoraPersistencia.miAgendaJpa.findAgenda(id);
    }
    public List<Agenda> dameAgendas() {
        return ControladoraPersistencia.miAgendaJpa.findAgendaEntities();
    }
    //              METODOS DOMICILIO

    public void crearDomicilio(Domicilio unDomicilio) throws Exception {
        ControladoraPersistencia.miDomicilioJpa.create(unDomicilio);
    }

    public void editarDomicilio(Domicilio miDomicilio) throws Exception{
        ControladoraPersistencia.miDomicilioJpa.edit(miDomicilio);
    }

    public void eliminarDomicilio(int idDomicilio) throws NonexistentEntityException{
        ControladoraPersistencia.miDomicilioJpa.destroy(idDomicilio);
    }

    public Domicilio dameDomicilio(int idDomicilio) {
        return ControladoraPersistencia.miDomicilioJpa.findDomicilio(idDomicilio);
    }

    public List<Domicilio> dameDomicilios() {
        return ControladoraPersistencia.miDomicilioJpa.findDomicilioEntities();
    }
    //              METODOS ESTADOTURNO

    public void crearEstadoTurno(EstadoTurno unEstadoTurno) throws Exception {
        ControladoraPersistencia.miEstadoTurnoJpa.create(unEstadoTurno);
    }

    public void editarEstadoTurno(EstadoTurno miEstadoTurno) throws Exception{
        ControladoraPersistencia.miEstadoTurnoJpa.edit(miEstadoTurno);
    }

    public void eliminarEstadoTurno(int id) throws NonexistentEntityException{
        ControladoraPersistencia.miEstadoTurnoJpa.destroy(id);
    }

    public EstadoTurno dameEstadoTurno(int id) {
        return ControladoraPersistencia.miEstadoTurnoJpa.findEstadoTurno(id);
    }
    public List<EstadoTurno> dameEstadoTurnos() {
        return ControladoraPersistencia.miEstadoTurnoJpa.findEstadoTurnoEntities();
    }
    
    //              METODOS ESTUDIO

    public void crearEstudio(Estudio unEstudio) throws Exception {
        ControladoraPersistencia.miEstudioJpa.create(unEstudio);
    }

    public void editarEstudio(Estudio miEstudio) throws Exception{
        ControladoraPersistencia.miEstudioJpa.edit(miEstudio);
    }

    public void eliminarEstudio(int id) throws NonexistentEntityException{
        ControladoraPersistencia.miEstudioJpa.destroy(id);
    }

    public Estudio dameEstudio(int id) {
        return ControladoraPersistencia.miEstudioJpa.findEstudio(id);
    }
    public List<Estudio> dameEstudios() {
        return ControladoraPersistencia.miEstudioJpa.findEstudioEntities();
    }
    
    //              METODOS IMAGENESTUDIO

    public void crearImagenEstudio(ImagenEstudio unImagenEstudio) throws Exception {
        ControladoraPersistencia.miImagenEstudioJpa.create(unImagenEstudio);
    }

    public void editarImagenEstudio(ImagenEstudio miImagenEstudio) throws Exception{
        ControladoraPersistencia.miImagenEstudioJpa.edit(miImagenEstudio);
    }

    public void eliminarImagenEstudio(int id) throws NonexistentEntityException{
        ControladoraPersistencia.miImagenEstudioJpa.destroy(id);
    }

    public ImagenEstudio dameImagenEstudio(int id) {
        return ControladoraPersistencia.miImagenEstudioJpa.findImagenEstudio(id);
    }
    public List<ImagenEstudio> dameImagenEstudios() {
        return ControladoraPersistencia.miImagenEstudioJpa.findImagenEstudioEntities();
    }
    
    //              METODOS LOCALIDAD

    public void crearLocalidad(Localidad unaLocalidad) throws Exception {
        ControladoraPersistencia.miLocalidadJpa.create(unaLocalidad);
    }

    public void editarLocalidad(Localidad miLocalidad) throws Exception{
        ControladoraPersistencia.miLocalidadJpa.edit(miLocalidad);
    }

    public void eliminarLocalidad(int id) throws NonexistentEntityException{
        ControladoraPersistencia.miLocalidadJpa.destroy(id);
    }

    public Localidad dameLocalidad(int id) {
        return ControladoraPersistencia.miLocalidadJpa.findLocalidad(id);
    }
    public List<Localidad> dameLocalidades() {
        return ControladoraPersistencia.miLocalidadJpa.findLocalidadEntities();
    }
    
    //              METODOS OBRASOCIAL

    public void crearObraSocial(ObraSocial unObraSocial) throws Exception {
        ControladoraPersistencia.miObraSocialJpa.create(unObraSocial);
    }

    public void editarObraSocial(ObraSocial miObraSocial) throws Exception{
        ControladoraPersistencia.miObraSocialJpa.edit(miObraSocial);
    }

    public void eliminarObraSocial(int id) throws NonexistentEntityException{
        ControladoraPersistencia.miObraSocialJpa.destroy(id);
    }

    public ObraSocial dameObraSocial(int id) {
        return ControladoraPersistencia.miObraSocialJpa.findObraSocial(id);
    }
    public List<ObraSocial> dameObraSociales() {
        return ControladoraPersistencia.miObraSocialJpa.findObraSocialEntities();
    }
    
    //              METODOS PACIENTE    

    public void crearPaciente(Paciente unPaciente) throws Exception {
        ControladoraPersistencia.miPacienteJpa.create(unPaciente);
    }

    public void editarPaciente(Paciente miPaciente) throws Exception{
        ControladoraPersistencia.miPacienteJpa.edit(miPaciente);
    }

    public void eliminarPaciente(int id) throws NonexistentEntityException{
        ControladoraPersistencia.miPacienteJpa.destroy(id);
    }

    public Paciente damePaciente(int id) {
        return ControladoraPersistencia.miPacienteJpa.findPaciente(id);
    }
    public List<Paciente> damePacientes() {
        return ControladoraPersistencia.miPacienteJpa.findPacienteEntities();
    }
    
    //              METODOS PAIS

    public void crearPais(Pais unPais) throws Exception {
        ControladoraPersistencia.miPaisJpa.create(unPais);
    }

    public void editarPais(Pais miPais) throws Exception{
        ControladoraPersistencia.miPaisJpa.edit(miPais);
    }

    public void eliminarPais(int id) throws NonexistentEntityException{
        ControladoraPersistencia.miPaisJpa.destroy(id);
    }

    public Pais damePais(int id) {
        return ControladoraPersistencia.miPaisJpa.findPais(id);
    }
    public List<Pais> damePaises() {
        return ControladoraPersistencia.miPaisJpa.findPaisEntities();
    }
    
    //              METODOS PERSONA

    public void crearPersona(Persona unPersona) throws Exception {
        ControladoraPersistencia.miPersonaJpa.create(unPersona);
    }

    public void editarPersona(Persona miPersona) throws Exception{
        ControladoraPersistencia.miPersonaJpa.edit(miPersona);
    }

    public void eliminarPersona(int id) throws NonexistentEntityException{
        ControladoraPersistencia.miPersonaJpa.destroy(id);
    }

    public Persona damePersona(int id) {
        return ControladoraPersistencia.miPersonaJpa.findPersona(id);
    }
    public List<Persona> damePersonas() {
        return ControladoraPersistencia.miPersonaJpa.findPersonaEntities();
    }
    
    //              METODOS PLANTILLATURNO

    public void crearPlantillaTurno(PlantillaTurno unPlantillaTurno) throws Exception {
        ControladoraPersistencia.miPlantillaTurnoJpa.create(unPlantillaTurno);
    }
    
    public void editarPlantillaTurno(PlantillaTurno miPlantillaTurno) throws Exception{
        ControladoraPersistencia.miPlantillaTurnoJpa.edit(miPlantillaTurno);
    }

    public void eliminarPlantillaTurno(int id) throws NonexistentEntityException{
        ControladoraPersistencia.miPlantillaTurnoJpa.destroy(id);
    }

    public PlantillaTurno damePlantillaTurno(int id) {
        return ControladoraPersistencia.miPlantillaTurnoJpa.findPlantillaTurno(id);
    }
    public List<PlantillaTurno> damePlantillaTurnos() {
        return ControladoraPersistencia.miPlantillaTurnoJpa.findPlantillaTurnoEntities();
    }
    
    //              METODOS PROFESIONAL

    public void crearProfesional(Profesional unProfesional) throws Exception {
        ControladoraPersistencia.miProfesionalJpa.create(unProfesional);
    }

    public void editarProfesional(Profesional miProfesional) throws Exception{
        ControladoraPersistencia.miProfesionalJpa.edit(miProfesional);
    }

    public void eliminarProfesional(int id) throws NonexistentEntityException{
        ControladoraPersistencia.miProfesionalJpa.destroy(id);
    }

    public Profesional dameProfesional(int id) {
        return ControladoraPersistencia.miProfesionalJpa.findProfesional(id);
    }
    public List<Profesional> dameProfesionales() {
        return ControladoraPersistencia.miProfesionalJpa.findProfesionalEntities();
    }
    
    //              METODOS PROVINCIA

    public void crearProvincia(Provincia unProvincia) throws Exception {
        ControladoraPersistencia.miProvinciaJpa.create(unProvincia);
    }
    
    public void editarProvincia(Provincia miProvincia) throws Exception{
        ControladoraPersistencia.miProvinciaJpa.edit(miProvincia);
    }

    public void eliminarProvincia(int id) throws NonexistentEntityException{
        ControladoraPersistencia.miProvinciaJpa.destroy(id);
    }

    public Provincia dameProvincia(int id) {
        return ControladoraPersistencia.miProvinciaJpa.findProvincia(id);
    }
    public List<Provincia> dameProvincias() {
        return ControladoraPersistencia.miProvinciaJpa.findProvinciaEntities();
    }
    
    //              METODOS TIPODOCUMENTO

    public void crearTipoDocumento(TipoDocumento unTipoDocumento) throws Exception {
        ControladoraPersistencia.miTipoDocumentoJpa.create(unTipoDocumento);
    }

    public void editarTipoDocumento(TipoDocumento miTipoDocumento) throws Exception{
        ControladoraPersistencia.miTipoDocumentoJpa.edit(miTipoDocumento);
    }

    public void eliminarTipoDocumento(int id) throws NonexistentEntityException{
        ControladoraPersistencia.miTipoDocumentoJpa.destroy(id);
    }

    public TipoDocumento dameTipoDocumento(int id) {
        return ControladoraPersistencia.miTipoDocumentoJpa.findTipoDocumento(id);
    }
    public List<TipoDocumento> dameTipoDocumentos() {
        return ControladoraPersistencia.miTipoDocumentoJpa.findTipoDocumentoEntities();
    }
    
     //              METODOS TIPOESTUDIO

    public void crearTipoEstudio(TipoEstudio unTipoEstudio) throws Exception {
        ControladoraPersistencia.miTipoEstudioJpa.create(unTipoEstudio);
    }

    public void editarTipoEstudio(TipoEstudio miTipoEstudio) throws Exception{
        ControladoraPersistencia.miTipoEstudioJpa.edit(miTipoEstudio);
    }

    public void eliminarTipoEstudio(int id) throws NonexistentEntityException{
        ControladoraPersistencia.miTipoEstudioJpa.destroy(id);
    }

    public TipoEstudio dameTipoEstudio(int id) {
        return ControladoraPersistencia.miTipoEstudioJpa.findTipoEstudio(id);
    }
    public List<TipoEstudio> dameTipoEstudios() {
        return ControladoraPersistencia.miTipoEstudioJpa.findTipoEstudioEntities();
    }
     //              METODOS TURNO

    public void crearTurno(Turno unTurno) throws Exception {
        ControladoraPersistencia.miTurnoJpa.create(unTurno);
    }

    public void editarTurno(Turno miTurno) throws Exception{
        ControladoraPersistencia.miTurnoJpa.edit(miTurno);
    }

    public void eliminarTurno(int id) throws NonexistentEntityException{
        ControladoraPersistencia.miTurnoJpa.destroy(id);
    }

    public Turno dameTurno(int id) {
        return ControladoraPersistencia.miTurnoJpa.findTurno(id);
    }
    public List<Turno> dameTurnos() {
        return ControladoraPersistencia.miTurnoJpa.findTurnoEntities();
    }
    //              METODOS USUARIOS

    public void crearUsuario(Usuario unUsuario) throws Exception {
        ControladoraPersistencia.miUsuarioJpa.create(unUsuario);
    }

    public void editarUsuario(Usuario miUsuario) throws Exception{
        ControladoraPersistencia.miUsuarioJpa.edit(miUsuario);
    }

    public void eliminarUsuario(int id) throws NonexistentEntityException{
        ControladoraPersistencia.miUsuarioJpa.destroy(id);
    }

    public Usuario dameUsuario(int id) {
        return ControladoraPersistencia.miUsuarioJpa.findUsuario(id);
    }

    public List<Usuario> dameUsuarios() {
        return ControladoraPersistencia.miUsuarioJpa.findUsuarioEntities();
    }
    //              METODOS TIPOS USUARIOS

    public void crearTipoUsuario(TipoUsuario unTipo) throws Exception {
        ControladoraPersistencia.miTipoUsuarioJpa.create(unTipo);
    }

    public void editarTipoUsuario(TipoUsuario miTipoUsuario) throws Exception  {
        ControladoraPersistencia.miTipoUsuarioJpa.edit(miTipoUsuario);
    }

    public void eliminarTipoUsuario(int id) throws NonexistentEntityException {
        ControladoraPersistencia.miTipoUsuarioJpa.destroy(id);
    }

    public TipoUsuario dameTipoUsuario(int id) {
        return ControladoraPersistencia.miTipoUsuarioJpa.findTipoUsuario(id);
    }

    public List<TipoUsuario> dameTipoUsuarios() {
        return ControladoraPersistencia.miTipoUsuarioJpa.findTipoUsuarioEntities();
    }
}
