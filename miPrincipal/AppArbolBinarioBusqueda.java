package miPrincipal;
import arbolBinarioOrdenado.ArbolBinario;
import arbolBinarioOrdenado.Entero;
import java.util.Scanner;
import arbolBinarioOrdenado.BTreePrinter;

public class AppArbolBinarioBusqueda{
    public static void menu(){
        int opc;
        Scanner entrada = new Scanner(System.in);
        do{
            System.out.println("********************************");
            System.out.println("       ARBOLES BINARIOS         ");
            System.out.println("********************************");
            System.out.println("1) Insertar nodo                ");
            System.out.println("2) Buscar nodo                  ");
            System.out.println("3) Eliminar nodo                ");
            System.err.println();
            System.out.println("0) SALIR                       ");
            System.out.print("Selecciona opción:");
            opc = entrada.nextInt();
            switch (opc) {
                case 1:
                   insertarNodos();
                   break;
                    
                case 2:
                   buscarNodos();
                   break;
                case 3:
                   eliminarNodos();
                   break;
                case 0:
                   System.out.println("Hasta luego");
                   break;
    
                default:
                    System.out.println("Opción inválida");
            }
            } while (opc != 0);
       
    }
      
    public static void insertarNodos(){
        System.out.println("**** INSERTAR NODOS ****");
        ArbolBinario arbol = new ArbolBinario();
        try {
            arbol.insertar(new  Entero(10));
            arbol.insertar(new  Entero(20));
            arbol.insertar(new  Entero(5));
            arbol.insertar(new  Entero(30));
            arbol.insertar(new  Entero(40));
            arbol.insertar(new  Entero(4));
            //insertar un nodo repetido
            arbol.insertar(new  Entero(4));

            System.out.println();
            System.out.println("Recorrido inOrden");
            arbol.inorden();
            System.out.println();
            System.out.println("Recorrido preOrden");
            arbol.preorden();
            System.out.println();
            System.out.println("Recorrido postOrden");
            arbol.postorden();
            System.out.println("Impresión del arbol");
            BTreePrinter.printNode(arbol.getRaiz());

        } catch (Exception e) {
            
            e.printStackTrace();
        }
        
        
    }
    public static void eliminarNodos(){
        System.out.println("**** ELIMINAR NODOS ****");
        ArbolBinario arbol = new ArbolBinario();
        try {
            arbol.insertar(new  Entero(10));
            arbol.insertar(new  Entero(20));
            arbol.insertar(new  Entero(5));
            arbol.insertar(new  Entero(30));
            arbol.insertar(new  Entero(40));
            arbol.insertar(new  Entero(4));
            System.out.println();
            System.out.println("Recorrido inOrden");
            arbol.inorden();
            System.out.println();
            System.out.println("Recorrido preOrden");
            arbol.preorden();
            System.out.println();
            System.out.println("Recorrido postOrden");
            arbol.postorden();
            System.out.println("Impresión del arbol");
            BTreePrinter.printNode(arbol.getRaiz());
            System.out.println("Eliminar nodo 40");
            arbol.eliminar(new Entero(40));
            System.out.println("Impresión del arbol despues de eliminación");
            BTreePrinter.printNode(arbol.getRaiz());
            System.out.println("Eliminar nodo 10");
            arbol.eliminar(new Entero(10));
            System.out.println("Impresión del arbol despues de eliminación");
            BTreePrinter.printNode(arbol.getRaiz());
            //eliminar nodo del lado izquierdo
            System.out.println("Eliminar nodo 5");
            arbol.eliminar(new Entero(5));
            System.out.println("Impresión del arbol despues de eliminación");
            BTreePrinter.printNode(arbol.getRaiz());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void buscarNodos(){
        System.out.println("**** BUSCAR NODOS ****");
        ArbolBinario arbol = new ArbolBinario();
        try {
            arbol.insertar(new  Entero(10));
            arbol.insertar(new  Entero(20));
            arbol.insertar(new  Entero(5));
            arbol.insertar(new  Entero(30));
            arbol.insertar(new  Entero(40));
            arbol.insertar(new  Entero(4));
            System.out.println();
            System.out.println("Recorrido inOrden");
            arbol.inorden();
            System.out.println();
            System.out.println("Recorrido preOrden");
            arbol.preorden();
            System.out.println();
            System.out.println("Recorrido postOrden");
            arbol.postorden();
            System.out.println("Impresión del arbol");
            BTreePrinter.printNode(arbol.getRaiz());
            System.err.println("Busco que el dato 20 exista");
            System.out.println(arbol.buscar(new Entero(20)).getValor());
            System.err.println("Busco que el dato 11 exista");
            System.out.println(arbol.buscar(new Entero(11)));
            //marca error la linea de abajo porque es nulo
           // System.out.println(arbol.buscar(new Entero(11)).getValor());
        }
        catch (Exception e) {
            
            e.printStackTrace();
        }
    }
}