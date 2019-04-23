import java.util.*; 
public class Ejercicio1
{
    public static void main(String[] args) {
        Random ran = new Random(); 
        System.out.println("¡¡¡Bienvenid@!!! •ᴗ•\n");
        String[] cabeza={"Caballo","Perro","Gato","Pato","Lobo","Leon","Jirafa","Elefante","Dragon","Llama"};
        String[] cuerpo={"Tigre","Pulpo","Camaleon","Avestruz","Gallina","Cebra","Cocodrilo","Escorpion","Vaca","Foca"};
        String[] lugar={"Desierto","Lago","Bosque Tropical","Bosque Templado","Manglar","Palya","Selva","Matorral","Rio","Humedal"};
        String[] zapatos={"Botas Timberland","Tenis Converse","Deportivos New Balance","Deportivos Nike","Tacones H&M","Sandalias Ipanema","Zapatillas Armani","Deportivos Adidas","Crocs","Plataformas Tommy Hilfiger"};
        String[] profesion={"Medico","Ingeniero de Sistemas","Administrador","Matematico","Astrofisico","Astronauta","Militar","Conductor","Cantante","Actor"};
        
        int PosRandom = ran.nextInt(9); 

        String cabezaNom=cabeza[PosRandom];
        String cuerpoNom=cuerpo[PosRandom];   
        String lugarNom=lugar[PosRandom];     
        String zapatoNom=zapatos[PosRandom]; 
        String profNom=profesion[PosRandom]; 
        
        System.out.println("Genial!! Has creado un: "+cabezaNom.substring(0,2)+cuerpoNom.substring(0,2)+lugarNom.substring(0,2)+zapatoNom.substring(0,2)+profNom.substring(0,2)+"\n");
        System.out.println("Cabeza: "+cabezaNom);
        System.out.println("Cuerpo: "+cuerpoNom);
        System.out.println("Vive en: "+lugarNom);
        System.out.println("Usa Zapatos/Marca: "+zapatoNom);
        System.out.println("Y Es un: "+profNom);
    }
}