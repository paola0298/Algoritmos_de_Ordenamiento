
import org.junit.Test;
import org.hamcrest.*;

import java.util.Random;

import static org.junit.Assert.*;

public class InsertionSortTest<T extends Comparable<T>> {

    @Test
    public void sort() {
        //First Test//
        LinkedList<Integer> prueba = new LinkedList<>();
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
        System.out.println(prueba);
        System.out.println("La lista ordenada es:" + "\n");
        InsertionSort first = new InsertionSort(prueba);
        //End of First Test//

        //Second Test//
        LinkedList<Integer> prueba2 = new LinkedList<>();
        for (int i = 1; i<= 30;i++){
            int random = new Random().nextInt();
            prueba2.addLast(random);
        }
        System.out.println("La lista original es:" + "\n");
        System.out.println(prueba2);
        System.out.println("La lista ordenada es:" + "\n");
        InsertionSort second = new InsertionSort(prueba2);
        //End of Second Test//

        //Third Test//
        LinkedList<String> prueba3 = new LinkedList<>();
        prueba3.addLast("a");
        prueba3.addLast("c");
        prueba3.addLast("b");
        prueba3.addLast("d");
        prueba3.addLast("f");
        prueba3.addLast("e");
        System.out.println("La lista original es:" + "\n");
        System.out.println(prueba3);
        System.out.println("La lista ordenada es:" + "\n");
        InsertionSort third = new InsertionSort(prueba3);
        //End of Third Test//

        //Fourth Test//

        LinkedList<Double> prueba4 = new LinkedList<>();
        for(int i = 0; i <= 10; i++){
            Double value = new Random().nextDouble();
            prueba4.addLast(value);
        }
        System.out.println("La lista original es:" + "\n");
        System.out.println(prueba4);
        System.out.println("La lista ordenada es:" + "\n");
        InsertionSort fourth = new InsertionSort(prueba4);
        //End of Fourth Test//

        //Fifth Test//
        LinkedList<Float> prueba5 = new LinkedList<>();
        for(int i = 0; i <= 10; i++){
            Float value = new Random().nextFloat();
            prueba5.addLast(value);
        }
        System.out.println("La lista original es:" + "\n");
        System.out.println(prueba5);
        System.out.println("La lista ordenada es:" + "\n");
        InsertionSort fifth = new InsertionSort(prueba5);

        //End of Fifth Test//
    }
}
