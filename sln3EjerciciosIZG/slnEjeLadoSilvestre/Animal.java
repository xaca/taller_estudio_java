/*  Solución ejercicio el Lado Silvestre
    Isabel Zuluaga González - 000138379 */
public class Animal{

    private int id;
    private String species;
    private String name;
    private String lastVaccine;
    private String nextVaccine;

    // Constructor of class Animal 
    public Animal(){

    }

    public Animal(int id, String name, String species, String lastVaccine, String nextVaccine){
        this.id = id;
        this.name = name;
        this.species = species;
        this.lastVaccine = lastVaccine;
        this.nextVaccine = nextVaccine;
       // String month = lastVaccine.substring(3,5).parseInt();

       // this.nextVaccine = ''
    }
    // Set Methods
    public void setId(int i){
        id = i;
    }
    public void setSpecies(String s){
        species = s;
    }
    public void setName(String n){
        name = n;
    }
    public void setLastVaccine(String lv){
        lastVaccine = lv;
    }
    public void setNextVaccine(String nv){
        nextVaccine = nv;
    }
    // Get Methods 
    public int getId(){
        return id;
    }
    public String getSpecies(){
        return species;
    }
     public String getName(){
        return name;
    }
     public String getLastVaccine(){
        return lastVaccine;
    }
     public String getNextVaccine(){
        return nextVaccine;
    }

     
}