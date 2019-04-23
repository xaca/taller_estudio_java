import java.io.*;

public class Main {
    public static void main(String [ ] args) {
        
        // Una cadena mayor o igual a 4 caracteres
        String cadena = "hol";
        try{
            VerificarCadena(cadena);
        }catch(EOFException e){
            System.out.println("La cadena es menor a 4 caracteres");
        }
    }

    public static void VerificarCadena(String cadena) throws EOFException {

        if( cadena.length() < 4 ){
            throw new EOFException();
        }else{
            System.out.println("Genial");
        }

    }

}