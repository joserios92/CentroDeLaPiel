
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

    public Agenda crearAgenda(int idAgenda, String fechaInicio, String fechaFin, String fechaGenerada, String fechaAplicada) {
        Agenda unaAgenda = new Agenda(idAgenda,fechaInicio,fechaFin,fechaGenerada,fechaAplicada);
        return this.miPersistencia.crearAgenda(unaAgenda);
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
        return this.miPersistencia.dameAgendas();
    }
    
    //              METODOS ESTADOTURNO

    public EstadoTurno crearEstadoTurno(int idEstadoTurno, String nombreEstado) {
        EstadoTurno unEstadoTurno = new EstadoTurno(idEstadoTurno,nombreEstado);
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
        return this.miPersistencia.dameEstadoTurnos();
    }
    
    //              METODOS ESTUDIO

    public Estudio crearEstudio(Paciente unPaciente, int idEstudio, String comentario, String fecha) {
        Estudio unEstudio = new Estudio(unPaciente,idEstudio,comentario,fecha);
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
        return this.miPersistencia.dameEstudios();
    }
    
    //              METODOS IMAGENESTUDIO

    public ImagenEstudio crearImagenEstudio(Estudio unEstudio, int idImagenEstudio, String comentario, String imagen) {
        ImagenEstudio unImagenEstudio = new ImagenEstudio(unEstudio,idImagenEstudio,comentario,imagen);
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
        return this.miPersistencia.dameImagenEstudios();
    }
    
    //              METODOS LOCALIDAD

    public Localidad crearLocalidad(int idLocalidad, String nombreLocalidad, Provincia unaProvincia) {
        Localidad unaLocalidad = new Localidad(idLocalidad,nombreLocalidad,unaProvincia);
        return this.miPersistencia.crearLocalidad(unaLocalidad);
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

    public ObraSocial crearObraSocial(int idObraSocial, String nombreObraSocial) {
        ObraSocial unaObraSocial = new ObraSocial(idObraSocial,nombreObraSocial);
        return this.miPersistencia.crearObraSocial(unaObraSocial);
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
    public List<Agenda> dameObraSociales() {
        return this.miPersistencia.dameObraSociales();
    }
    
    //              METODOS PACIENTE    

    public Paciente crearPaciente(int nroFicha, Persona unaPersona) {
        Paciente unPaciente = new Paciente(nroFicha,unaPersona.getIdPersona(),unaPersona.getNombre(),unaPersona.getApellido(),unaPersona.getFechaNac(),unaPersona.getSexo(),unaPersona.getTelefono1(),unaPersona.getTelefono2(),unaPersona.getDocumento(),unaPersona.getUnTipoDocumento(),unaPersona.getUnaLocalidad(),unaPersona.getCalle(),unaPersona.getAltura(),unaPersona.getPiso(),unaPersona.getDepto(),unaPersona.getTorre(),unaPersona.getBarrio(),unaPersona.getCodigoPostal());
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
        return this.miPersistencia.damePacientes();
    }
    
    //              METODOS PAIS

    public Pais crearPais(int idPais, String nombrePais) {
        Pais unPais = new Pais(idPais,nombrePais);
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
        return this.miPersistencia.damePaises();
    }
    
    //              METODOS PERSONA

    public Persona crearPersona(int idPersona, String nombre, String apellido, String fechaNac, String sexo, long telefono1, long telefono2, long documento, TipoDocumento unTipoDocumento, Localidad unaLocalidad, String calle, int altura, int piso, String depto, String torre, String barrio, int codigoPostal) {
        Persona unaPersona = new Persona(idPersona,nombre,apellido,fechaNac,sexo,telefono1,telefono2,documento,unTipoDocumento,unaLocalidad,calle,altura,piso,depto,torre,barrio,codigoPostal);
        return this.miPersistencia.crearPersona(unaPersona);
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

    public PlantillaTurno crearPlantillaTurno(int idPlantilla, Agenda unaAgenda, int dia, int hora, int duracion) {
        PlantillaTurno unaPlantillaTurno = new PlantillaTurno(idPlantilla,unaAgenda,dia,hora,duracion);
        return this.miPersistencia.crearPlantillaTurno(unaPlantillaTurno);
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

    public Profesional crearProfesional(int matricula,Persona unaPersona) {
        Profesional unProfesional = new Profesional(matricula,unaPersona.getIdPersona(),unaPersona.getNombre(),unaPersona.getApellido(),unaPersona.getFechaNac(),unaPersona.getSexo(),unaPersona.getTelefono1(),unaPersona.getTelefono2(),unaPersona.getDocumento(),unaPersona.getUnTipoDocumento(),unaPersona.getUnaLocalidad(),unaPersona.getCalle(),unaPersona.getAltura(),unaPersona.getPiso(),unaPersona.getDepto(),unaPersona.getTorre(),unaPersona.getBarrio(),unaPersona.getCodigoPostal());
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

    public Provincia crearProvincia(int idProvincia, String nombreProvincia) {
        Provincia unaProvincia = new Provincia(idProvincia, nombreProvincia);
        return this.miPersistencia.crearProvincia(unaProvincia);
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

    public TipoDocumento crearTipoDocumento(int idTipo, String nombreTipo) {
        TipoDocumento unTipoDocumento = new TipoDocumento(idTipo,nombreTipo);
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
        return this.miPersistencia.dameTipoDocumentos();
    }
    
     //              METODOS TIPOESTUDIO

    public TipoEstudio crearTipoEstudio(int idTipoEstudio, String nombreEstudio, int codigoNomenclador) {
        TipoEstudio unTipoEstudio = new TipoEstudio(idTipoEstudio,nombreEstudio,codigoNomenclador);
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

    public Turno crearTurno(int idTurno, String fecha, int hora, PlantillaTurno unaPlantilla, Paciente unPaciente, EstadoTurno unEstadoTurno) {
        Turno unTurno = new Turno(idTurno,fecha,hora,unaPlantilla,unPaciente,unEstadoTurno);
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

    public void crearUsuario(String user,String pass,TipoUsuario tipo){
        Usuario miUsuario = new Usuario(user,pass,tipo);
        this.miPersistencia.crearUsuario(miUsuario);
    }

    public void editarUsuario(Usuario miUsuario){
        this.miPersistencia.editarUsuario(miUsuario);
    }

    public void eliminarUsuario(String id){
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

    public void editarTipoUsuario(TipoUsuario miTipoUsuario){
        this.miPersistencia.editarTipoUsuario(miTipoUsuario);
    }

    public void eliminarTipoUsuario(String id){
        this.miPersistencia.eliminarTipoUsuario(id);
    }

    public TipoUsuario dameTipoUsuario(String id) {
        return this.miPersistencia.dameTipoUsuario(id);
    }

    public List<TipoUsuario> dameTipoUsuarios() {
        return this.miPersistencia.dameTipoUsuarios();
    }
}
