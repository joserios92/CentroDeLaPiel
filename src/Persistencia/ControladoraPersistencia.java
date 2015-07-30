
package Persistencia;

import LogicaDeNegocio.Agenda;
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
import java.util.List;


public class ControladoraPersistencia {
    private static AgendaJpaController miAgendaJpa;
    private static EstadoTurnoJpaController miEstadoTurnoJpa;
    private static EstudioJpaController miEstudioJpa;
    private static ImagenEstudioJpaController miImagenEstudioJpa;
    private static LocalidadJpaController miLocalidadJpa;
    private static ObraSocialJpaController miObraSocialJpa;
    private static PacienteJpaController miPacienteJpa;
    private static PaisJpaController miPaisJpa;
    private static PersonaJpaController miPersonaJpa;
    private static PlantillaTurnoJpaController miPlantillaTurnoJpa;
    private static ProfesionalJpaController miProfesionalJpa;
    private static ProvinciaJpaController miProvinciaJpa;
    private static TipoDocumentoJpaController miTipoDocumentoJpa;
    private static TipoEstudioJpaController miTipoEstudioJpa;
    private static TurnoJpaController miTurnoJpa;
    private static UsuarioJpaController miUsuarioJpa;
    private static TipoUsuarioJpaController miTipoUsuarioJpa;
    
    static {
        
        miAgendaJpa = new AgendaJpaController;
        miEstadoTurnoJpa = new EstadoTurnoJpaController;
        miEstudioJpa = new EstudioJpaController;
        miImagenEstudioJpa = new ImagenEstudioJpaController;
        miLocalidadJpa = new LocalidadJpaController;
        miObraSocialJpa = new ObraSocialJpaController;
        miPacienteJpa = new PacienteJpaController;
        miPaisJpa = new PaisJpaController;
        miPersonaJpa = new PersonaJpaController;
        miPlantillaTurnoJpa = new PlantillaTurnoJpaController;
        miProfesionalJpa = new ProfesionalJpaController;
        miProvinciaJpa = new ProvinciaJpaController;
        miTipoDocumentoJpa = new TipoDocumentoJpaController;
        miTipoEstudioJpa = new TipoEstudioJpaController;
        miTurnoJpa = new TurnoJpaController;
        miUsuarioJpa = new UsuarioJpaController;
        miTipoUsuarioJpa = new TipoUsuarioJpaController;
        
    }
    
       //              METODOS AGENDA

    public Agenda crearAgenda(Agenda unaAgenda) {
        return this.miAgendaJpa.crearAgenda(unaAgenda);
    }

    public void editarAgenda(Agenda miAgenda){
        this.miAgendaJpa.editarAgenda(miAgenda);
    }

    public void eliminarAgenda(int id){
        this.miAgendaJpa.eliminarAgenda(id);
    }

    public Agenda dameAgenda(int id) {
        return this.miAgendaJpa.dameAgenda(id);
    }
    public List<Agenda> dameAgendas() {
        return this.miAgendaJpa.dameAgenda();
    }
    
    //              METODOS ESTADOTURNO

    public EstadoTurno crearEstadoTurno(EstadoTurno unEstadoTurno) {
        
        return this.miEstadoTurnoJpa.crearEstadoTurno(unEstadoTurno);
    }

    public void editarEstadoTurno(EstadoTurno miEstadoTurno){
        this.miEstadoTurnoJpa.editarEstadoTurno(miEstadoTurno);
    }

    public void eliminarEstadoTurno(int id){
        this.miEstadoTurnoJpa.eliminarEstadoTurno(id);
    }

    public EstadoTurno dameEstadoTurno(int id) {
        return this.miEstadoTurnoJpa.dameEstadoTurno(id);
    }
    public List<EstadoTurno> dameEstadoTurnos() {
        return this.miEstadoTurnoJpa.dameEstadoTurno();
    }
    
    //              METODOS ESTUDIO

    public Estudio crearEstudio(Estudio unEstudio) {
        
        return this.miEstudioJpa.crearEstudio(unEstudio);
    }

    public void editarEstudio(Estudio miEstudio){
        this.miEstudioJpa.editarEstudio(miEstudio);
    }

    public void eliminarEstudio(int id){
        this.miEstudioJpa.eliminarEstudio(id);
    }

    public Estudio dameEstudio(int id) {
        return this.miEstudioJpa.dameEstudio(id);
    }
    public List<Estudio> dameEstudios() {
        return this.miEstudioJpa.dameEstudio();
    }
    
    //              METODOS IMAGENESTUDIO

    public ImagenEstudio crearImagenEstudio(ImagenEstudio unImagenEstudio) {
        
        return this.miImagenEstudioJpa.crearImagenEstudio(unImagenEstudio);
    }

    public void editarImagenEstudio(ImagenEstudio miImagenEstudio){
        this.miImagenEstudioJpa.editarImagenEstudio(miImagenEstudio);
    }

    public void eliminarImagenEstudio(int id){
        this.miImagenEstudioJpa.eliminarImagenEstudio(id);
    }

    public Agenda dameImagenEstudio(int id) {
        return this.miImagenEstudioJpa.dameImagenEstudio(id);
    }
    public List<ImagenEstudio> dameImagenEstudios() {
        return this.miImagenEstudioJpa.dameImagenEstudio();
    }
    
    //              METODOS LOCALIDAD

    public Localidad crearLocalidad(Localidad unaLocalidad) {
        
        return this.miLocalidadJpa.crearLocalidad(unaLocalidad);
    }

    public void editarLocalidad(Localidad miLocalidad){
        this.miLocalidadJpa.editarLocalidad(miLocalidad);
    }

    public void eliminarLocalidad(int id){
        this.miLocalidadJpa.eliminarLocalidad(id);
    }

    public Agenda dameLocalidad(int id) {
        return this.miLocalidadJpa.dameLocalidad(id);
    }
    public List<Localidad> dameLocalidades() {
        return this.miLocalidadJpa.dameLocalidades();
    }
    
    //              METODOS OBRASOCIAL

    public ObraSocial crearObraSocial(ObraSocial unObraSocial) {
        
        return this.miObraSocialJpa.crearObraSocial(unObraSocial);
    }

    public void editarObraSocial(ObraSocial miObraSocial){
        this.miObraSocialJpa.editarObraSocial(miObraSocial);
    }

    public void eliminarObraSocial(int id){
        this.miObraSocialJpa.eliminarObraSocial(id);
    }

    public Agenda dameObraSocial(int id) {
        return this.miObraSocialJpa.dameObraSocial(id);
    }
    public List<Agenda> dameObraSociales() {
        return this.miObraSocialJpa.dameObraSociales();
    }
    
    //              METODOS PACIENTE    

    public Paciente crearPaciente(Paciente unPaciente) {
        
        return this.miPacienteJpa.crearPaciente(unPaciente);
    }

    public void editarPaciente(Paciente miPaciente){
        this.miPacienteJpa.editarPaciente(miPaciente);
    }

    public void eliminarPaciente(int id){
        this.miPacienteJpa.eliminarPaciente(id);
    }

    public Paciente damePaciente(int id) {
        return this.miPacienteJpa.damePaciente(id);
    }
    public List<Paciente> damePacientes() {
        return this.miPacienteJpa.damePaciente();
    }
    
    //              METODOS PAIS

    public Pais crearPais(Pais unPais) {
        
        return this.miPaisJpa.crearPais(unPais);
    }

    public void editarPais(Pais miPais){
        this.miPaisJpa.editarPais(miPais);
    }

    public void eliminarPais(int id){
        this.miPaisJpa.eliminarPais(id);
    }

    public Pais damePais(int id) {
        return this.miPaisJpa.damePais(id);
    }
    public List<Pais> damePaises() {
        return this.miPaisJpa.damePais();
    }
    
    //              METODOS PERSONA

    public Persona crearPersona(Persona unPersona) {
        
        return this.miPersonaJpa.crearPersona(unPersona);
    }

    public void editarPersona(Persona miPersona){
        this.miPersonaJpa.editarPersona(miPersona);
    }

    public void eliminarPersona(int id){
        this.miPersonaJpa.eliminarPersona(id);
    }

    public Persona damePersona(int id) {
        return this.miPersonaJpa.damePersona(id);
    }
    public List<Persona> damePersonas() {
        return this.miPersonaJpa.damePersonas();
    }
    
    //              METODOS PLANTILLATURNO

    public PlantillaTurno crearPlantillaTurno(PlantillaTurno unPlantillaTurno) {
        
        return this.miPlantillaTurnoJpa.crearPlantillaTurno(unPlantillaTurno);
    }

    public void editarPlantillaTurno(PlantillaTurno miPlantillaTurno){
        this.miPlantillaTurnoJpa.editarPlantillaTurno(miPlantillaTurno);
    }

    public void eliminarPlantillaTurno(int id){
        this.miPlantillaTurnoJpa.eliminarPlantillaTurno(id);
    }

    public Agenda damePlantillaTurno(int id) {
        return this.miPlantillaTurnoJpa.damePlantillaTurno(id);
    }
    public List<PlantillaTurno> damePlantillaTurnos() {
        return this.miPlantillaTurnoJpa.damePlantillaTurnos();
    }
    
    //              METODOS PROFESIONAL

    public Profesional crearProfesional(Profesional unProfesional) {
        
        return this.miProfesionalJpa.crearProfesional(unProfesional);
    }

    public void editarProfesional(Profesional miProfesional){
        this.miProfesionalJpa.editarProfesional(miProfesional);
    }

    public void eliminarProfesional(int id){
        this.miProfesionalJpa.eliminarProfesional(id);
    }

    public Profesional dameProfesional(int id) {
        return this.miProfesionalJpa.dameProfesional(id);
    }
    public List<Profesional> dameProfesionales() {
        return this.miProfesionalJpa.dameProfesionales();
    }
    
    //              METODOS PROVINCIA

    public Provincia crearProvincia(Provincia unProvincia) {
        
        return this.miProvinciaJpa.crearProvincia(unProvincia);
    }

    public void editarProvincia(Provincia miProvincia){
        this.miProvinciaJpa.editarProvincia(miProvincia);
    }

    public void eliminarProvincia(int id){
        this.miProvinciaJpa.eliminarProvincia(id);
    }

    public Provincia dameProvincia(int id) {
        return this.miProvinciaJpa.dameProvincia(id);
    }
    public List<Provincia> dameProvincias() {
        return this.miProvinciaJpa.dameProvincias();
    }
    
    //              METODOS TIPODOCUMENTO

    public TipoDocumento crearTipoDocumento(TipoDocumento unTipoDocumento) {
        
        return this.miTipoDocumentoJpa.crearTipoDocumento(unTipoDocumento);
    }

    public void editarTipoDocumento(TipoDocumento miTipoDocumento){
        this.miTipoDocumentoJpa.editarTipoDocumento(miTipoDocumento);
    }

    public void eliminarTipoDocumento(int id){
        this.miTipoDocumentoJpa.eliminarTipoDocumento(id);
    }

    public Agenda dameTipoDocumento(int id) {
        return this.miTipoDocumentoJpa.dameTipoDocumento(id);
    }
    public List<TipoDocumento> dameTipoDocumentos() {
        return this.miTipoDocumentoJpa.dameTipoDocumento();
    }
    
     //              METODOS TIPOESTUDIO

    public TipoEstudio crearTipoEstudio(TipoEstudio unTipoEstudio) {
        
        return this.miTipoEstudioJpa.crearTipoEstudio(unTipoEstudio);
    }

    public void editarTipoEstudio(TipoEstudio miTipoEstudio){
        this.miTipoEstudioJpa.editarTipoEstudio(miTipoEstudio);
    }

    public void eliminarTipoEstudio(int id){
        this.miTipoEstudioJpa.eliminarTipoEstudio(id);
    }

    public Agenda dameTipoEstudio(int id) {
        return this.miTipoEstudioJpa.dameTipoEstudio(id);
    }
    public List<TipoEstudio> dameTipoEstudios() {
        return this.miTipoEstudioJpa.dameTipoEstudios();
    }
     //              METODOS TURNO

    public Turno crearTurno(Turno unTurno) {
        
        return this.miTurnoJpa.crearTurno(unTurno);
    }

    public void editarTurno(Turno miTurno){
        this.miTurnoJpa.editarTurno(miTurno);
    }

    public void eliminarTurno(int id){
        this.miTurnoJpa.eliminarTurno(id);
    }

    public Turno dameTurno(int id) {
        return this.miTurnoJpa.dameTurno(id);
    }
    public List<Turno> dameTurnos() {
        return this.miTurnoJpa.dameTurnos();
    }
    //              METODOS USUARIOS

    public void crearUsuario(Usuario unUsuario) {
        
        this.miUsuarioJpa.crearUsuario(unUsuario);
    }

    public void editarUsuario(Usuario miUsuario){
        this.miUsuarioJpa.editarUsuario(miUsuario);
    }

    public void eliminarUsuario(String id){
        this.miUsuarioJpa.eliminarUsuario(id);
    }

    public Usuario dameUsuario(String id) {
        return this.miUsuarioJpa.dameUsuario(id);
    }

    public List<Usuario> dameUsuarios() {
        return this.miUsuarioJpa.dameUsuarios();
    }
    //              METODOS TIPOS USUARIOS

    public void crearTipoUsuario(TipoUsuario unTipo) throws Exception {
        
        this.miTipoUsuarioJpa.crearTipoUsuario(unTipo);
    }

    public void editarTipoUsuario(TipoUsuario miTipoUsuario)  {
        this.miTipoUsuarioJpa.editarTipoUsuario(miTipoUsuario);
    }

    public void eliminarTipoUsuario(String id) {
        this.miTipoUsuarioJpa.eliminarTipoUsuario(id);
    }

    public TipoUsuario dameTipoUsuario(String id) {
        return this.miTipoUsuarioJpa.dameTipoUsuario(id);
    }

    public List<TipoUsuario> dameTipoUsuarios() {
        return this.miTipoUsuarioJpa.dameTipoUsuarios();
    }
}
