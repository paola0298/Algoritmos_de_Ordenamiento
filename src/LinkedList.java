
public class  LinkedList <T extends Comparable<T>>{

    private int size;
    private Node<T> head;

    public Node<T> getHead() {
        return head;
    }

    public LinkedList(){
        this.size = 0;
        this.head = null;
    }

    public void addLast(T value){
        Node<T> newElement = new Node<>(value);

        if (this.head==null){
            this.head = newElement;
        } else {
            Node<T> temp = this.head;
            while(temp.getNext()!=null)
                temp = temp.getNext();
            temp.setNext(newElement);
        }
        this.size++;
    }

    public void addFirst(T value){
        Node<T> newElement = new Node<>(value);
        newElement.setNext(this.head);
        this.head = newElement;
        this.size++;
    }

    public boolean deleteLast(){
        if (this.head!=null){
            Node<T> temp = this.head;
            while(temp.getNext().getNext()!=null){
                temp = temp.getNext();
            }
            temp.setNext(null);
            this.size--;
            return true;
        }
        return false;
    }

    public boolean deleteFirst(){
        if (this.head != null){
            this.head = this.head.getNext();
            this.size--;
            return true;
        }
        return false;
    }

    public boolean deleteElement(T element){
        if (element == this.head.getValue()){
            deleteFirst();
        } else {
            Node<T> temp = this.head.getNext();
            Node<T> prev = this.head;

            while(temp!= null){
                if (temp.getValue() == element){
                    prev.setNext(temp.getNext());
                    this.size--;
                    return true;
                } else
                    prev = temp;
                temp = temp.getNext();
            }
        }
        return false;
    }

    public void printList(){
        Node<T> temp = this.head;
        if (temp == null){
            System.out.println("Error, lista nula");//Brayan: Se añade para determinar si la lista está vacía
        }else {
            while (temp != null) {
                System.out.print(temp.getValue()+",");
                temp = temp.getNext();
            }
            System.out.println("");
        }
    }

    public T get(int index){
        Node<T> tmp = this.head;
        for(int i=0; i<index  && tmp.getNext()!= null; i++){
            tmp = tmp.getNext();
        }
        return tmp.getValue();
    }


    public Node<T> acces_index(int index) {
        Node<T> tmp = this.head;
        for (int i = 0; i < index ; i++) {
            tmp = tmp.getNext();
        }
//        System.out.println(tmp);
        return tmp;
    }

    public int getSize() {
        return size;
    }

    public void set(int index,T value){ //recibe el indice en que se va a insertar el nuevo nodo, y el valor que tendra el nodo.
        Node<T> temp = this.head;
        Node<T> newNode = new Node<T>(value); //Se crea el nuevo nodo
        for(int i = 0; i < index ;i++){  //se recorre la lista hasta llegar al indice menos 1
            temp = temp.getNext();          //Se apunta al nuevo nodo
        }
        temp.setValue(value);//se sustituye
        //Node<T> nextTo = temp.getNext();    //Se asigna al nodo siguiente del nuevo
//        newNode.setNext(nextTo);            //se apunta al siguiente del temporal anterior
//        temp.setNext(newNode);              //Se posiciona el nuevo nodo

    }

    public boolean Comparar(T valor1, T valor2){
        return  valor1.compareTo(valor2) == 1;
    }

    public LinkedList BubbleSort(LinkedList lista) { //Se recibe la linkedList
        int n = lista.getSize(); //n es el tamanio de la lista
        for (int i = 0; i < n-1; i++) { // se recorre un elemento
            for (int j = 0; j < n-i-1; j++) {//se compara con otro  elemento
                if(lista.Comparar(lista.get(j),lista.get(j+1))){//Se compara si el primero es mayor al segundo
                    T temp = (T) lista.get(j); // Se asigna un temporal para guardar el contenido del primer elemento
//                    lista.acces_index(j).setValue(lista.get(j+1));//se cambian los nodos entre otros
//                    lista.acces_index(j+1).setValue(temp.getValue());
                    lista.set(j, lista.get(j+1));
                    lista.set(j+1, temp);
                }
            }
        }
        return lista; //se retorna la nueva lista
    }
    public LinkedList SelectionSort(LinkedList lista){
        int arrayLength = lista.getSize();

        for (int unsortIndex = arrayLength - 1; unsortIndex > 0; unsortIndex--) {
            int largest = 0;
            for (int i = 1; i <= unsortIndex; i++) {
                if(lista.Comparar(lista.get(i), lista.get(largest))){
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
