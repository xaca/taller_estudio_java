public class grupoNum implements Operaciones {
    private int numMin;
    private int numMax;
    private int resultado;

    grupoNum(){
        
    }

     grupoNum(int numMin, int numMax){
        this.numMin = numMin;
        this.numMax = numMax;
    }

    public int sumarNumeros() {
        
        for(int i=numMin; i>=numMin && i<=numMax; i++){
            resultado += i;
        }
        return resultado;
    }
    public void imprimirNumeros() {
        
        for(int i=numMin; i<=numMax; i++){
             System.out.println(i);
        }
        
    }
    public void imprimirNumerosPares(){
         
        for (int i=numMin; i<=numMax; i++){

            if (i%2==0){
                 System.out.println(i);
            }
           
        
        }
       
    }
    //Añadiendo un método que no está definido en Operaciones
    // int getLimiteMax(){
    //     return numMax;
    // }
}