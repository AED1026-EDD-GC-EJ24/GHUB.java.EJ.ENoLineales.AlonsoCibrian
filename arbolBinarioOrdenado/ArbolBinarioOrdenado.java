package arbolBinarioOrdenado;

/**
 * ArbolBinario
 */
public class ArbolBinarioOrdenado{
    private Nodo raiz;
    public ArbolBinarioOrdenado(){
        this.raiz = null;
    }
    public ArbolBinarioOrdenado(Nodo raiz){
        this.raiz = raiz;
    
    }
    public Nodo getRaiz(){
        return this.raiz;
    }
    public void setRaiz(Nodo raiz){
        this.raiz = raiz;
    }
    
    private void visitar(Nodo aux){
        System.out.print(aux.getValor()+" ");
    }
    /*
     * Método recursivo en pre-orden
     */
    private void preorden(Nodo aux){
        if(aux !=null){
            visitar(aux);
            preorden(aux.getIzquierdo());
            preorden(aux.getDerecho());

        }
    }
    public void preorden(){
        preorden(raiz); //se invoca al método recursivo
    }

    //Método recursivo inOrden
    private void inorden(Nodo aux){
        if(aux !=null){
            inorden(aux.getIzquierdo());
            visitar(aux);
            inorden(aux.getDerecho());
        }
    }

    public void inorden(){
        inorden(raiz);
    }

    //Método recursivo postOrden
    private void postorden(Nodo aux){
        if(aux !=null){
            postorden(aux.getIzquierdo());
            postorden(aux.getDerecho());
            visitar(aux);
        }
    }
    public void postorden(){
        postorden(raiz);
    }

    //Recorrido Iterativo en Preorden, utilizando una pila
    public void preordenIterativo(){
        Pila<Nodo> pila = new Pila<Nodo>();
        pila.apilar(raiz);
        while(!pila.esVacia()){
            Nodo aux = pila.cima();
            pila.retirar();
            visitar(aux);
            if(aux.getDerecho() != null){
                pila.apilar(aux.getDerecho());
            }
            if(aux.getIzquierdo() != null){
                pila.apilar(aux.getIzquierdo());
            }
        }
    }
    //Recorrido Iterativo en InOrden, utilizando una pila
    public void inordenIterativo(){
        Pila<Nodo> pila = new Pila<Nodo>();
      pila.apilar(raiz);
      Nodo aux = raiz.getIzquierdo();
        while(!pila.esVacia() || aux != null){
            if(aux != null){
                pila.apilar(aux);
                aux = aux.getIzquierdo();
            }else{
                aux = pila.cima();
                pila.retirar();
                visitar(aux);
                aux = aux.getDerecho();
            }
        } 
    }
    //Recorrido Iterativo en PostOrden, utilizando dos pilas
    public void postordenIterativo(){
        Pila<Nodo> pila1 = new Pila<Nodo>();
        Nodo aux = raiz;
        Nodo q = raiz;
        while(aux.getIzquierdo() != null){
            pila1.apilar(aux);
            aux = aux.getIzquierdo();
        }
        while(aux !=null && (aux.getDerecho() == null || aux.getDerecho() == q)){
            visitar(aux);
            q = aux;
            if(pila1.esVacia()){
                return;
            }
            aux = pila1.cima();
            pila1.retirar();
        }
        pila1.apilar(aux);
        aux = aux.getDerecho();
    }
}