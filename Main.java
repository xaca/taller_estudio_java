public class Main {

    public static void main(String args[]){
        String user,pass,passrepeat;

        user="Maicol";
        pass="maicol123";
        passrepeat="maicol123";

        Verifier v = new Verifier();

        try{
            v.validar(pass,passrepeat);
            System.out.println("Registro exitoso");
        }catch(CustomExcep e){

            System.out.println("No se puede registrar usuario: " + e.getMessage());

        }


        
    }
}