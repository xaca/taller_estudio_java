import java.io.*;
import javax.swing.*;
import java.util.*; 
//TEORIA:
//En su forma más común, una interfaz es un grupo de 
//métodos relacionados con el comportamiento de un 
//objeto que implemente la interfaz.
//Una interfaz es como una clase abstracta 
//no se utilizan para crear obejtos.

class Interfaz {
  public static void main(String[] args) {
    Estudiante miEstudiante = new Estudiante();  
    double estatura=168, peso=52;
    int id=000200550;
    
    try{
        id =  Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese su id"));
        miEstudiante.setId(id);
    }catch(NumberFormatException e){
        System.out.println("Numero incorrecto, por defecto 52");
        miEstudiante.setId(id);
    }catch(NullPointerException e){
        System.out.println("Numero incorrecto, por defecto 52");
        miEstudiante.setId(id);
    }
    try{
        estatura =  Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese su estatura en centimetros"));
        
    }catch(NumberFormatException e){
        System.out.println("Numero incorrecto, por defecto 168");
    }catch(NullPointerException e){
        System.out.println("Numero incorrecto, por defecto 168");
    }finally{
        System.out.println(String.valueOf(estatura/100)+"m");
    }
    try{
        peso =  Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese su peso en kilogramos"));
        
    }catch(NumberFormatException e){
        System.out.println("Numero incorrecto, por defecto 52");
    }catch(NullPointerException e){
        System.out.println("Numero incorrecto, por defecto 52");
    }finally{
        System.out.println(String.valueOf(peso)+"kg");
    }
    
    System.out.println("Para el id "+miEstudiante.getId()+" el imc es: "+String.valueOf(miEstudiante.getIMC(estatura, peso)));
    System.out.println("\nTenga en cuenta que:\nPeso inferior al normal: menos de 18.5\nPeso normal: 18.5-24.9\nPeso superarior al normal: 25.0-29.9\nObesidad: Mas de 30.0");
  }
}