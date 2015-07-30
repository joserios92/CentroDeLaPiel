
package Visual;

import LogicaDeNegocio.Centro;


public class ControladoraVisual {
    Centro miC = new Centro();
    
    
    public String validarUsuario(String usuario,String contrasenia){
         return miC.validarUsuario(usuario,contrasenia);
    }
}
