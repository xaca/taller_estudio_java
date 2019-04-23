
class Excepcion {
    static void edad(int a) throws ExcepcionMayoriaEdad {
        if (a <18)
        {
            throw new ExcepcionMayoriaEdad(a);
        }
        else{
            System.out.println("Eres mayor de edad");
        }
           
           
     }
    public static void main(String[] args)throws ExcepcionMayoriaEdad {
    
        try{
           edad(19);
        }
        catch(ExcepcionMayoriaEdad e)
        {
            System.out.println(e);
        }
            
        
    }
}