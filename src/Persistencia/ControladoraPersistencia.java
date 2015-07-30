
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
    private static ConvenioJpaController miConvenioJpa;
    private static CuotaJpaController miCuotaJpa;
    private static DatosProfesionalJpaController miDatosProfesionalJpa;
    private static LocalidadJpaController miLocalidadJpa;
    private static MontoCuotaJpaController miMontoCuotaJpa;
    private static PagoJpaController miPagoJpa;
    private static UsuarioJpaController miUsuarioJpa;
    private static TipoUsuarioJpaController miTipoUsuarioJpa;
    
    static {
        miColegiadoJpa = new ColegiadoJpaController();
        miConvenioJpa = new ConvenioJpaController();
        miCuotaJpa = new CuotaJpaController();
        miDatosProfesionalJpa = new DatosProfesionalJpaController();
        miLocalidadJpa = new LocalidadJpaController();
        miMontoCuotaJpa = new MontoCuotaJpaController();
        miPagoJpa = new PagoJpaController();
        miUsuarioJpa = new UsuarioJpaController();
        miTipoUsuarioJpa = new TipoUsuarioJpaController();
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
    
    //              METODOS PACIENTE    

    public Paciente crearPaciente() {
        
        return this.miPersistencia.crearPaciente(unPaciente);
    }

    public void editarPaciente(Paciente miPaciente){
        this.miPersistencia.editarPaciente(miPaciente);
    }

    public void eliminarPaciente(int id){
        this.miPersistencia.eliminarPaciente(id);
    }

    public Paciente damePaciente(int id) {
        return this.miPersistencia.damePaciente(id);
    }
    public List<Paciente> damePacientes() {
        return this.miPersistencia.damePaciente();
    }
    
    //              METODOS PAIS

    public Pais crearPais() {
        
        return this.miPersistencia.crearPais(unPais);
    }

    public void editarPais(Pais miPais){
        this.miPersistencia.editarPais(miPais);
    }

    public void eliminarPais(int id){
        this.miPersistencia.eliminarPais(id);
    }

    public Pais damePais(int id) {
        return this.miPersistencia.damePais(id);
    }
    public List<Pais> damePaises() {
        return this.miPersistencia.damePais();
    }
    
    //              METODOS PERSONA

    public Persona crearPersona() {
        
        return this.miPersistencia.crearPersona(unPersona);
    }

    public void editarPersona(Persona miPersona){
        this.miPersistencia.editarPersona(miPersona);
    }

    public void eliminarPersona(int id){
        this.miPersistencia.eliminarPersona(id);
    }

    public Persona damePersona(int id) {
        return this.miPersistencia.damePersona(id);
    }
    public List<Persona> damePersonas() {
        return this.miPersistencia.damePersonas();
    }
    
    //              METODOS PLANTILLATURNO

    public PlantillaTurno crearPlantillaTurno() {
        
        return this.miPersistencia.crearPlantillaTurno(unPlantillaTurno);
    }

    public void editarPlantillaTurno(PlantillaTurno miPlantillaTurno){
        this.miPersistencia.editarPlantillaTurno(miPlantillaTurno);
    }

    public void eliminarPlantillaTurno(int id){
        this.miPersistencia.eliminarPlantillaTurno(id);
    }

    public Agenda damePlantillaTurno(int id) {
        return this.miPersistencia.damePlantillaTurno(id);
    }
    public List<PlantillaTurno> damePlantillaTurnos() {
        return this.miPersistencia.damePlantillaTurnos();
    }
    
    //              METODOS PROFESIONAL

    public Profesional crearProfesional() {
        
        return this.miPersistencia.crearProfesional(unProfesional);
    }

    public void editarProfesional(Profesional miProfesional){
        this.miPersistencia.editarProfesional(miProfesional);
    }

    public void eliminarProfesional(int id){
        this.miPersistencia.eliminarProfesional(id);
    }

    public Profesional dameProfesional(int id) {
        return this.miPersistencia.dameProfesional(id);
    }
    public List<Profesional> dameProfesionales() {
        return this.miPersistencia.dameProfesionales();
    }
    
    //              METODOS PROVINCIA

    public Provincia crearProvincia() {
        
        return this.miPersistencia.crearProvincia(unProvincia);
    }

    public void editarProvincia(Provincia miProvincia){
        this.miPersistencia.editarProvincia(miProvincia);
    }

    public void eliminarProvincia(int id){
        this.miPersistencia.eliminarProvincia(id);
    }

    public Provincia dameProvincia(int id) {
        return this.miPersistencia.dameProvincia(id);
    }
    public List<Provincia> dameProvincias() {
        return this.miPersistencia.dameProvincias();
    }
    
    //              METODOS TIPODOCUMENTO

    public TipoDocumento crearTipoDocumento(String apellido,String nombres,Localidad localidad,String domicilio,String email,String tel,String cel,String dni,String sexo,String fecha) {
        
        return this.miPersistencia.crearTipoDocumento(unTipoDocumento);
    }

    public void editarTipoDocumento(TipoDocumento miTipoDocumento){
        this.miPersistencia.editarTipoDocumento(miTipoDocumento);
    }

    public void eliminarTipoDocumento(int id){
        this.miPersistencia.eliminarTipoDocumento(id);
    }

    public Agenda dameTipoDocumento(int id) {
        return this.miPersistencia.dameTipoDocumento(id);
    }
    public List<TipoDocumento> dameTipoDocumentos() {
        return this.miPersistencia.dameTipoDocumento();
    }
    
     //              METODOS TIPOESTUDIO

    public TipoEstudio crearTipoEstudio() {
        
        return this.miPersistencia.crearTipoEstudio(unTipoEstudio);
    }

    public void editarTipoEstudio(TipoEstudio miTipoEstudio){
        this.miPersistencia.editarTipoEstudio(miTipoEstudio);
    }

    public void eliminarTipoEstudio(int id){
        this.miPersistencia.eliminarTipoEstudio(id);
    }

    public Agenda dameTipoEstudio(int id) {
        return this.miPersistencia.dameTipoEstudio(id);
    }
    public List<TipoEstudio> dameTipoEstudios() {
        return this.miPersistencia.dameTipoEstudios();
    }
     //              METODOS TURNO

    public Turno crearTurno() {
        
        return this.miPersistencia.crearTurno(unTurno);
    }

    public void editarTurno(Turno miTurno){
        this.miPersistencia.editarTurno(miTurno);
    }

    public void eliminarTurno(int id){
        this.miPersistencia.eliminarTurno(id);
    }

    public Turno dameTurno(int id) {
        return this.miPersistencia.dameTurno(id);
    }
    public List<Turno> dameTurnos() {
        return this.miPersistencia.dameTurnos();
    }
    //              METODOS USUARIOS

    public void crearUsuario(String user,String pass,TipoUsuario tipo) throws Exception {
        Usuario miUsuario = new Usuario(user,pass,tipo);
        this.miPersistencia.crearUsuario(miUsuario);
    }

    public void editarUsuario(Usuario miUsuario) throws Exception {
        this.miPersistencia.editarUsuario(miUsuario);
    }

    public void eliminarUsuario(String id) throws NonexistentEntityException{
        this.miPersistencia.eliminarUsuario(id);
    }

    public Usuario dameUsuario(String id) {
        return this.miPersistencia.dameUsuario(id);
    }

    public List<Usuario> dameUsuarios() {
        return this.miPersistencia.dameUsuarios();
    }
    //              METODOS TIPOS USUARIOS

    public void crearTipoUsuario(String tipo) throws Exception {
        TipoUsuario miTipoUsuario = new TipoUsuario(tipo);
        this.miPersistencia.crearTipoUsuario(miTipoUsuario);
    }

    public void editarTipoUsuario(TipoUsuario miTipoUsuario) throws Exception {
        this.miPersistencia.editarTipoUsuario(miTipoUsuario);
    }

    public void eliminarTipoUsuario(String id) throws NonexistentEntityException{
        this.miPersistencia.eliminarTipoUsuario(id);
    }

    public TipoUsuario dameTipoUsuario(String id) {
        return this.miPersistencia.dameTipoUsuario(id);
    }

    public List<TipoUsuario> dameTipoUsuarios() {
        return this.miPersistencia.dameTipoUsuarios();
    }
}
