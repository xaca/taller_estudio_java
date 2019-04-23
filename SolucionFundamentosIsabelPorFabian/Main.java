import java.util.Scanner;

public class Main {
    public static void main(String [ ] args) {
        
        Scanner leer = new Scanner(System.in);        
        int option = 0;
        int option2 = 0;
        String placa;
        char ultimoCaracter;

        do{

            System.out.println("-----------------------------------\nControl de pico y placa en Medellin\nSeleccione una opcion\n1. Consultar\n2. Salir");
            option = leer.nextInt();

            switch (option) {
                case 1:
                
                    System.out.print("-----------------------------------\nIngrese la placa del vehiculo: ");
                    placa = leer.next();
                    ultimoCaracter = placa.charAt(placa.length() - 1);
                    do{

                        System.out.println("-----------------------------------\nSeleccione una opcion:\n1. Lunes\n2. Martes\n3. Miercoles\n4. Jueves\n5. Viernes");
                        option2 = leer.nextInt();
            
                        if(option2 == 2){
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

                    }while(option2 < 1 || option2 > 5);

                    break;
            }

        }while(option!=2);

    }
}