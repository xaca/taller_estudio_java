package Clase_virtual_actividades_Maicol_Llano.interfaces;

public class inventario{

    public static void main(String args[]){

    Serie arraySeries[] = new Serie[5];
    Videojuego arrayVideojuegos[] = new Videojuego[5];

    arraySeries[0]=new Serie("Juego de tronos",8,"fantasía", "George R. R. Martin",1);
    arraySeries[1]=new Serie("Falling Skies",5,"acción", "Robert Rodat",2);
    arraySeries[2]=new Serie("Mr. Robot",4,"thriller", "Sam Esmail",3);
    arraySeries[3]=new Serie("Van Helsing",4,"acción", "Neil LaBute",4);
    arraySeries[4]=new Serie("La casa de papel",3,"crimen", "Álex Pina",5);


    arrayVideojuegos[0]= new Videojuego("Fifa 19", 10, "sports", "EA Sports",1);
    arrayVideojuegos[1]= new Videojuego("The last of us", 15, "acción", "Naughty Dog",2);
    arrayVideojuegos[2]= new Videojuego("Call of Duty Ghosts", 15, "First-person shooter", "Activision",3);
    arrayVideojuegos[3]= new Videojuego("F.E.A.R", 10, "First-person shooter", "Monolith Productions",4);
    arrayVideojuegos[4]= new Videojuego("P.U.B.G", 10, "Battle Royale", "PUBG Corporation",5);
    
    // Vamos a mostrar el inventario de series

    for (int i = 0; i < arraySeries.length; i++) {
        System.out.println(arraySeries[i]);
      }

    // Vamos a mostrar el inventario de videojuegos

    for (int i = 0; i < arrayVideojuegos.length; i++) {
        System.out.println(arrayVideojuegos[i]);
      }
   
   // Vamos a prestar algunas series y videojuegos

   arrayVideojuegos[0].prestar();
   arraySeries[3].prestar();
   
   // se verifica que fueron prestados
    
    System.out.println(arraySeries[3].toString()); 
    System.out.println(arraySeries[3].isPrestado()); 
    System.out.println(arrayVideojuegos[0].toString()); 
    System.out.println(arrayVideojuegos[0].isPrestado()); 

    // Vamos a devolverlos

   arrayVideojuegos[0].devolver();
   arraySeries[3].devolver();

   // se verifica que fueron devueltos

    
    System.out.println(arraySeries[3].toString()); 
    System.out.println(arraySeries[3].isPrestado()); 
    System.out.println(arrayVideojuegos[0].toString()); 
    System.out.println(arrayVideojuegos[0].isPrestado()); 





        
}

}
    