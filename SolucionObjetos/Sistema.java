
public class Sistema
{
    private Ambiente ambientes;
    private Alergia alergias;
    public Sistema()
    {
        ambientes=new Ambiente();
        alergias=new Alergia();
    }
    public Sistema(Ambiente ambienteA, Alergia alergiaA)
    {
        ambientes=ambienteA;
        alergias=alergiaA;
    }
        
    public void definirRecomendacion(){
        int congestion=alergias.getNivelCongestion();
        int picazon=alergias.getPicazonNariz();
        int molestias=alergias.getMolestiasEpidermicas();

        int contaminacion=ambientes.getNivelContaminacion();
        int temperatura=ambientes.getTemperatura();
        int kilometraje=ambientes.getKilometraje();
        int estadoClima=ambientes.getEstadoClima();

        if(congestion==1&&picazon==1&&molestias==1&&
        contaminacion<55&&temperatura>17&&kilometraje<29&&
        estadoClima==1)
        {
            System.out.println("\nPuedes estar tranquilo hoy");
        }
        else if(congestion==1&&picazon==1&&molestias==1&&
        contaminacion<55&&temperatura<17&&kilometraje<29&&
        estadoClima==1)
        {
            System.out.println("\nEl clima esta fresco hoy, cuidate de los vientos frios");
        }
        else if(congestion==1&&picazon==2&&molestias==1&&
        contaminacion<55&&temperatura<17&&kilometraje<29&&
        estadoClima==3)
        {
            System.out.println("\nCuidate mucho de los lugares humedos");
        }
        else if(congestion==2&&picazon==1&&molestias==1&&
        contaminacion<55&&temperatura<17&&kilometraje<29&&
        estadoClima==2)
        {
            System.out.println("\nCuidate mucho de los lugares con polvo");
        }
        else if(congestion==2&&picazon==2&&molestias==1&&
        contaminacion<55&&temperatura<17&&kilometraje<29&&
        estadoClima==2)
        {
            System.out.println("\nCuidate mucho de los lugares con polvo");
        }
        else if(congestion==1&&picazon==1&&molestias==2&&
        contaminacion<55&&temperatura<17&&kilometraje<29&&
        estadoClima==3)
        {
            System.out.println("\nCuida mucho tu piel, humectala muchisimo");
        }
        else if(congestion==2&&picazon==2&&molestias==2&&
        contaminacion<55&&temperatura<17&&kilometraje<29&&
        estadoClima==2)
        {
            System.out.println("\nCuidate mucho tu piel y tu nariz, humectalas muchisimo");
        }   
        else if(congestion==2&&picazon==2&&molestias==2&&
        contaminacion>55&&temperatura<17&&kilometraje>29&&
        estadoClima==3)
        {
            System.out.println("\nHumecta bien tu piel, cubrete del frio y el sereno");
        }   
        else if(congestion==1&&picazon==2&&molestias==1&&
        contaminacion>55&&temperatura<17&&kilometraje>29&&
        estadoClima==2)
        {
            System.out.println("\nUsa bufanda hoy, el clima esta muy frio");
        } 
        else if(congestion==1&&picazon==1&&molestias==2&&
        contaminacion<55&&temperatura>17&&kilometraje<29&&
        estadoClima==1)
        {
            System.out.println("\nCuida mucho tu piel, humectala muchisimo");
        }
        else if(congestion==2&&picazon==2&&molestias==2&&
        contaminacion<55&&temperatura>17&&kilometraje<29&&
        estadoClima==2)
        {
            System.out.println("\nCuidate mucho tu piel y tu nariz, humectalas muchisimo");
        }   
        else if(congestion==2&&picazon==2&&molestias==2&&
        contaminacion>55&&temperatura>17&&kilometraje<29&&
        estadoClima==1)
        {
            System.out.println("\nCuidate de los lugares con polvo y evita salir en la mañana o en las horas picos");
        }   
        else if(congestion==1&&picazon==2&&molestias==1&&
        contaminacion>55&&temperatura>17&&kilometraje<29&&
        estadoClima==2)
        {
            System.out.println("\nCuidate de los lugares con mucho polvo");
        } 
        else{
            System.out.println("\nQuizas la combinacion ingresada es muy rara y no esta disponible");
        }
    }
}