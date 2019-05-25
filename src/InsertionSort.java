/**
 * @author Brayan
 * @version 1.0
 */

public class InsertionSort <T extends Comparable<T>>{
    public InsertionSort(LinkedList list) {
        LinkedList<T> l = list;
        sort(l);
    }

    private LinkedList sort(LinkedList<T> list) {
        for (int i = 1; i < list.getSize(); i++){
            int current = i;
            T key = list.get(current);
            int j = current-1;
            while (current > 0 && list.get(current-1).compareTo(key) > 0){
                T temp = list.get(current);
                list.set(current, list.get(current-1));
                list.set(current-1, temp);
                current--;
            }

        }
        //System.out.println(list);
          return list;
    }
}
