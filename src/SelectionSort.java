/**
 * @author Hazel
 * @version 1.0
 */


public class SelectionSort<T extends Comparable<T>> {
    public SelectionSort(LinkedList<T> list){
        LinkedList<T> lista = list;
        SortSelection(lista);
    }
    public LinkedList SortSelection(LinkedList<T> lista){
        int arrayLength = lista.getSize();

        for (int unsortIndex = arrayLength - 1; unsortIndex > 0; unsortIndex--) {
            int largest = 0;
            for (int i = 1; i <= unsortIndex; i++) {
                if (lista.Comparar(lista.get(i), lista.get(largest))) {
                    largest = i;
                }
            }
            lista = swap(lista, largest, unsortIndex);
        }
        return lista;

    }

        public LinkedList swap(LinkedList lista, int x, int y) {
            T temp = (T) lista.get(x);
            lista.set(x, lista.get(y));
//        collection[x] = collection[y];
            lista.set(y, temp);
//        collection[y] = temp;
            return lista;
        }
}
