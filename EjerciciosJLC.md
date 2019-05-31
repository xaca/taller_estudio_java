# Ejercicio Fundamentos de Programación 
:globe_with_meridians:

Se debe escribir un programa que enliste todos los números primos desde 1 hasta n.
n debe ser determinado por el usuario al ejecutar el programa.

# Ejercicio 2 (OOP)
:satellite:
Se necesita un programa para matemáticas que ayude a los estudiantes a hacer operaciones con numeros complejos.
Tener en cuenta que un numero complejo consta de una parte real y una imaginaria.
Para este programa se requiere los siguientes metodos:
- sumar complejo
- restar complejo
- multiplicar complejo
- multiplicar con escalar
- dividir complejo
- exponenciar complejo

# Ejercicio 3 (Interfaz)
Se debe implementar la interface KeyListener para imprimir el valor de la techa presionada a consola

```sh
import java.awt.*;  
import java.awt.event.*;  
public class KeyListenerExample extends Frame implements KeyListener{  
    Label l;  
    TextArea area;  
    KeyListenerExample(){  
          
        l=new Label();  
        l.setBounds(20,50,100,20);  
        area=new TextArea();  
        area.setBounds(20,80,300, 300);  
        area.addKeyListener(this);  
          
        add(l);add(area);  
        setSize(400,400);  
        setLayout(null);  
        setVisible(true);  
    }  
    public void keyPressed(KeyEvent e) {  
        l.setText("Tecla Presionada");  
    }  
    public void keyReleased(KeyEvent e) {  
        l.setText("Tecla Liberada");  
    }  
    public void keyTyped(KeyEvent e) {  
        l.setText("Tecla Escrita");  
    }  
  
    public static void main(String[] args) {  
        new KeyListenerExample();  
    }  
}  
```

# Ejercicio 4 (Excepción)
```sh
class Excepcion {
    static void nota(double x) throws ExcepcionNota {
        if (x < 3.0){
            throw new ExcepcionMayoriaEdad(x);
        }else{
            System.out.println("Ganaste el examen");
        }    
     }
	 
	 
    public static void main(String[] args)throws ExcepcionNota {
    
        try{
           nota(2.5);
		   
        }catch(ExcepcionNota e){
		
            System.out.println(e);
        }
    }
}
```
**Realizado por: José Luis Carretero** :punch: 