public class Main {
    public static void main(String [ ] args) {
     
        Gato gato = new Gato();
        System.out.println(gato.Comer("rata"));
        System.out.println(gato.Beber("leche"));
        System.out.println("Lo corro en "+gato.Correr(30)+" horas");
        if(gato.Saltar(2)){
            System.out.println("Si lo puedo saltar");
        }else{
            System.out.println("No lo puedo saltar");
        }

    }

}