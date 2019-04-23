/*  Solución ejercicio el Lado Silvestre
    Isabel Zuluaga González - 000138379 */
import java.lang.StringBuilder;
import java.io.*;
import java.util.Scanner;
import java.util.*;
import java.util.Date;
 import java.time.LocalDateTime;

public class ElLadoSilvestre{

    public static void main(String args[])
    {
        System.out.println("Zoologico: El Lado Silvestre");

        // this scanner allows the programm to read an user input in this case is an animal id and current date
        Scanner myAnimalId = new Scanner(System.in);
        Scanner todaysDate = new Scanner(System.in);
        Scanner newLastVaccineDate = new Scanner(System.in);
 
        // we use this to instance an object animal 
        Animal myAnimal0 = new Animal(100,"Colby","Tigre","20-01-2019","20-02-2019");
        Animal myAnimal1 = new Animal(200,"Nala","Boa","04-10-2019","04-11-2019");
        Animal myAnimal2 = new Animal(300,"Princesa","Pomeranian","15-05-2019","15-06-2019");
        Animal myAnimal3 = new Animal(400,"Nairobi","Simio","21-06-2019","21-07-2019");
        
        //System.out.println("nombre de su animal: "+ myAnimal0.getLastVaccine().substring(3,5));

        System.out.println("Ingrese el id del animal:");
        int usersAnimalId = myAnimalId.nextInt();
       
       String info;
       String currentDate;
       String inputDateLv;
       String dayNew;
       String yearNew;
       String monthNew; 

       int monthNewint ;
       int monthPlusOne; 
       
       int yearlv;
       int monthlv;
       int daylv;

       int yearnv;
       int monthnv;
       int daynv;

       int year;
       int month;
       int day;

       if(usersAnimalId == 100 || usersAnimalId == 200 || usersAnimalId == 300){
        switch (usersAnimalId){
            case 100:  

            info = ("Nombre: "+ myAnimal0.getName()+ "\n Especie: "+ myAnimal0.getSpecies()+ "\n Ultima Vacuna: "+ myAnimal0.getLastVaccine()+ "\n Proxima Vacuna: "+ myAnimal0.getNextVaccine());
            System.out.println(info);

             System.out.println("Ingrese la fecha actual para reporte de vacuna:");
              currentDate = todaysDate.next();

            year = Integer.parseInt(currentDate.substring(6,10));
            month = Integer.parseInt(currentDate.substring(3,5));
            day = Integer.parseInt(currentDate.substring(0,2));
                 System.out.println("Today date: \n"+year+"\n"+month+"\n"+day);

            yearlv = Integer.parseInt(myAnimal0.getLastVaccine().substring(6,10));
            monthlv = Integer.parseInt(myAnimal0.getLastVaccine().substring(3,5));
            daylv = Integer.parseInt(myAnimal0.getLastVaccine().substring(0,2));
                 System.out.println("Last Vaccine: \n"+yearlv+"\n"+monthlv+"\n"+daylv);

             yearnv = Integer.parseInt(myAnimal0.getNextVaccine().substring(6,10));
            monthnv = Integer.parseInt(myAnimal0.getNextVaccine().substring(3,5));
            daynv = Integer.parseInt(myAnimal0.getNextVaccine().substring(0,2));
                 System.out.println("Next Vaccine: \n"+yearnv+"\n"+monthnv+"\n"+daynv);
                 
                if(day<=30 && month<=12)
                { 
                    if(year==yearnv)
                    {
                        if(month==monthnv && day==daynv)
                        {
                            System.out.println("Se debe vacunar el animal hoy");
                        }
                        if(month==monthlv && day>daylv || month==monthnv && day<daynv )
                        {
                            System.out.println("Vacunas al dia!!!");
                        }
                        if(month==monthnv && day>daynv || month>monthnv)
                        {
                            System.out.println("Faltan vacunas");
                        }
                        
                    }else{
                        System.out.println("Solo se presentan reportes de ESTE AÑO...");
                    }
                }else{
                    System.out.println("Fecha incorrecta, intentelo de nuevo");
                }
                 
                 
                 System.out.println("Ingrese la nueva fecha de la ultima vacuna (dd-mm-aaaa):");
                  inputDateLv = newLastVaccineDate.next();
                 myAnimal0.setLastVaccine(inputDateLv);
                 
                  System.out.println("fecha nueva ultima vacuna: "+ myAnimal0.getLastVaccine());
                   monthNewint = Integer.parseInt(myAnimal0.getLastVaccine().substring(3,5));
                   monthPlusOne = monthNewint + 1;
                   dayNew= inputDateLv.substring(0,2);
                   yearNew= inputDateLv.substring(6,10);
                   monthNew = Integer.toString(monthNewint);
                    myAnimal0.setNextVaccine(dayNew+"-"+monthPlusOne+"-"+yearNew);
                    System.out.println("fecha nueva proxima vacuna: "+ myAnimal0.getNextVaccine());

            break;

            case 200:  info = ("Nombre: "+ myAnimal1.getName()+ "\n Especie: "+ myAnimal1.getSpecies()+ "\n Ultima Vacuna: "+ myAnimal1.getLastVaccine()+ "\n Proxima Vacuna: "+ myAnimal1.getNextVaccine());
            System.out.println(info);

             System.out.println("Ingrese la fecha actual para reporte de vacuna:");
              currentDate = todaysDate.next();

            year = Integer.parseInt(currentDate.substring(6,10));
            month = Integer.parseInt(currentDate.substring(3,5));
            day = Integer.parseInt(currentDate.substring(0,2));
                 System.out.println("Today date: \n"+year+"\n"+month+"\n"+day);

            yearlv = Integer.parseInt(myAnimal1.getLastVaccine().substring(6,10));
            monthlv = Integer.parseInt(myAnimal1.getLastVaccine().substring(3,5));
            daylv = Integer.parseInt(myAnimal1.getLastVaccine().substring(0,2));
                 System.out.println("Last Vaccine: \n"+yearlv+"\n"+monthlv+"\n"+daylv);

             yearnv = Integer.parseInt(myAnimal1.getNextVaccine().substring(6,10));
            monthnv = Integer.parseInt(myAnimal1.getNextVaccine().substring(3,5));
            daynv = Integer.parseInt(myAnimal1.getNextVaccine().substring(0,2));
                 System.out.println("Next Vaccine: \n"+yearnv+"\n"+monthnv+"\n"+daynv);
                 
                if(day<=30 && month<=12)
                { 
                    if(year==yearnv)
                    {
                        if(month==monthnv && day==daynv)
                        {
                            System.out.println("Se debe vacunar el animal hoy");
                        }
                        if(month==monthlv && day>daylv || month==monthnv && day<daynv )
                        {
                            System.out.println("Vacunas al dia!!!");
                        }
                        if(month==monthnv && day>daynv || month>monthnv)
                        {
                            System.out.println("Faltan vacunas");
                        }
                        
                    }else{
                        System.out.println("Solo se presentan reportes de ESTE AÑO...");
                    }
                }else{
                    System.out.println("Fecha incorrecta, intentelo de nuevo");
                }
                 
                 
                 System.out.println("Ingrese la nueva fecha de la ultima vacuna (dd-mm-aaaa):");
                 inputDateLv = newLastVaccineDate.next();
                 myAnimal1.setLastVaccine(inputDateLv);
                 
                  System.out.println("fecha nueva ultima vacuna: "+myAnimal1.getLastVaccine());
                   monthNewint = Integer.parseInt(myAnimal1.getLastVaccine().substring(3,5));
                   monthPlusOne = monthNewint + 1;
                   dayNew= inputDateLv.substring(0,2);
                   yearNew= inputDateLv.substring(6,10);
                   monthNew = Integer.toString(monthNewint);
                    myAnimal1.setNextVaccine(dayNew+"-"+monthPlusOne+"-"+yearNew);
                    System.out.println("fecha nueva proxima vacuna: "+ myAnimal1.getNextVaccine());





            break;

            case 300:  info = ("Nombre: "+ myAnimal2.getName()+ "\n Especie: "+ myAnimal2.getSpecies()+ "\n Ultima Vacuna: "+ myAnimal2.getLastVaccine()+ "\n Proxima Vacuna: "+ myAnimal2.getNextVaccine());
            System.out.println(info);

             System.out.println("Ingrese la fecha actual para reporte de vacuna:");
             currentDate = todaysDate.next();

            year = Integer.parseInt(currentDate.substring(6,10));
            month = Integer.parseInt(currentDate.substring(3,5));
            day = Integer.parseInt(currentDate.substring(0,2));
                 System.out.println("Today date: \n"+year+"\n"+month+"\n"+day);

            yearlv = Integer.parseInt(myAnimal2.getLastVaccine().substring(6,10));
            monthlv = Integer.parseInt(myAnimal2.getLastVaccine().substring(3,5));
            daylv = Integer.parseInt(myAnimal2.getLastVaccine().substring(0,2));
                 System.out.println("Last Vaccine: \n"+yearlv+"\n"+monthlv+"\n"+daylv);

             yearnv = Integer.parseInt(myAnimal2.getNextVaccine().substring(6,10));
            monthnv = Integer.parseInt(myAnimal2.getNextVaccine().substring(3,5));
            daynv = Integer.parseInt(myAnimal2.getNextVaccine().substring(0,2));
                 System.out.println("Next Vaccine: \n"+yearnv+"\n"+monthnv+"\n"+daynv);
                 
                if(day<=30 && month<=12)
                { 
                    if(year==yearnv)
                    {
                        if(month==monthnv && day==daynv)
                        {
                            System.out.println("Se debe vacunar el animal hoy");
                        }
                        if(month==monthlv && day>daylv || month==monthnv && day<daynv )
                        {
                            System.out.println("Vacunas al dia!!!");
                        }
                        if(month==monthnv && day>daynv || month>monthnv)
                        {
                            System.out.println("Faltan vacunas");
                        }
                        
                    }else{
                        System.out.println("Solo se presentan reportes de ESTE AÑO...");
                    }
                }else{
                    System.out.println("Fecha incorrecta, intentelo de nuevo");
                }
                 
                 
                 System.out.println("Ingrese la nueva fecha de la ultima vacuna (dd-mm-aaaa):");
                 inputDateLv = newLastVaccineDate.next();
                 myAnimal2.setLastVaccine(inputDateLv);
                 
                  System.out.println("fecha nueva ultima vacuna: "+myAnimal2.getLastVaccine());
                   monthNewint = Integer.parseInt(myAnimal2.getLastVaccine().substring(3,5));
                   monthPlusOne = monthNewint + 1;
                   dayNew= inputDateLv.substring(0,2);
                   yearNew= inputDateLv.substring(6,10);
                   monthNew = Integer.toString(monthNewint);
                    myAnimal2.setNextVaccine(dayNew+"-"+monthPlusOne+"-"+yearNew);
                    System.out.println("fecha nueva proxima vacuna: "+ myAnimal2.getNextVaccine());

            break;

            case 400:  info = ("Nombre: "+ myAnimal3.getName()+ "\n Especie: "+ myAnimal3.getSpecies()+ "\n Ultima Vacuna: "+ myAnimal3.getLastVaccine()+ "\n Proxima Vacuna: "+ myAnimal3.getNextVaccine());
            System.out.println(info);

             System.out.println("Ingrese la fecha actual para reporte de vacuna:");
              currentDate = todaysDate.next();

            year = Integer.parseInt(currentDate.substring(6,10));
            month = Integer.parseInt(currentDate.substring(3,5));
            day = Integer.parseInt(currentDate.substring(0,2));
                 System.out.println("Today date: \n"+year+"\n"+month+"\n"+day);

            yearlv = Integer.parseInt(myAnimal3.getLastVaccine().substring(6,10));
            monthlv = Integer.parseInt(myAnimal3.getLastVaccine().substring(3,5));
            daylv = Integer.parseInt(myAnimal3.getLastVaccine().substring(0,2));
                 System.out.println("Last Vaccine: \n"+yearlv+"\n"+monthlv+"\n"+daylv);

             yearnv = Integer.parseInt(myAnimal3.getNextVaccine().substring(6,10));
            monthnv = Integer.parseInt(myAnimal3.getNextVaccine().substring(3,5));
            daynv = Integer.parseInt(myAnimal3.getNextVaccine().substring(0,2));
                 System.out.println("Next Vaccine: \n"+yearnv+"\n"+monthnv+"\n"+daynv);
                 
                if(day<=30 && month<=12)
                { 
                    if(year==yearnv)
                    {
                        if(month==monthnv && day==daynv)
                        {
                            System.out.println("Se debe vacunar el animal hoy");
                        }
                        if(month==monthlv && day>daylv || month==monthnv && day<daynv )
                        {
                            System.out.println("Vacunas al dia!!!");
                        }
                        if(month==monthnv && day>daynv || month>monthnv)
                        {
                            System.out.println("Faltan vacunas");
                        }
                        
                    }else{
                        System.out.println("Solo se presentan reportes de ESTE AÑO...");
                    }
                }else{
                    System.out.println("Fecha incorrecta, intentelo de nuevo");
                }
                 
                 
                 System.out.println("Ingrese la nueva fecha de la ultima vacuna (dd-mm-aaaa):");
                 inputDateLv = newLastVaccineDate.next();
                 myAnimal3.setLastVaccine(inputDateLv);
                 
                  System.out.println("fecha nueva ultima vacuna: "+myAnimal3.getLastVaccine());
                   monthNewint = Integer.parseInt(myAnimal3.getLastVaccine().substring(3,5));
                   monthPlusOne = monthNewint + 1;
                   dayNew= inputDateLv.substring(0,2);
                   yearNew= inputDateLv.substring(6,10);
                   monthNew = Integer.toString(monthNewint);
                    myAnimal2.setNextVaccine(dayNew+"-"+monthPlusOne+"-"+yearNew);
                    System.out.println("fecha nueva proxima vacuna: "+ myAnimal3.getNextVaccine());


            break;


         }
       }else{
            System.out.println("No hay animales con ese Id");
       }

      
   
    }
    
   

}