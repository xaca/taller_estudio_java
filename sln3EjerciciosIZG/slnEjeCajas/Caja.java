/*  Solución ejercicio de las Cajas
    Isabel Zuluaga González - 000138379 */
public class Caja{

    private double alto;
    private double largo;
    private double ancho; 

    public Caja(){

    }

    public Caja(double alto, double ancho, double largo){
        this.largo = largo; //b
        this.ancho = ancho;// a
        this.alto = alto; // h 
    }

    public void setAlto(double alto){
        this.alto = alto;
    }

    public void setAncho(double ancho){
        this.ancho = ancho;
    }

    public void setLargo(double largo){
        this.largo = largo;
    }

    public double getAlto(){
        return alto;
    }
    public double getAncho(){
        return ancho;
    }
    public double getLargo(){
        return largo;
    }

    public double getArea(){
        double area = 2*((ancho*largo)+(ancho*alto)+(largo*alto));
        return area;
    }

    public double getVolumen(){
        double volumen = ancho*largo*alto;
        return volumen;
    }

    public double getPerimetro(){
        double perimetro = 4*(largo + ancho + alto);
        return perimetro;
    }
}