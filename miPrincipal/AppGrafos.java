package miPrincipal;
import grafos.matrizAdyacencia.GrafoMatriz;
import grafos.matrizAdyacencia.Vertice;

import java.util.Scanner;

public class AppGrafos{
    public static void menu(){
        Scanner leer = new Scanner(System.in);
        int opc;
        do{
        System.out.println("********************************");
        System.out.println("       GRAFOS                    ");
        System.out.println("********************************");
        System.out.println("1) Matriz de Adyacencia            ");
        System.out.println("2) Lista de Adyacencia          ");
        System.out.println("0) Salir                         ");
        System.out.print("Selecciona opción:");
        opc = leer.nextInt();
        switch(opc){
            case 1: MatrizAdyacencia(); 
            break;
            case 2: ListaAdyacencia(); 
            break;
            case 0: System.out.println("Adios");
             break;
            default: System.out.println("Opción incorrecta");
        }
    }while(opc != 0);
}
        public static void MatrizAdyacencia(){
            System.out.println("********************************");
            System.out.println("       MATRIZ DE ADYACENCIA      ");
            System.out.println("********************************");
            //crear un grafo
            GrafoMatriz grafo = new GrafoMatriz();
            //crear vertices
            grafo.nuevoVertice("D");
            grafo.nuevoVertice("F");
            grafo.nuevoVertice("K");
            grafo.nuevoVertice("L");
            grafo.nuevoVertice("R");
            //crear arcos
            try {
                grafo.nuevoArco("D","F");
                grafo.nuevoArco("D","K");
                grafo.nuevoArco("F","D");
                grafo.nuevoArco("L","K");
                grafo.nuevoArco("L","F");
                grafo.nuevoArco("R","D");
                
                System.out.println("Adyacente D y F? " + grafo.adyacente("D", "F"));
                System.out.println("Adyacente F y D? " + grafo.adyacente("F", "D"));
                System.out.println("Adyacente R y F? " + grafo.adyacente("R", "F"));
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println(("VERTICES: "));
            System.out.println(grafo.imprimirVertices());
            System.out.println("MATRIZ DE ADYACENCIA: ");
            System.out.println(grafo.imprimirMatriz());


           
        }
        public static void ListaAdyacencia(){
            System.out.println("********************************");
            System.out.println("       LISTA DE ADYACENCIA       ");
            System.out.println("********************************");

        }
}