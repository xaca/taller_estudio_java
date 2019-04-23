public class Carro implements Accidente{

    private int peso=128;
    private double velocidad=100;

    

 @Override
 public void Volcamiento(){
 	if(peso>100&&velocidad>80){
    System.out.println("el carro se vuelca por un peso de "+peso+"kg y una velocidad de "+velocidad+"km/h");
    }else{
    System.out.println("el carro no se vuelca");
    }
 }
 @Override
 public void Choque(){
 	 	if(peso>110&&velocidad>90){
    System.out.println("el carro se choca por un peso de "+peso+"kg y una velocidad de "+velocidad+"km/h");
    }else{
    System.out.println("el carro no se choca");
    }
    
 }
 
  


}