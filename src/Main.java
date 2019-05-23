
public class Main {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.addFirst(11);
        list.addLast(8);
        list.addLast(32);
        list.addLast(4);
        list.addLast(1);
//        list.set(1,15);
        //list.set(2,10);
//        list = list.BubbleSort(list);
        list = list.SelectionSort(list);
        list.printList();
    }
}
