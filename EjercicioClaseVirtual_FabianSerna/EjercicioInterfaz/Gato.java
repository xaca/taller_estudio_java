public class Gato implements Animal {

    public Gato(){

    }
    
    @Override
    public void Comer(){
        System.out.println("Como pescado");
    }

    @Override
    public void Beber(){
        System.out.println("Tomo leche");
    }

    @Override
    // distancia en metros
    public void Correr(){
        System.out.println("Corro 30 MPH");
    }

    @Override
    public void Saltar(){
        System.out.println("Salto hasta 3 metros");
    }

}