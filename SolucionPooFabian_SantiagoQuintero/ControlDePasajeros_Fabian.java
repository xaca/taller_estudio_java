import java.util.ArrayList;
import java.util.Scanner;

public class ControlDePasajeros_Fabian {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        Aviones avion = new Aviones();
        Pasajeros pasajero = new Pasajeros();
        Vuelos vuelo = new Vuelos();

        
        int menu = 0;
        ArrayList<Aviones> aviones = new ArrayList<>();
        ArrayList<Pasajeros> pasajeros = new ArrayList<>();
        ArrayList<Vuelos> vuelos = new ArrayList<>();
        
        do{
            System.out.println("\n¿Que opcion deseas escoger?" + "\n1.Registrar aviones" + "\n2.Registrar Pasajeros" + "\n3.Registrar vuelos" + "\n4.Salir\n");
            menu = entrada.nextInt();
            
            if (menu < 1 || menu > 4){
                
                System.out.println("Ingrese una opcion entre 1 y 4");
            }
                
            switch(menu){

                case 1:

                    System.out.println("Ingrese el modelo del avion");
                    String modelo = entrada.next();
                    
                    System.out.println("Ingrese la matricula del avion");
                    String matricula = entrada.next();
                    
                    System.out.println("Ingrese el nuemro de pasajeros que caben en el avion");
                    int numeroPasajeros = entrada.nextInt();
                    
                    avion = new Aviones (modelo, matricula, numeroPasajeros);
                    aviones.add(avion);

                break;


                case 2:
                    
                    System.out.println("Ingrese la cedula del pasajero");
                    int cedula = entrada.nextInt();
                    
                    System.out.println("Ingrese el nombre");
                    String nombre = entrada.next();
                    
                    System.out.println("Ingrese la edad del pasajero");
                    int edad = entrada.nextInt();
                    
                    System.out.println("Ingrese el celular del pasajero");
                    int celular = entrada.nextInt();
                    
                    System.out.println("Ingrese el celular de un familiar del pasajero");
                    int celularFamiliar = entrada.nextInt();
                    
                    pasajero = new Pasajeros (cedula, nombre, edad, celular, celularFamiliar);
                    pasajeros.add(pasajero);

                break;
                
                
                case 3:

                    System.out.println("Ingrese el lugar de salida del vuelo");
                    String lugarSalida = entrada.next();
                    
                    System.out.println("Ingrese el lugar de destino del vuelo");
                    String lugarDestino = entrada.next();
                    
                    System.out.println("Ingresela fecha de salida del vuelo");
                    int fechaSalida = entrada.nextInt();
                    
                    System.out.println("Ingrese la fecha de llegada del vueloo");
                    int fechaLlegada = entrada.nextInt();
                    
                    vuelo = new Vuelos (avion, lugarSalida, lugarDestino, fechaSalida, fechaLlegada, pasajero);
                    vuelos.add(vuelo);

                break;

            }
        }while(menu != 4);
        
    }
}
