

/**
 * @author Hazel
 * @version 1.0
 */

public class BubbleSort<T extends Comparable<T>> {

    public void bubbleSort(LinkedList<T> list) {
        int size = list.getSize();

        for (int i=0; i<size-1; i++) {
            for (int j=0; j< size-i-1; j++) {
                if (list.get(j).compareTo(list.get(j+1)) > 0) {
                    T tmp = list.get(j);
                    list.set(j, list.get(j+1));
                    list.set(j+1, tmp);
                }
            }
        }
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.addLast(105);
        list.addLast(23);
        list.addLast(14);
        list.addLast(5);
        list.addLast(13);

        System.out.println(list);

        BubbleSort<Integer> sort = new BubbleSort<>();

        sort.bubbleSort(list);

        System.out.println(list);
    }
}