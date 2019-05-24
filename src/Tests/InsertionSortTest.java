import org.junit.Test;
import org.hamcrest.*;
import static org.junit.Assert.*;

public class InsertionSortTest {

    @Test
    public void sort() {
        LinkedList prueba = new LinkedList();
        prueba.addLast(45);
        prueba.addLast(46);
        prueba.addLast(100);
        prueba.addLast(1);
        prueba.addLast(2);
        prueba.addLast(96);
        prueba.addLast(57);
        prueba.addLast(66);
        prueba.addLast(20);
//        LinkedList verdadero = new LinkedList();
//        verdadero.addLast(1);
//        verdadero.addLast(2);
//        verdadero.addLast(20);
//        verdadero.addLast(45);
//        verdadero.addLast(46);
//        verdadero.addLast(57);
//        verdadero.addLast(66);
//        verdadero.addLast(96);
//        verdadero.addLast(100);
        System.out.println("La lista original es:" + "\n");
        prueba.printList();
        System.out.println("La lista ordenada es:" + "\n");
        InsertionSort first = new InsertionSort(prueba);




    }
}
