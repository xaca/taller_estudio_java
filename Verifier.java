import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Verifier {

    Verifier(){

    }

    //String regExp = "((?=.*[*-@#$%])(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9]).{3,16})";

      
    // Se hace uso de expresiones regulares, que ayudaran a verificar que la contraseña cumpla las
    // siguientes características:

    // (?=.*[a-z]) -> Contenga al menos un caracter en minúscula
    // (?=.*[0-9]) -> Contenga al menos un número
    // (?=.*[@#$%]) -> contenga un caracter no alfanumerico
    // (?=.*[A-Z]) -> contenga una letra mayúscula
    // {6,16} -> tenga una longitud entre 6 y 16 caracteres

    String regExp1 = "(.{6,16})";
    String regExp2 = "((?=.*[*-@#$%]).{6,16})";
    String regExp3 = "((?=.*[A-Z]).{6,16})";
    String regExp4 = "((?=.*[a-z]).{6,16})";
    String regExp5 = "((?=.*[0-9]).{6,16})";
    
    // este método compila la expresión regular dada en un patron 

    Pattern p1 = Pattern.compile(regExp1);
    Pattern p2 = Pattern.compile(regExp2);
    Pattern p3 = Pattern.compile(regExp3);
    Pattern p4 = Pattern.compile(regExp4);
    Pattern p5 = Pattern.compile(regExp5);
  


   
   
    public boolean validar(String pass, 
    String passrepeat) throws CustomExcep {

       
       // este método realiza operaciones de comparación entre un patron (p) y un string (pass)
        
        Matcher m1 = p1.matcher(pass); 
        Matcher m2 = p2.matcher(pass);
        Matcher m3 = p3.matcher(pass);
        Matcher m4 = p4.matcher(pass);
        Matcher m5 = p5.matcher(pass);

        // se verifica que se cumplan las condiciones

        // System.out.println(m1.matches());
        // System.out.println(m2.matches());
        // System.out.println(m3.matches());
        // System.out.println(m4.matches());
        // System.out.println(m5.matches());

        if(!pass.equals(passrepeat)){
            throw new CustomExcep("Los campos de contraseña no son iguales");
        }

        if(!m1.matches()){
            throw new CustomExcep("La contraseña debe tener entre 6 y 16 caracteres");
        }

        if(!m2.matches()){
            throw new CustomExcep("La contraseña debe tener un caracter no alfanumérico");
        }


        if(!m3.matches()){
            throw new CustomExcep("La contraseña debe tener una letra mayuscula");
        }

        if(!m4.matches()){
            throw new CustomExcep("La contraseña debe tener una letra minuscula");
        }

        if(!m5.matches()){
            throw new CustomExcep("La contraseña debe tener un numero");
        }

       

     

        return true;
    }
}