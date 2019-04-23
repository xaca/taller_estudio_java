public class Gato implements Animal {

    public Gato(){

    }
    
    @Override
    public void Comer(String alimento){
        if(alimento == "pescado" || alimento == "rata"){
            System.out.println("Si como "+alimento);
        }else{
            System.out.println("No como "+alimento);
        }
    }

    @Override
    public void Beber(String bebida){
       if(bebida == "leche" || bebida == "agua"){
            System.out.println("Si tomo "+bebida);
        }else{
            System.out.println("No tomo "+bebida);
        }
    }

    @Override
    // distancia en metros
    public void Correr(double distancia){
        System.out.println("Lo corro en "+distancia/30+" horas");
    }

    @Override
    public void Saltar(int altura){
        if(altura > 3){
            System.out.println("No lo puedo saltar");
        }else{
            System.out.println("Si lo puedo saltar");
        }
    }

}