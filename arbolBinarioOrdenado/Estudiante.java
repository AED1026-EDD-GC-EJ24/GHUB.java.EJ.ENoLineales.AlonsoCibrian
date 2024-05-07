package arbolBinarioOrdenado;

/**
 * Estudiante
 */
public class Estudiante implements Comparable{

    private int codigo;
    private String nombre;
    //constructor
    public Estudiante(int codigo, String nombre){
        this.codigo = codigo;
        this.nombre = nombre;
    }
    //getters y setters
    public int getcodigo(){
        return this.codigo;
    }
    public void setcodigo(int codigo){
        this.codigo = codigo;
    }
    public String getnombre(){
        return this.nombre;
    }
    public void setnombre(String nombre){
        this.nombre = nombre;
    }
    //métodos de la interfaz Comparable
    public boolean EsMenor(Object q){
        Estudiante obj = (Estudiante)q;
        return (codigo < obj.getcodigo());
    }
    public boolean EsMayor(Object q){
        Estudiante obj = (Estudiante)q;
        return (codigo > obj.getcodigo());
    }
    public boolean EsIgual(Object q){
        Estudiante obj = (Estudiante)q;
        return (codigo == obj.getcodigo());
    }
    

}