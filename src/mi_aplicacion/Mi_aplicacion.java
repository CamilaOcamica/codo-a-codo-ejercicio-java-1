
package mi_aplicacion;

import java.util.Scanner;

public class Mi_aplicacion {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Ingrese su usuario: ");
       String usuario = scanner.nextLine();
       System.out.println("Ingrese su contraseña: ");
       String contrasena = scanner.nextLine();
       /*Ingreso ing = new Ingreso();
       ing.setUsuario(usuario);
       ing.setContrasena(contrasena);
       System.out.println(ing.Validar());
      */
       if(!"User2020".equals(usuario) && !"12345".equals(contrasena)){
           System.out.println("El usuario o la contraseña es incorrecto");
       }else{
           System.out.println("Bienvenidx " + usuario);
       }
       
       System.out.println("Ingrese su nombre: ");
       var nombre = scanner.nextLine();
       System.out.println("Ingrese su apellido: ");
       var apellido = scanner.nextLine();
       System.out.println("Ingrese su edad: ");
       var edad = scanner.nextLine();
       System.out.println("Ingrese su hobbie: ");
       var hobbie = scanner.nextLine();
       System.out.println("Ingrese su editor de código preferido: ");
       var idefav = scanner.nextLine();
       System.out.println("Ingrese su Sistema Operativo: ");
       var so = scanner.nextLine();
       System.out.println("Usted es " + nombre + " " + apellido + ". Su edad es " + edad + ". Su hobbie es " + hobbie + ". Su editor de código preferido es " + idefav + ". Y su sistema operativo es " + so);
       
    }
    
}
