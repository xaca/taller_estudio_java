public class Moto implements Accidente{

    private int numMaxPasajeros=4;
    private double traccion=3;
  
 @Override
 public void Volcamiento(){
    if(traccion<numMaxPasajeros){
    System.out.println("la moto se vuelca por que el hay "+numMaxPasajeros+" pasajeros y la traccion es "+traccion);
    }else{
    System.out.println("la Moto no se vuelca");
    }
 }
 @Override
 public void Choque(){
    if(numMaxPasajeros>2){
    System.out.println("la moro se vuelca por que el hay "+numMaxPasajeros+" pasajeros y eso excede la capacidad total de la moto");
    }else{
    System.out.println("la Moto no se vuelca");
    }
 }
 

}