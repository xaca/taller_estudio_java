import java.io.Console;
import java.io.*;
import javax.swing.*;
public class Programa {
    public static Alergia alergia=new Alergia();        
    public static Ambiente ambiente=new Ambiente();
    public static void main(String args[]) {
        
        try {
            System.out.println("\nSeleccione un tipo de molestias epidermicas:\n1.Ninguno\n2.Demartitis");
            int molestias = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese su respuesta:"));
            eleccionAlergia(molestias,"molestias");     
        }catch(NumberFormatException e){
            System.out.println("Numero incorrecto, por defecto 1");
            alergia.setMolestiasEpidermicas(1);
            
        }catch(NullPointerException e){
            System.out.println("Numero incorrecto, por defecto 1");
            alergia.setMolestiasEpidermicas(1);
            
        }finally{
            System.out.println("Molestia:"+String.valueOf(alergia.getMolestiasEpidermicas()));
        }

        try{
            System.out.println("\nSeleccione el nivel de congestion:\n1.Leve\n2.Fuerte");
            int congestion= Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese su respuesta:"));
            eleccionAlergia(congestion,"congestion");
        }catch(NumberFormatException e){
            System.out.println("Numero incorrecto, por defecto 1");
            alergia.setNivelCongestion(1);
            
        }catch(NullPointerException e){
            System.out.println("Numero incorrecto, por defecto 1");
            alergia.setNivelCongestion(1);
            
        }finally{
            System.out.println("Congestion:"+String.valueOf(alergia.getNivelCongestion()));
        }
        
        try{
            System.out.println("\nSeleccione el nivel de picazon en la nariz:\n1.Leve\n2.Fuerte");
            int picazon= Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese su respuesta:"));
            eleccionAlergia(picazon,"picazon");
        }catch(NumberFormatException e){
            System.out.println("Numero incorrecto, por defecto 1");
            alergia.setPicazonNariz(1);
            
        }catch(NullPointerException e){
            System.out.println("Numero incorrecto, por defecto 1");
            alergia.setPicazonNariz(1);
            
        }finally{
            System.out.println("Picazon:"+String.valueOf(alergia.getPicazonNariz()));
        }
        
        try {
            System.out.println("\nIngrese el nivel de contaminacion:");
            String contaminacion= JOptionPane.showInputDialog(null,"\nIngrese el nivel de contaminacion:");
            int contaminacionInt=Integer.parseInt(contaminacion);
            eleccionAmbiente(contaminacionInt,"contaminacion");
        }catch(NumberFormatException e){
            System.out.println("Numero incorrecto, por defecto 30");
            ambiente.setNivelContaminacion(30);
            
        }catch(NullPointerException e){
            System.out.println("Numero incorrecto, por defecto 30");
            ambiente.setNivelContaminacion(30);
            
        }finally{
            System.out.println("Contaminacion:"+String.valueOf(ambiente.getNivelContaminacion()));
        }
        
        try {
            System.out.println("\nIngrese el nivel de temperatura en celsius:");
            String temperatura=JOptionPane.showInputDialog(null,"\nIngrese la temperatura en celsius:");
            int temperaturaInt=Integer.parseInt(temperatura);
            eleccionAmbiente(temperaturaInt,"temperatura");
        }catch(NumberFormatException e){
            System.out.println("Numero incorrecto, por defecto 15");
            ambiente.setTemperatura(15);

        }catch(NullPointerException e){
            System.out.println("Numero incorrecto, por defecto 15");
            ambiente.setTemperatura(15);

        }finally{
            System.out.println("Temperatura:"+String.valueOf(ambiente.getTemperatura()));
        }
        
        try {
            System.out.println("\nIngrese el kilometraje del viento:");
            String kilometraje=JOptionPane.showInputDialog(null,"\nIngrese la temperatura el kilometraje del viento:");
            int kilometrajeInt=Integer.parseInt(kilometraje);
            eleccionAmbiente(kilometrajeInt,"kilometraje");
            
        }catch(NumberFormatException e){
            System.out.println("Numero incorrecto, por defecto 15");
            ambiente.setKilometraje(15);

        }catch(NullPointerException e){
            System.out.println("Numero incorrecto, por defecto 15");
            ambiente.setKilometraje(15);

        }finally{
            System.out.println("Kilometraje:"+String.valueOf(ambiente.getKilometraje()));
        }
        

        try {
            System.out.println("\nSeleccione el estado del clima:\n1.Soleado\n2.Nuboso\n3.Lluvioso");
            int estado= Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese su respuesta:"));
            eleccionAmbiente(estado,"estado");
        }catch(NumberFormatException e){
            System.out.println("Numero incorrecto, por defecto 1");
            ambiente.setEstadoClima(1);

        }catch(NullPointerException e){
            System.out.println("Numero incorrecto, por defecto 1");
            ambiente.setEstadoClima(1);

        }finally{
            System.out.println("Estado:"+String.valueOf(ambiente.getEstadoClima()));
        }
        
        Sistema sistema=new Sistema(ambiente,alergia);
        sistema.definirRecomendacion();
        
    }
    public static void eleccionAlergia(int eleccion, String atributo)
    {
        switch(atributo)
        {
            case "molestias":
                alergia.setMolestiasEpidermicas(eleccion);
                break;
            case "congestion":
                alergia.setNivelCongestion(eleccion);
                break;
            case "picazon":
                alergia.setPicazonNariz(eleccion);
                break;    

        }

    }
    public static void eleccionAmbiente(int eleccion, String atributo)
    {
        switch(atributo)
        {
            case "contaminacion":
                ambiente.setNivelContaminacion(eleccion);
                break;
            case "temperatura":
                ambiente.setTemperatura(eleccion);
                break;
            case "kilometraje":
                ambiente.setKilometraje(eleccion);
                break;    
            case "estado":
                ambiente.setEstadoClima(eleccion);
                break;
        }
    }

}