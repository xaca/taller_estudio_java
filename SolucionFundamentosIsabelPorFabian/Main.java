import java.util.Scanner;

public class Main {
    public static void main(String [ ] args) {
        
        Scanner leer = new Scanner(System.in);        
        int opcion = 0;
        int opcion2 = 0;
        String placa;
        char ultimoCaracter;

        do{

            System.out.println("-----------------------------------\nControl de pico y placa en Medellin\nSeleccione una opcion\n1. Consultar\n2. Salir");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                
                    System.out.print("-----------------------------------\nIngrese la placa del vehiculo: ");
                    placa = leer.next();
                    ultimoCaracter = placa.charAt(placa.length() - 1);
                    do{

                        System.out.println("-----------------------------------\nSeleccione una opcion:\n1. Lunes\n2. Martes\n3. Miercoles\n4. Jueves\n5. Viernes");
                        opcion2 = leer.nextInt();
            
                        if(opcion2 == 2){
                            if(ultimoCaracter == '0' || ultimoCaracter == '1' || ultimoCaracter == '2' || ultimoCaracter == '3'){
                                System.out.println("\nCarro tiene pico y placa");
                            }else{
                                System.out.println("\nCarro NO tiene pico y placa");
                            }
                        }else{
                            if(ultimoCaracter == '6' || ultimoCaracter == '7' || ultimoCaracter == '8' || ultimoCaracter == '9'){
                                System.out.println("\nCarro tiene pico y placa");
                            }else{
                                System.out.println("\nCarro NO tiene pico y placa");
                            }
                        }

                    }while(opcion2 < 1 || opcion2 > 5);

                    break;
            }

        }while(opcion!=2);

    }
}