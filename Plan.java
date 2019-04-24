public class Plan{
    private int precio;
    private int numero;
    private Boolean instructorPrivado;

    public int PrecioBase(){
     
     switch(numero)
     { 
       case 1:
       precio=75000;
       return precio;
       case 2:
       precio=415000;
       return precio;
       case 3:
       precio=415000;
       return precio;
       default:
       System.out.println("No existe ese plan");
       return -1;
     }

    }
     
    public double costoAdd(){
      if(instructorPrivado){
        double costoAdd=0.0;
        costoAdd=precio*0.4;
        return costoAdd;
      }
      else{
        System.out.println("No tiene costos adicionales");
        return 0;
      }

    }

    public double costoTotal(double costoAdd){
        
        return precio+costoAdd;
    
    }

    public Plan()
    {

    }

    public void setInstructorPrivado(Boolean instructorPrivado){
        this.instructorPrivado = instructorPrivado;
    }

    public Boolean getInstructorPrivado(){
        return instructorPrivado;
    }


    public void setPrecio(int precio){
        this.precio = precio;
    }

    public int getPrecio(){
        return precio;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public int getNumero(){
        return numero;
    }
    

}