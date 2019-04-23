public class Gato implements Animal {

    public Gato(){

    }
    
    @Override
    public String Comer(String alimento){
        
        String mensaje = "";

        if(alimento == "pescado" || alimento == "rata"){
            mensaje += "Si como "+alimento;
        }else{
            mensaje += "No como "+alimento;
        }

        return mensaje;

    }

    @Override
    public String Beber(String bebida){

        String mensaje = "";

       if(bebida == "leche" || bebida == "agua"){
            mensaje += "Si tomo "+bebida;
        }else{
            mensaje += "No tomo "+bebida;
        }

        return mensaje;

    }

    @Override
    // distancia en metros
    public double Correr(double distancia){
        return distancia/30;
    }

    @Override
    public boolean Saltar(int altura){
        return altura < 3;
    }

}