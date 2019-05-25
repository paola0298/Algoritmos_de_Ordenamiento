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

        LinkedList<Integer> merge2_t = new LinkedList<>();
        merge2_t.addLast(150);
        merge2_t.addLast(157);
        merge2_t.addLast(259);
        merge2_t.addLast(5);
        merge2_t.addLast(1);
        merge2_t.addLast(98);
        merge2_t.addLast(75);
        merge2_t.addLast(15);
        merge2_t.addLast(19);
        merge2_t.addLast(2);

        LinkedList<Integer> merge2_s = new LinkedList<>();
        merge2_s.addLast(1);
        merge2_s.addLast(2);
        merge2_s.addLast(5);
        merge2_s.addLast(15);
        merge2_s.addLast(19);
        merge2_s.addLast(75);
        merge2_s.addLast(98);
        merge2_s.addLast(150);
        merge2_s.addLast(157);
        merge2_s.addLast(259);


        LinkedList<Integer> merge3_t = new LinkedList<>();
        merge3_t.addLast(63);
        merge3_t.addLast(102);
        merge3_t.addLast(2);
        merge3_t.addLast(485);
        merge3_t.addLast(711);
        merge3_t.addLast(12);
        merge3_t.addLast(55);
        merge3_t.addLast(178);
        merge3_t.addLast(15);
        merge3_t.addLast(27);

        LinkedList<Integer> merge3_s = new LinkedList<>();
        merge3_s.addLast(2);
        merge3_s.addLast(12);
        merge3_s.addLast(15);
        merge3_s.addLast(27);
        merge3_s.addLast(55);
        merge3_s.addLast(63);
        merge3_s.addLast(102);
        merge3_s.addLast(178);
        merge3_s.addLast(485);
        merge3_s.addLast(711);

        LinkedList<Integer> merge4_t = new LinkedList<>();
        merge4_t.addLast(45);
        merge4_t.addLast(54);
        merge4_t.addLast(456);
        merge4_t.addLast(878);
        merge4_t.addLast(4);
        merge4_t.addLast(1);
        merge4_t.addLast(84);
        merge4_t.addLast(87);
        merge4_t.addLast(12);
        merge4_t.addLast(5);

        LinkedList<Integer> merge4_s = new LinkedList<>();
        merge4_s.addLast(1);
        merge4_s.addLast(4);
        merge4_s.addLast(5);
        merge4_s.addLast(12);
        merge4_s.addLast(45);
        merge4_s.addLast(54);
        merge4_s.addLast(84);
        merge4_s.addLast(87);
        merge4_s.addLast(456);
        merge4_s.addLast(878);

        LinkedList<Integer> merge5_t = new LinkedList<>();
        merge5_t.addLast(9);
        merge5_t.addLast(68);
        merge5_t.addLast(5);
        merge5_t.addLast(4);
        merge5_t.addLast(765);
        merge5_t.addLast(345);
        merge5_t.addLast(7);
        merge5_t.addLast(74);
        merge5_t.addLast(67);
        merge5_t.addLast(1);

        LinkedList<Integer> merge5_s = new LinkedList<>();
        merge5_s.addLast(1);
        merge5_s.addLast(4);
        merge5_s.addLast(5);
        merge5_s.addLast(7);
        merge5_s.addLast(9);
        merge5_s.addLast(67);
        merge5_s.addLast(68);
        merge5_s.addLast(74);
        merge5_s.addLast(345);
        merge5_s.addLast(765);

        merge1_t = integerMergeSort.mergeSort(merge1_t);
        merge2_t = integerMergeSort.mergeSort(merge2_t);
        merge3_t = integerMergeSort.mergeSort(merge3_t);
        merge4_t = integerMergeSort.mergeSort(merge4_t);
        merge5_t = integerMergeSort.mergeSort(merge5_t);

        assertEquals("Prueba de MergeSort 1", merge1_s.toString(), merge1_t.toString());
        assertEquals("Prueba de MergeSort 2", merge2_s.toString(), merge2_t.toString());
        assertEquals("Prueba de MergeSort 3", merge3_s.toString(), merge3_t.toString());
        assertEquals("Prueba de MergeSort 4", merge4_s.toString(), merge4_t.toString());
        assertEquals("Prueba de MergeSort 5", merge5_s.toString(), merge5_t.toString());

    }

    @Test
    public void RadixSortTest() {

        RadixSort radixSort = new RadixSort();

        LinkedList<Integer> radix1_t = new LinkedList<>();
        radix1_t.addLast(63);
        radix1_t.addLast(102);
        radix1_t.addLast(2);
        radix1_t.addLast(45);
        radix1_t.addLast(71);
        radix1_t.addLast(12);
        radix1_t.addLast(5);
        radix1_t.addLast(17);
        radix1_t.addLast(15);
        radix1_t.addLast(27);

        LinkedList<Integer> radix1_s = new LinkedList<>();
        radix1_s.addLast(2);
        radix1_s.addLast(5);
        radix1_s.addLast(12);
        radix1_s.addLast(15);
        radix1_s.addLast(17);
        radix1_s.addLast(27);
        radix1_s.addLast(45);
        radix1_s.addLast(63);
        radix1_s.addLast(71);
        radix1_s.addLast(102);

        LinkedList<Integer> radix2_t = new LinkedList<>();
        radix2_t.addLast(150);
        radix2_t.addLast(157);
        radix2_t.addLast(259);
        radix2_t.addLast(5);
        radix2_t.addLast(1);
        radix2_t.addLast(98);
        radix2_t.addLast(75);
        radix2_t.addLast(15);
        radix2_t.addLast(19);
        radix2_t.addLast(2);

        LinkedList<Integer> radix2_s = new LinkedList<>();
        radix2_s.addLast(1);
        radix2_s.addLast(2);
        radix2_s.addLast(5);
        radix2_s.addLast(15);
        radix2_s.addLast(19);
        radix2_s.addLast(75);
        radix2_s.addLast(98);
        radix2_s.addLast(150);
        radix2_s.addLast(157);
        radix2_s.addLast(259);


        LinkedList<Integer> radix3_t = new LinkedList<>();
        radix3_t.addLast(63);
        radix3_t.addLast(102);
        radix3_t.addLast(2);
        radix3_t.addLast(485);
        radix3_t.addLast(711);
        radix3_t.addLast(12);
        radix3_t.addLast(55);
        radix3_t.addLast(178);
        radix3_t.addLast(15);
        radix3_t.addLast(27);

        LinkedList<Integer> radix3_s = new LinkedList<>();
        radix3_s.addLast(2);
        radix3_s.addLast(12);
        radix3_s.addLast(15);
        radix3_s.addLast(27);
        radix3_s.addLast(55);
        radix3_s.addLast(63);
        radix3_s.addLast(102);
        radix3_s.addLast(178);
        radix3_s.addLast(485);
        radix3_s.addLast(711);

        LinkedList<Integer> radix4_t = new LinkedList<>();
        radix4_t.addLast(45);
        radix4_t.addLast(54);
        radix4_t.addLast(456);
        radix4_t.addLast(878);
        radix4_t.addLast(4);
        radix4_t.addLast(1);
        radix4_t.addLast(84);
        radix4_t.addLast(87);
        radix4_t.addLast(12);
        radix4_t.addLast(5);

        LinkedList<Integer> radix4_s = new LinkedList<>();
        radix4_s.addLast(1);
        radix4_s.addLast(4);
        radix4_s.addLast(5);
        radix4_s.addLast(12);
        radix4_s.addLast(45);
        radix4_s.addLast(54);
        radix4_s.addLast(84);
        radix4_s.addLast(87);
        radix4_s.addLast(456);
        radix4_s.addLast(878);

        LinkedList<Integer> radix5_t = new LinkedList<>();
        radix5_t.addLast(9);
        radix5_t.addLast(68);
        radix5_t.addLast(5);
        radix5_t.addLast(4);
        radix5_t.addLast(765);
        radix5_t.addLast(345);
        radix5_t.addLast(7);
        radix5_t.addLast(74);
        radix5_t.addLast(67);
        radix5_t.addLast(1);

        LinkedList<Integer> radix5_s = new LinkedList<>();
        radix5_s.addLast(1);
        radix5_s.addLast(4);
        radix5_s.addLast(5);
        radix5_s.addLast(7);
        radix5_s.addLast(9);
        radix5_s.addLast(67);
        radix5_s.addLast(68);
        radix5_s.addLast(74);
        radix5_s.addLast(345);
        radix5_s.addLast(765);

        radixSort.radixSort(radix1_t);
        radixSort.radixSort(radix2_t);
        radixSort.radixSort(radix3_t);
        radixSort.radixSort(radix4_t);
        radixSort.radixSort(radix5_t);


        assertEquals("Prueba de MergeSort 1", radix1_s.toString(), radix1_t.toString());
        assertEquals("Prueba de MergeSort 2", radix2_s.toString(), radix2_t.toString());
        assertEquals("Prueba de MergeSort 3", radix3_s.toString(), radix3_t.toString());
        assertEquals("Prueba de MergeSort 4", radix4_s.toString(), radix4_t.toString());
        assertEquals("Prueba de MergeSort 5", radix5_s.toString(), radix5_t.toString());

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
