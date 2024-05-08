package arbolBinarioOrdenado;
/**
 * Entero
 */
public class Entero implements Comparable{
    private int dato;
    //constructor
    public Entero(int dato){
        this.dato = dato;
    }
    public Entero(){
        this(0);
    }
    //getters y setters
    public int getDato(){
        return this.dato;
    }
    public void setDato(int dato){
        this.dato = dato;
    }
    //métodos de la interfaz Comparable
    public boolean EsMenor(Object q){
        Entero obj = (Entero)q;
        return (dato < obj.getDato());
    }
    public boolean EsMayor(Object q){
        Entero obj = (Entero)q;
        return (dato > obj.getDato());
    }
    public boolean EsIgual(Object q){
        Entero obj = (Entero)q;
        return (dato == obj.getDato());
    }
    //to string
    public String toString(){
        return dato+"";
    }

    
}