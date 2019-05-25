

/**
 * @author Hazel
 * @version 1.0
 */

public class BubbleSort<T extends Comparable<T>> {

    public BubbleSort(LinkedList<T> list) { //Se recibe la linkedList
        LinkedList<T> lista = list;
        Sort(lista);
    }

    public LinkedList Sort(LinkedList<T> lista) {
        int n = lista.getSize(); //n es el tamanio de la lista
        for (int i = 0; i < n - 1; i++) { // se recorre un elemento
            for (int j = 0; j < n - i - 1; j++) {//se compara con otro  elemento

                if (lista.Comparar(lista.get(j), lista.get(j + 1))) {//Se compara si el primero es mayor al segundo
                    T temp = (T) lista.get(j); // Se asigna un temporal para guardar el contenido del primer elemento
//                    lista.acces_index(j).setValue(lista.get(j+1));//se cambian los nodos entre otros
//                    lista.acces_index(j+1).setValue(temp.getValue());
                    lista.set(j, lista.get(j + 1));
                    lista.set(j + 1, temp);
                }
            }
        }
        return lista; //se retorna la nueva lista
    }
//    public static void main(String[] args) {
//        LinkedList<Integer> list = new LinkedList<>();
//        list.addLast(7);
//        list.addLast(2);
//        list.addLast(1);
//        list.addLast(6);
//        list.addLast(8);
//        list.addLast(5);
//        list.addLast(3);
//        list.addLast(4);
//        System.out.println(list);
//        System.out.println("\n");
//        BubbleSort<Integer> bubble = new BubbleSort<>(list);
//        bubble.Sort(list);
//
//        System.out.println(list);
//    }
}