import org.w3c.dom.Node;

public class MylinkedList<E> {
    private Node head;
    private int numNodes = 0;
//    private int size = 0;

    public MylinkedList() {
    }
//    size
    public int size(){
        return numNodes;
    }

    public class Node{
        private Node next;
        private Object data;

        public Node(Object data){
            this.data = data;
        }

        public Object getData(){
            return this.data;
        }
    }

    public MylinkedList(Object data){
        head = new Node(data);

    }

    public void add(int index, E elenment){
        Node temp = head;
        for (int i =0; i < index - 1 && temp.next != null; i++){
            temp = temp.next;
        }
        Node holder = temp.next;
        Node newNode =  new Node(elenment);
        newNode.next = holder;
        temp.next = newNode;
        numNodes++;
    }

    public void printList() {
        Node temp = head;
        while(temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public void addFirst(E e){
        Node newNode = new Node(e);
        newNode.next=head;
        head = newNode;
        numNodes++;
    }

    public void addLast(E e){
        Node temp = head;
        Node newNode = new Node(e);
        for (int i = 0; i < numNodes;i++){
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public E remove(int index){
        Node temp = head;
        for (int i = 0; i < index-1; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        numNodes--;
        return (E) temp.getData();
    }

    public boolean remove(Object e){
        if (remove(e)){
            return true;
        }
        return false;
    }




}
