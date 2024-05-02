package ArbolBinario;

/**
 * ArbolBinario
 */
public class ArbolBinario {
    //raiz del arbol
    private nodo raiz;
    //constructor
    public ArbolBinario(){
        raiz = null;
    }
    public ArbolBinario(Nodo raiz){
        this.raiz = raiz;
    }
    public void setRaiz(nodo raiz){
        this.raiz = raiz;
    }
    private void PreOrden(nodo aux){
        if(aux != null){
           visitar(aux);
           PreOrden(aux.getIzquierdo());
              PreOrden(aux.getDerecho());
        }
    }
    private void InOrden(nodo aux){
        if(aux != null){
           InOrden(aux.getIzquierdo());
           visitar(aux);
           InOrden(aux.getDerecho());
        }
    }      
    private void PostOrden(nodo aux){
        if(aux != null){
           PostOrden(aux.getIzquierdo());
           PostOrden(aux.getDerecho());
           visitar(aux);
        }
    } 
     private void visitar(nodo aux){
        System.out.print(aux.getValor() + " ");
}