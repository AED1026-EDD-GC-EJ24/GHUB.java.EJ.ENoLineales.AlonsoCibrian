package arbolBinarioOrdenado;
import pilas. *;
/**
 * ArbolBinario
 */
public class ArbolBinario{
    private Nodo raiz;
    public ArbolBinario(){
        this.raiz = null;
    }
    public ArbolBinario(Nodo raiz){
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
    //insertar un nodo en el árbol version iterativa
    public void insertar(Object valor) throws Exception{
       Comparable dato = (Comparable) valor;
         Nodo nuevo = new Nodo(valor);
        nuevo.setValor(dato);
        if(raiz == null){
            raiz = nuevo;
        }else{
            //anterior es una referencia al nodo padre de aux
            Nodo anterior = null;
            //aux es un auxiliar que va recorriendo los nodos desde la raíz
            Nodo aux = raiz;
            while(aux != null){
                anterior = aux;
                if(dato.EsMenor(aux.getValor()))
                    aux = aux.getIzquierdo();
                else if (dato.EsMayor(aux.getValor()))
                    aux = aux.getDerecho();
                else
                    throw new Exception("Dato duplicado");
            }
            if(dato.EsMenor(anterior.getValor()))
                anterior.setIzquierdo(nuevo);
            else
                anterior.setDerecho(nuevo);

        }
       
    }
    //insertar un nodo en el árbol version recursiva
    public void intertar2(Object valor) throws Exception{
        Comparable dato = (Comparable)valor;
        raiz = insertarRec(raiz, dato);
    }

    private Nodo insertarRec(Nodo raizsub, Comparable dato) throws Exception{
        if (raizsub == null){
            raizsub = new Nodo(dato);
        }else {
            if (dato.EsMenor(raizsub.getValor())){
               Nodo iz = insertarRec(raizsub.getIzquierdo(), dato);
                raizsub.setIzquierdo(iz);
            }
            else{
                if(dato.EsMayor(raizsub.getValor())){
                    Nodo der = insertarRec(raizsub.getDerecho(), dato);
                    raizsub.setDerecho(der);
                }else{
                    throw new Exception("Dato duplicado");
                }
            }
        }  
        return raizsub;
    }
    //buscar un nodo en el árbol version iterativa
    public Nodo buscar(Object valor){
       Comparable dato = (Comparable) valor;
       if (raiz == null)
           return null;
         else{
            Nodo aux = raiz;
            while(aux != null)
                if(dato.EsIgual(aux.getValor()))
                    return aux;
                if(dato.EsMenor(aux.getValor()))
                    aux = aux.getIzquierdo();
                else
                    aux = aux.getDerecho();
                
            }
            return null;
         }
    }
