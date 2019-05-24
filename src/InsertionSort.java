/**
 * @author Brayan
 * @version 1.0
 */

public class InsertionSort <T extends Comparable<T>>{
    public InsertionSort(LinkedList list) {
        LinkedList<T> l = list;
        sort(l);
    }

    public LinkedList sort(LinkedList<T> list) {
        for (int i = 1; i < list.getSize();i++){
            T key = list.get(i);
            int j = i-1;
            while (j >= 0 && list.Comparar(list.get(j), key)){
                list.set(j+1,list.get(j));
                j = j - 1;
            }
            list.set(j+1, key);
        }
        System.out.println(list);
          return list;
    }

}
