package miPrincipal;
import arbolAVL.ArbolAVL;
import arbolAVL.Entero;

import java.util.Scanner;

public class AppArbolAVL{
    public static void menu(){
        Scanner reader = new Scanner(System.in);
        System.out.println("********************************");
        System.out.println("       ARBOLES AVL              ");
        System.out.println("********************************");
        System.out.println("1) Insertar nodo                ");
        System.out.println("2) Buscar nodo                  ");
        System.out.println("3) Eliminar nodo                ");
        System.out.println("4) Mostrar árbol               ");
        System.err.println();
        System.out.println("0) SALIR                       ");
        System.out.print("Selecciona opción:");
        int opc= reader.nextInt();
         switch(opc){
            case 1:
                insertarNodo();
                break;
            case 2:
                buscarNodo();
                break;
            case 3:
                eliminarNodo();
                break;
            case 4:
                mostrarArbol();
                break; 
            case 0:
                System.out.println("SALIR");
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }
    }
    public static void insertarNodo(){
        System.out.println("********************************");
        System.out.println("       INSERTAR NODO             ");
        System.out.println("********************************");
        ArbolAVL abo = new ArbolAVL();
        try{
            abo.insertar(new Entero(2));
            abo.insertar(new Entero(4));
            abo.insertar(new Entero(6));
            arbolAVL.BTreePrinter.printNode(abo.getRaiz());
            abo.insertar(new Entero(10));
            arbolAVL.BTreePrinter.printNode(abo.getRaiz());
            abo.insertar(new Entero(20));
            arbolAVL.BTreePrinter.printNode(abo.getRaiz());
        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
        
        
    }
    public static void buscarNodo(){
        Scanner reader = new Scanner(System.in);
        System.out.println("********************************");
        System.out.println("       BUSCAR NODO               ");
        System.out.println("********************************");
     
    }
    public static void eliminarNodo(){
        System.out.println("********************************");
        System.out.println("       ELIMINAR NODO             ");
        System.out.println("********************************");
        ArbolAVL abo = new ArbolAVL();
        try{
        abo.insertar(new Entero(10));
        abo.insertar(new Entero(15));
        abo.insertar(new Entero(30));
        abo.insertar(new Entero(5));
        abo.insertar(new Entero(2 ));
        abo.insertar(new Entero(1));
        abo.insertar(new Entero(40));
        System.out.println("RECORRIDO DE ARBOLES");
        System.out.println("\n recorrido inorden");
        abo.inorden();
        System.out.println("\n recorrido preorden");
        abo.preorden();
        System.out.println("\n recorrido postorden");
        abo.postorden();
        //imprime el arbol despues de insercion
        System.out.println("\n Impresion de arbol");
        arbolAVL.BTreePrinter.printNode(abo.getRaiz());
        
        System.out.println("Mostrar el arbol despues de la insercion");
        System.out.println("Elimina un Nodo que solamente tiene un hijo");
        System.out.println("Elimina 1 que es una hoja");
        abo.eliminar(new Entero(1));
        System.out.println("RECORRIDO DE ARBOLES");
        System.out.println("\n recorrido inorden");
        abo.inorden();
        System.out.println("\n recorrido preorden");
        abo.preorden();
        System.out.println("\n recorrido postorden");
        abo.postorden();
        //imprime el arbol despues de insercion
        System.out.println("\n Impresion de arbol");
        arbolAVL.BTreePrinter.printNode(abo.getRaiz());
        System.out.println("Elimina un Nodo que solamente tiene un hijo");
        System.out.println("Elimina 5 que solamente tiene un hijo");
        abo.eliminar(new Entero(5));
        System.out.println("RECORRIDO DE ARBOLES");
        System.out.println("\n recorrido inorden");
        abo.inorden();
        System.out.println("\n recorrido preorden");
        abo.preorden();
        System.out.println("\n recorrido postorden");
        abo.postorden();
        //imprime el arbol despues de insercion
        System.out.println("\n Impresion de arbol");
        arbolAVL.BTreePrinter.printNode(abo.getRaiz());
        System.out.println("Elimina un Nodo que solamente tiene un hijo");
        System.out.println("Elimina 30 que solamente tiene un hijo");
        abo.eliminar(new Entero(30));
        System.out.println("RECORRIDO DE ARBOLES");
        System.out.println("\n recorrido inorden");
        abo.inorden();
        System.out.println("\n recorrido preorden");
        abo.preorden();
        System.out.println("\n recorrido postorden");
        abo.postorden();
        //imprime el arbol despues de insercion
        System.out.println("\n Impresion de arbol");
        arbolAVL.BTreePrinter.printNode(abo.getRaiz());
        

        System.out.println();
        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
        
    }
    public static void mostrarArbol(){
        System.out.println("********************************");
        System.out.println("       MOSTRAR ÁRBOL             ");
        System.out.println("********************************");
       
    }
}
