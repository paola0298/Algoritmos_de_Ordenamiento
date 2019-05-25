import java.util.Random;

/**
 * @author Marlon
 * @version 1.0
 */


public class MergeSort<T extends Comparable<? super T>> {

    public LinkedList<T> mergeSort(LinkedList<T> list) {
        if (list.getSize() == 1) {
            return list;
        }

        LinkedList<T> firstHalf = mergeSort(getRange(list, 0, list.getSize()/2));
        LinkedList<T> secondHalf = mergeSort(getRange(list, list.getSize()/2, list.getSize()));

        return merge(firstHalf, secondHalf);
    }

    private LinkedList<T> merge(LinkedList<T> list1, LinkedList<T> list2) {
        LinkedList<T> mergedList = new LinkedList<>();
        while (list1.getSize() > 0 && list2.getSize() > 0) {
            if (list1.get(0).compareTo(list2.get(0)) > 0) {
                mergedList.addLast(list2.get(0));
                list2.deleteFirst();
            } else {
                mergedList.addLast(list1.get(0));
                list1.deleteFirst();
            }
        }
        while (list1.getSize() > 0) {
            mergedList.addLast(list1.get(0));
            list1.deleteFirst();
        }
        while (list2.getSize() > 0) {
            mergedList.addLast(list2.get(0));
            list2.deleteFirst();
        }
        return mergedList;
    }

    private LinkedList<T> getRange(LinkedList<T> list, int start, int end) {
        LinkedList<T> range = new LinkedList<>();
        for (; start< end; start++) {
            range.addLast(list.get(start));
        }
        return range;
    }

}
