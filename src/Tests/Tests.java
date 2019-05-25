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

        LinkedList<Integer> ordenado = new LinkedList<>();
        ordenado.addLast(1);
        ordenado.addLast(2);
        ordenado.addLast(20);
        ordenado.addLast(45);
        ordenado.addLast(46);
        ordenado.addLast(57);
        ordenado.addLast(66);
        ordenado.addLast(96);
        ordenado.addLast(100);


        InsertionSort first = new InsertionSort(ordenado);
        assertEquals("El resultado debe ser "+ordenado.toString(), ordenado.toString(), ordenado.toString());
        //End of First Test//

        //Second Test//
        LinkedList<Integer> prueba2 = new LinkedList<>();
        prueba2.addLast(0);
        prueba2.addLast(8);
        prueba2.addLast(25);
        prueba2.addLast(4);
        prueba2.addLast(100);
        prueba2.addLast(222);
        prueba2.addLast(9);
        LinkedList<Integer> ordenado2 = new LinkedList<>();
        ordenado2.addLast(0);
        ordenado2.addLast(4);
        ordenado2.addLast(8);
        ordenado2.addLast(9);
        ordenado2.addLast(25);
        ordenado2.addLast(100);
        ordenado2.addLast(222);
        InsertionSort second = new InsertionSort(prueba2);
        assertEquals("El resultado debe ser "+ordenado2.toString(), ordenado2.toString(), prueba2.toString());
        //End of Second Test//

        //Third Test//
        LinkedList<String> prueba3 = new LinkedList<>();
        prueba3.addLast("a");
        prueba3.addLast("c");
        prueba3.addLast("b");
        prueba3.addLast("d");
        prueba3.addLast("f");
        prueba3.addLast("e");
        LinkedList<String> ordenado3 = new LinkedList<>();
        ordenado3.addLast("a");
        ordenado3.addLast("b");
        ordenado3.addLast("c");
        ordenado3.addLast("d");
        ordenado3.addLast("e");
        ordenado3.addLast("f");
        InsertionSort third = new InsertionSort(prueba3);
        assertEquals("El resultado debe ser "+prueba3.toString(), ordenado3.toString(), prueba3.toString());
        //End of Third Test//

        //Fourth Test//
        LinkedList<Double> prueba4 = new LinkedList<>();
        prueba4.addLast(0.123456789012344567823456123456);
        prueba4.addLast(0.1);
        prueba4.addLast(123456.0);
        prueba4.addLast(0.099999999999999999999999999999999999999999);
        prueba4.addLast(0.15);
        prueba4.addLast(0.123456754521683546851435468765121685468754321685468);
        LinkedList<Double> ordenado4 = new LinkedList<>();
        ordenado4.addLast(0.099999999999999999999999999999999999999999);
        ordenado4.addLast(0.1);
        ordenado4.addLast(0.123456754521683546851435468765121685468754321685468);
        ordenado4.addLast(0.123456789012344567823456123456);
        ordenado4.addLast(0.15);
        ordenado4.addLast(123456.0);
        InsertionSort fourth = new InsertionSort(prueba4);
        assertEquals("El resultado debe ser "+prueba4.toString(), ordenado4.toString(), prueba4.toString());
        //End of Fourth Test//

        //Fifth Test//
        LinkedList<Float> prueba5 = new LinkedList<>();
        prueba5.addLast(0.0f);
        prueba5.addLast(6873541354.1f);
        prueba5.addLast(0.9f);
        prueba5.addLast(3.14f);
        prueba5.addLast(15.0f);
        LinkedList<Float> ordenado5 = new LinkedList<>();
        ordenado5.addLast(0.0f);
        ordenado5.addLast(0.9f);
        ordenado5.addLast(3.14f);
        ordenado5.addLast(15.0f);
        ordenado5.addLast(6873541354.1f);
        InsertionSort fifth = new InsertionSort(prueba5);
        assertEquals("El resultado debe ser "+prueba5.toString(), ordenado5.toString(), prueba5.toString());
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
        assertEquals("El resultado debe ser 1.2,1.9,2.4,6.7,32.5,55.5,80.5,455.2",prueba3_3.toString(), prueba3.toString());
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

    @Test
    public void SelectionSortTest(){
        LinkedList<Integer> list = new LinkedList<>();
        LinkedList<String> list1 = new LinkedList<>();
        LinkedList<Double> list2 = new LinkedList<>();
        SelectionSort<Integer> selectionInteger = new SelectionSort<>(list);
        SelectionSort<String> selectionString = new SelectionSort<>(list1);
        SelectionSort<Double> selectionDouble = new SelectionSort<>(list2);

        LinkedList<Integer> pruebaList1 = new LinkedList<>();
        pruebaList1.addLast(7);
        pruebaList1.addLast(2);
        pruebaList1.addLast(1);
        pruebaList1.addLast(6);
        pruebaList1.addLast(8);
        pruebaList1.addLast(5);
        pruebaList1.addLast(3);
        pruebaList1.addLast(4);

        LinkedList<Integer> pruebaList1_2 = new LinkedList<>();
        pruebaList1_2.addLast(1);
        pruebaList1_2.addLast(2);
        pruebaList1_2.addLast(3);
        pruebaList1_2.addLast(4);
        pruebaList1_2.addLast(5);
        pruebaList1_2.addLast(6);
        pruebaList1_2.addLast(7);
        pruebaList1_2.addLast(8);

        LinkedList<Double> pruebaLista3_1 = new LinkedList<>();
        pruebaLista3_1.addLast(1.2);
        pruebaLista3_1.addLast(2.4);
        pruebaLista3_1.addLast(1.9);
        pruebaLista3_1.addLast(6.7);
        pruebaLista3_1.addLast(80.5);
        pruebaLista3_1.addLast(55.5);
        pruebaLista3_1.addLast(32.5);
        pruebaLista3_1.addLast(455.2);

        LinkedList<Double> pruebaLista3_3 = new LinkedList<>();
        pruebaLista3_3.addLast(1.2);
        pruebaLista3_3.addLast(1.9);
        pruebaLista3_3.addLast(2.4);
        pruebaLista3_3.addLast(6.7);
        pruebaLista3_3.addLast(32.5);
        pruebaLista3_3.addLast(55.5);
        pruebaLista3_3.addLast(80.5);
        pruebaLista3_3.addLast(455.2);


        LinkedList<Integer> pruebaList4 = new LinkedList<>();
        pruebaList4.addLast(95);
        pruebaList4.addLast(83);
        pruebaList4.addLast(15);
        pruebaList4.addLast(69);
        pruebaList4.addLast(451);

        LinkedList<Integer> prueba4_4 = new LinkedList<>();
        prueba4_4.addLast(15);
        prueba4_4.addLast(69);
        prueba4_4.addLast(83);
        prueba4_4.addLast(95);
        prueba4_4.addLast(451);

        System.out.println(selectionInteger.SortSelection(pruebaList1));
        System.out.println(selectionDouble.SortSelection(pruebaLista3_1));
        System.out.println(selectionInteger.SortSelection(pruebaList4));


        assertEquals("El resultado debe ser 1,2,3,4,5,6,7,8", pruebaList1.toString(), pruebaList1.toString());
        assertEquals("El resultado debe ser 1.2,1.9,2.4,6.7,32.5,55.5,80.5,455.2", pruebaLista3_1.toString(), pruebaLista3_1.toString());
        assertEquals("El resultado debe ser 15,69,83,95,451", pruebaList4.toString(), pruebaList4.toString());
    }

    @Test
    public void BubbleSortTest(){
        LinkedList<Integer> list = new LinkedList<>();
        LinkedList<String> list1 = new LinkedList<>();
        LinkedList<Double> list2 = new LinkedList<>();
        BubbleSort<Integer> bubbleInteger = new BubbleSort<>(list);
        BubbleSort<String> bubbleString = new BubbleSort<>(list1);
        BubbleSort<Double> bubbleDouble = new BubbleSort<>(list2);

        LinkedList<Integer> pruebaList1 = new LinkedList<>();
        pruebaList1.addLast(7);
        pruebaList1.addLast(2);
        pruebaList1.addLast(1);
        pruebaList1.addLast(6);
        pruebaList1.addLast(8);
        pruebaList1.addLast(5);
        pruebaList1.addLast(3);
        pruebaList1.addLast(4);

        LinkedList<Integer> pruebaList1_2 = new LinkedList<>();
        pruebaList1_2.addLast(1);
        pruebaList1_2.addLast(2);
        pruebaList1_2.addLast(3);
        pruebaList1_2.addLast(4);
        pruebaList1_2.addLast(5);
        pruebaList1_2.addLast(6);
        pruebaList1_2.addLast(7);
        pruebaList1_2.addLast(8);

        LinkedList<String> pruebaList2 = new LinkedList<>();
        pruebaList2.addLast("b");
        pruebaList2.addLast("z");
        pruebaList2.addLast("g");
        pruebaList2.addLast("u");
        pruebaList2.addLast("a");
        pruebaList2.addLast("j");
        pruebaList2.addLast("p");
        pruebaList2.addLast("m");

        LinkedList<String> pruebaLista3 = new LinkedList<>();
        pruebaLista3.addLast("a");
        pruebaLista3.addLast("b");
        pruebaLista3.addLast("g");
        pruebaLista3.addLast("j");
        pruebaLista3.addLast("m");
        pruebaLista3.addLast("p");
        pruebaLista3.addLast("u");
        pruebaLista3.addLast("z");

        LinkedList<Double> pruebaLista3_1 = new LinkedList<>();
        pruebaLista3_1.addLast(32.5);
        pruebaLista3_1.addLast(1.2);
        pruebaLista3_1.addLast(455.2);
        pruebaLista3_1.addLast(2.4);
        pruebaLista3_1.addLast(6.7);
        pruebaLista3_1.addLast(80.5);
        pruebaLista3_1.addLast(1.9);
        pruebaLista3_1.addLast(55.5);

        LinkedList<Double> pruebaLista3_3 = new LinkedList<>();
        pruebaLista3_3.addLast(1.2);
        pruebaLista3_3.addLast(1.9);
        pruebaLista3_3.addLast(2.4);
        pruebaLista3_3.addLast(6.7);
        pruebaLista3_3.addLast(32.5);
        pruebaLista3_3.addLast(55.5);
        pruebaLista3_3.addLast(80.5);
        pruebaLista3_3.addLast(455.2);


        LinkedList<Integer> pruebaList4 = new LinkedList<>();
        pruebaList4.addLast(95);
        pruebaList4.addLast(83);
        pruebaList4.addLast(15);
        pruebaList4.addLast(69);
        pruebaList4.addLast(451);

        LinkedList<Integer> prueba4_4 = new LinkedList<>();
        prueba4_4.addLast(15);
        prueba4_4.addLast(69);
        prueba4_4.addLast(83);
        prueba4_4.addLast(95);
        prueba4_4.addLast(451);


        LinkedList<String> pruebaList5 = new LinkedList<>();
        pruebaList5.addLast("q");
        pruebaList5.addLast("w");
        pruebaList5.addLast("e");
        pruebaList5.addLast("r");
        pruebaList5.addLast("t");
        pruebaList5.addLast("y");
        pruebaList5.addLast("u");
        pruebaList5.addLast("i");

        LinkedList<String> pruebaList5_5 = new LinkedList<>();
        pruebaList5_5.addLast("e");
        pruebaList5_5.addLast("i");
        pruebaList5_5.addLast("q");
        pruebaList5_5.addLast("r");
        pruebaList5_5.addLast("t");
        pruebaList5_5.addLast("u");
        pruebaList5_5.addLast("w");
        pruebaList5_5.addLast("y");

        System.out.println(bubbleInteger.Sort(pruebaList1));
        System.out.println(bubbleString.Sort(pruebaList2));
        System.out.println(bubbleDouble.Sort(pruebaLista3_1));
        System.out.println(bubbleInteger.Sort(pruebaList4));
        System.out.println(bubbleString.Sort(pruebaList5));


        assertEquals("El resultado debe ser 1,2,3,4,5,6,7,8", pruebaList1_2.toString(), pruebaList1.toString());
        assertEquals("El resultado debe ser a,b,g,j,m,p,u,z", pruebaLista3.toString(), pruebaList2.toString());
        assertEquals("El resultado debe ser 1.2,1.92.4,6.7,32.5,55.5,80.5,455.2", pruebaLista3_3.toString(), pruebaLista3_1.toString());
        assertEquals("El resultado debe ser 15,69,83,95,451", prueba4_4.toString(), pruebaList4.toString());
        assertEquals("El resultado debe ser e,i,q,r,t,u,w,y", pruebaList5_5.toString(), pruebaList5.toString());
    }
}
