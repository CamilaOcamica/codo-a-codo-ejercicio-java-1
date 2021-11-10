
package mi_aplicacion;

public class Ingreso {
    private String usuario, contrasena;
    private String miUsuario="User2020";
    private String miContra="12345";
    
    public String getUsuario(){
    return this.usuario;
    }
    public void setUsuario(String usu){
    this.usuario= usu;
    }
    public String getContrasena(){
    return this.contrasena;
    }
    public void setContrasena(String pass){
    this.contrasena=pass;
    }
    /*
    public boolean Validar(){
        
       return miUsuario.equals(this.usuario) && (miContra.equals(this.contrasena));
           
    }
*/
}
