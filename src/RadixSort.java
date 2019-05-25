/**
 * @author Marlon
 * @version 1.0
 */


public class RadixSort{

    public void radixSort(LinkedList<Integer> list) {
        int max = getMax(list, list.getSize());

        for (int exp=1; max/exp>0; exp*=10) {
            countSort(list, list.getSize(), exp);
        }
    }

    private void countSort(LinkedList<Integer> list, int size, int exp) {
        int[] output = new int[size];
        int i;
        int[] count = new int[10];

        for (i=0; i<size; i++) {
            count[(list.get(i)/exp)%10]++;
        }
        for (i=1; i<10; i++) {
            count[i] += count[i-1];
        }
        for (i=size-1; i >=0; i--) {
            output[count[(list.get(i)/exp)%10] -1] = list.get(i);
            count[(list.get(i)/exp)%10]--;
        }
        for (i=0; i<size; i++) {
            list.set(i, output[i]);
        }
    }

    private int getMax(LinkedList<Integer> list, int size) {
        int max = 0;
        for (int i=0; i<size; i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        RadixSort sort = new RadixSort();

        LinkedList<Integer> list = new LinkedList<>();
        list.addLast(25);
        list.addLast(27);
        list.addLast(2);
        list.addLast(103);
        list.addLast(17);
        list.addLast(63);
        list.addLast(1);
        list.addLast(43);
        list.addLast(5);

        System.out.println(list);
        sort.radixSort(list);
        System.out.println(list);


    }

}
