/*
El ejercicio trata de simular (de manera simple) cuando una persona crea una cuenta en alguna plataforma,
entonces este programa permitirá ingresar un usuario, contraseña y reingresar contraseña (para comprobar 
que las dos sean iguales), entonces habrá manejo de error personalizado para cuando las contrasenas no 
son iguales.
 */
import java.util.Scanner;

public class ExcepcionPersonalizada {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        MiHelper MiHelper = new MiHelper();
        String user, pass, reppass;

        System.out.println("Ingrese el usuario");
        user = entrada.next();
        
        System.out.println("Ingrese la contrasena");
        pass = entrada.next();
        
        System.out.println("Ingrese la contrasena otra vez");
        reppass = entrada.next();
        
        MiHelper h = new MiHelper();
        
        try {
            
            h.validarPassword(pass, reppass);
            System.out.println("Usuario registrado");
        }catch (CustomException e){
            
            System.out.println("No se puede registrar el usuario debido a que " + e.getMessage());
        }
    }
    
}
