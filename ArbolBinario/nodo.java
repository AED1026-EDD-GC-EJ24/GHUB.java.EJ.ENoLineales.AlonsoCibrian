package ArbolBinario;

/**
 * nodo
 */
public class nodo {
    private Object valor;
    private nodo izquierdo;
    private nodo derecho;
    public Nodo(Object valor){
        this.valor = valor;
        this.izquierdo = null;
        this.derecho = null;
    }
    
    // Getters y Setters
    public Object getValor() {
        return valor;
    }
    public void setValor(Object valor) {
        this.valor = valor;
    }
    public nodo getIzquierdo() {
        return izquierdo;
    }
    public void setIzquierdo(nodo izquierdo) {
        this.izquierdo = izquierdo;
    }
    public nodo getDerecho() {
        return derecho;
    }
    public void setDerecho(nodo derecho) {
        this.derecho = derecho;
    }

}
    
