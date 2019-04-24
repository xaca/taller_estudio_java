import javax.swing.*;
public class Programa{

    public static void main(String args[])
    {
     Plan plan= new Plan();
     Cliente cliente= new Cliente();
     String mensaje="Bienvenido al gym upb \n elija el numero de uno de los planes \n 1.$ 75.000 \n 2.$ 415.000 \n 3.$ 812.000";
     int numPlan=Integer.parseInt(JOptionPane.showInputDialog(null,mensaje));
     int edad=Integer.parseInt(JOptionPane.showInputDialog(null,"¿cual es tu edad?"));
     int instructor=Integer.parseInt(JOptionPane.showInputDialog(null,"¿quieres un instructor personalizado?\n inserta: \n1.si quiero \n2.no quiero"));
     int estudiante=Integer.parseInt(JOptionPane.showInputDialog(null,"¿eres estudiante de la upb?\n inserta: \n1.si  \n2.no "));
     cliente.setEdad(edad);
     plan.setNumero(numPlan);
     cliente.setPlan(plan);
     
     switch(instructor){
     	case 1:
     	plan.setInstructorPrivado(true);
     	break;
     	case 2:
     	plan.setInstructorPrivado(false);
     	break;
     	default:
     	System.out.println("Entrada incorrecta");
     	break;
     }

        switch(estudiante){
     	case 1:
     	cliente.setEstudiante(true);
     	break;
     	case 2:
     	cliente.setEstudiante(false);
     	break;
     	default:
     	System.out.println("Entrada incorrecta");
     	break;
     }


     System.out.println("El costo base del plan seleccionado es "+plan.PrecioBase());
     System.out.println("El costo adicional por instructor es "+plan.costoAdd());
     //System.out.println("El costo total a pagar sin descuentos es "+plan.costoTotal(plan.costoAdd()));
     System.out.println("Se le hace un descuento total de "+cliente.descuentos(cliente.getEstudiante(),cliente.getEdad()));
     System.out.println("El valor total a pagar es de "+cliente.valorTotal(cliente.descuentos(cliente.getEstudiante(),cliente.getEdad())));

    }

}