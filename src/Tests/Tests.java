import org.junit.Test;
import java.util.Random;
import static org.junit.Assert.assertEquals;

public class Tests {

    @Test
    public void InsertionSortTest() {
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

    @Test
    public void QuickSortTest(){
        QuickSort<Integer> quickInteger = new QuickSort<>();
        QuickSort<String> quickString = new QuickSort<>();
        QuickSort<Double> quickDouble = new QuickSort<>();
        LinkedList<Integer> prueba1 = new LinkedList<>();
        prueba1.addLast(7);
        prueba1.addLast(2);
        prueba1.addLast(1);
        prueba1.addLast(6);
        prueba1.addLast(8);
        prueba1.addLast(5);
        prueba1.addLast(3);
        prueba1.addLast(4);

        LinkedList<Integer> prueba1_1 = new LinkedList<>();
        prueba1_1.addLast(1);
        prueba1_1.addLast(2);
        prueba1_1.addLast(3);
        prueba1_1.addLast(4);
        prueba1_1.addLast(5);
        prueba1_1.addLast(6);
        prueba1_1.addLast(7);
        prueba1_1.addLast(8);

        LinkedList<String> prueba2 = new LinkedList<>();
        prueba2.addLast("b");
        prueba2.addLast("z");
        prueba2.addLast("g");
        prueba2.addLast("u");
        prueba2.addLast("a");
        prueba2.addLast("j");
        prueba2.addLast("p");
        prueba2.addLast("m");

        LinkedList<String> prueba2_2 = new LinkedList<>();
        prueba2_2.addLast("a");
        prueba2_2.addLast("b");
        prueba2_2.addLast("g");
        prueba2_2.addLast("j");
        prueba2_2.addLast("m");
        prueba2_2.addLast("p");
        prueba2_2.addLast("u");
        prueba2_2.addLast("z");

        LinkedList<Double> prueba3 = new LinkedList<>();
        prueba3.addLast(1.2);
        prueba3.addLast(2.4);
        prueba3.addLast(1.9);
        prueba3.addLast(6.7);
        prueba3.addLast(80.5);
        prueba3.addLast(55.5);
        prueba3.addLast(32.5);
        prueba3.addLast(455.2);

        LinkedList<Double> prueba3_3 = new LinkedList<>();
        prueba3_3.addLast(1.2);
        prueba3_3.addLast(1.9);
        prueba3_3.addLast(2.4);
        prueba3_3.addLast(6.7);
        prueba3_3.addLast(32.5);
        prueba3_3.addLast(55.5);
        prueba3_3.addLast(80.5);
        prueba3_3.addLast(455.2);


        LinkedList<Integer> prueba4 = new LinkedList<>();
        prueba4.addLast(95);
        prueba4.addLast(83);
        prueba4.addLast(15);
        prueba4.addLast(69);
        prueba4.addLast(451);

        LinkedList<Integer> prueba4_4 = new LinkedList<>();
        prueba4_4.addLast(15);
        prueba4_4.addLast(69);
        prueba4_4.addLast(83);
        prueba4_4.addLast(95);
        prueba4_4.addLast(451);


        LinkedList<String> prueba5 = new LinkedList<>();
        prueba5.addLast("q");
        prueba5.addLast("w");
        prueba5.addLast("e");
        prueba5.addLast("r");
        prueba5.addLast("t");
        prueba5.addLast("y");
        prueba5.addLast("u");
        prueba5.addLast("i");

        LinkedList<String> prueba5_5 = new LinkedList<>();
        prueba5_5.addLast("e");
        prueba5_5.addLast("i");
        prueba5_5.addLast("q");
        prueba5_5.addLast("r");
        prueba5_5.addLast("t");
        prueba5_5.addLast("u");
        prueba5_5.addLast("w");
        prueba5_5.addLast("y");

        quickInteger.quicksort(prueba1);
        quickString.quicksort(prueba2);
        quickDouble.quicksort(prueba3);
        quickInteger.quicksort(prueba4);
        quickString.quicksort(prueba5);


        assertEquals("El resultado debe ser 1,2,3,4,5,6,7,8", prueba1_1.toString(), prueba1.toString());
        assertEquals("El resultado debe ser a,b,g,j,m,p,u,z", prueba2_2.toString(), prueba2.toString());
        assertEquals("El resultado debe ser 1.2,1.9,2.4,6.7,32.5,55.5,80.5,455.2", prueba3_3.toString(), prueba3.toString());
        assertEquals("El resultado debe ser 15,69,83,95,451", prueba4_4.toString(), prueba4.toString());
        assertEquals("El resultado debe ser e,i,q,r,t,u,w,y", prueba5_5.toString(), prueba5.toString());
    }

    @Test
    public void MergeSortTest() {
        MergeSort<Integer> integerMergeSort = new MergeSort<>();

        LinkedList<Integer> merge1_t = new LinkedList<>();
        merge1_t.addLast(63);
        merge1_t.addLast(102);
        merge1_t.addLast(2);
        merge1_t.addLast(45);
        merge1_t.addLast(71);
        merge1_t.addLast(12);
        merge1_t.addLast(5);
        merge1_t.addLast(17);
        merge1_t.addLast(15);
        merge1_t.addLast(27);

        LinkedList<Integer> merge1_s = new LinkedList<>();
        merge1_s.addLast(2);
        merge1_s.addLast(5);
        merge1_s.addLast(12);
        merge1_s.addLast(15);
        merge1_s.addLast(17);
        merge1_s.addLast(27);
        merge1_s.addLast(45);
        merge1_s.addLast(63);
        merge1_s.addLast(71);
        merge1_s.addLast(102);

        merge1_t = integerMergeSort.mergeSort(merge1_t);

        assertEquals("Prueba de MergeSort 1", merge1_s.toString(), merge1_t.toString());

    }

    @Test
    public void RadixSortTest() {

    }

}
