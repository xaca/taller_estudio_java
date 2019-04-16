public class Main {
    public static void main(String [ ] args) {

        Caja caja1 = new Caja(5,3,2);

        System.out.println(caja1.CalcularArea());
        System.out.println(caja1.CalcularVolumen());
        
        if(caja1.CompararConIdeal()){
            System.out.println("La caja es ideal");
        }else{
            System.out.println("La caja no es ideal");
        }

    }
}