/**
 * @author Hazel
 * @version 1.0
 */


public class SelectionSort<T extends Comparable<? super T>> {

    public void selectionSort(LinkedList<T> list) {
        int size = list.getSize();

        for (int i=0; i< size -1; i++) {
            int min = i;
            for (int j=i+1; j<size; j++) {
                if (list.get(j).compareTo(list.get(min)) < 0) {
                    min = j;
                }
            }
            swap(list, min, i);
        }
    }

    private void swap(LinkedList<T> lista, int min, int i) {
        T temp = lista.get(min);
        lista.set(min, lista.get(i));
        lista.set(i, temp);
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.addLast(14);
        list.addLast(2);
        list.addLast(25);
        list.addLast(3);
        list.addLast(46);

        System.out.println(list);

        SelectionSort<Integer> sort = new SelectionSort<>();

        sort.selectionSort(list);

        System.out.println(list);

    }
}