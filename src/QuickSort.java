/**
 * @author Paola
 * @version 1.0
 */


public class QuickSort<T extends Comparable<T>> {

    public void quicksort(LinkedList<T> listToOrder){
        quicksort(listToOrder, 0, listToOrder.getSize()-1);
    }

    private void quicksort(LinkedList<T> listToOrder, int start, int end){
        if (start<end) {
            int pivote = partition(listToOrder, start, end);
            quicksort(listToOrder, start, pivote - 1);
            quicksort(listToOrder, pivote + 1, end);
        }
    }

    private int partition(LinkedList<T> listToOrder, int start, int end) {
        T pivote = listToOrder.get(end);
        int pIndex = start;

        for (int i=start; i<end; i++){
            if (listToOrder.get(i).compareTo(pivote) <= 0){
                T temp = listToOrder.get(i);
                listToOrder.set(i, listToOrder.get(pIndex));
                listToOrder.set(pIndex, temp);
                pIndex++;
            }
        }

        T temp = listToOrder.get(pIndex);
        listToOrder.set(pIndex, listToOrder.get(end));
        listToOrder.set(end, temp);
        return pIndex;
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.addLast(7);
        list.addLast(2);
        list.addLast(1);
        list.addLast(6);
        list.addLast(8);
        list.addLast(5);
        list.addLast(3);
        list.addLast(4);
        System.out.println(list);
        System.out.println("\n");
        QuickSort<Integer> quick = new QuickSort<>();
        quick.quicksort(list);

        System.out.println(list);

    }


}
