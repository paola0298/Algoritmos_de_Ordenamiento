package TareaExtraclase;
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


}
