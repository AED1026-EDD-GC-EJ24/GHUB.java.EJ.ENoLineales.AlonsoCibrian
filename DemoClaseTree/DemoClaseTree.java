package DemoClaseTree;
import java.util.TreeSet;
import java.util.Iterator;


/**
 * DemoClaseTree
 */
public class DemoClaseTree {

    public static void main(String[] args) {
        System.out.println("*******************************");
        System.out.println("           ARBOLES             ");
        System.out.println("*******************************");
        TreeSet<Integer> t = new TreeSet<Integer>();
        //insertar elementos en el arbol
        t.add(5);
        t.add(3);
        t.add(9);
        t.add(2);
        t.add(2);
        //mostrar
        System.out.println(t.contains(5));
        System.out.println(t.contains(12));
        System.out.println(); 
        
        for (Iterator<Integer> it = t.iterator(); it.hasNext();) {

            System.out.println(it.next());
        }
        System.out.println();
        //elimino elementos del treeset
        t.remove(3);
        for (Iterator<Integer> it = t.iterator(); it.hasNext();) {

            System.out.println(it.next());
        }
    }
}