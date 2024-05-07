package arbolBinarioOrdenado;

/**
 * Persona
 */
public class Persona implements Comparable{
    private int id;
    private String nombre;
    public Persona(int id, String nombre){
        this.id = id;
        this.nombre = nombre;
    }
    public Persona(){
        this(0, "");
    }
    public int getId(){
        return this.id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public boolean EsMenor(Object q){
        Persona obj = (Persona)q;
        return (id < obj.getId());
    }
    public boolean EsMayor(Object q){
        Persona obj = (Persona)q;
        return (id > obj.getId());
    }
    public boolean EsIgual(Object q){
        Persona obj = (Persona)q;
        return (id == obj.getId());
    }
    public String toString(){
        return id+" "+nombre;
    }
    
    
}