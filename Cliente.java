public class Cliente{

    private Plan planes;
    private int edad;
    private Boolean estudiante;

    public double descuentos(boolean estudiante,int edad)
    { 
        double descuento=0;
        if(estudiante){

            descuento=planes.getPrecio()*0.05;
            System.out.println("tiene un descuento por ser estudiante de "+planes.getPrecio()*0.05);
        }
        if(edad>60){
           descuento+=planes.getPrecio()*0.2;
           System.out.println("tiene un descuento por ser mayor de 60 años de "+planes.getPrecio()*0.2);
        }
        if(edad<25){
           descuento+=planes.getPrecio()*0.15;
           System.out.println("tiene un descuento por ser menor de 25 años de "+planes.getPrecio()*0.15);
        }

        return descuento;
    }

    public double valorTotal(double descuento){
        return planes.getPrecio()-descuento;

    }
  
    public Cliente()
    {

    }

    public void setPlan(Plan planes)
    {
        this.planes = planes;
    }

    public Plan getPlan()
    {
        return planes;
    }

    public void setEdad(int edad)
    {
        this.edad = edad;
    }

    public int getEdad()
    {
        return edad;
    }

    public void setEstudiante(Boolean estudiante){
        this.estudiante = estudiante;
    }

    public Boolean getEstudiante(){
        return estudiante;
    }
    

}