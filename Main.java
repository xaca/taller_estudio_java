public class Main {

    public static void main(String args[]){
        String user,pass,passrepeat;

        user="Maicol";
        pass="kkkkkks@sA2";
        passrepeat="kkkkkks@sA2";

        Verifier v = new Verifier();

        try{
            v.validar(pass,passrepeat);
            System.out.println("Registro exitoso del usuario: " + user);
        }catch(CustomExcep e){

            System.out.println("No se puede registrar usuario: " + e.getMessage());

        }


        
    }
}