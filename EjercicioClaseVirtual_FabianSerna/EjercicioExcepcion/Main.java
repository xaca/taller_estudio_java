public class Main {
    public static void main(String [ ] args) {
        
        // Una cadena mayor o igual a 4 caracteres
        String cadena = "hol";
        try{
            
            if( cadena.length() >= 4 ){
                System.out.println("Genial");
            }else{
                throw new CaracteresExcepcion("La cadena es menor a 4 caracteres");
            }

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

}