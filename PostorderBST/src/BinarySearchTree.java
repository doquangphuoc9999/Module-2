import org.w3c.dom.Node;

public class BinarySearchTree<E extends Comparable<E>> {
    private Node root;
    private int size;

    public class Node<T>{
        private T elenments;
        private Node<T> left;
        private Node<T> right;

        public Node(T elenments) {
            this.elenments = elenments;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "elenments=" + elenments +
                    '}';
        }
    }
//  chèn kiểu generic
    public void insert(E e){
        Node<E> newNode = new Node<>(e);
        if (root == null){
            root = newNode;
            size++;
        }
       else {
          Node<E> father = null;
          Node<E> child = root;
          while (child!=null){
              father = child;
              if (compare(e,child.elenments)){
                  child = child.right;
              }
              else {
                  child = child.left;
              }
          }
          if (compare(e,father.elenments)){
              father.right = newNode;
          }
          else {
              father.left = newNode;
          }
       size++;
        }
    }


//  duyet

    public void treeTraversals(){
       postOder(root);
    }

    public void postOder(Node<E> node){
        if(node.left !=null){
            postOder(node.left);
        }
        if (node.right != null){
            postOder(node.right);
        }
        System.out.println(node);
    }

//  so sánh nút cha
    public boolean compare(E e, E element){
        return e.compareTo(element) > 0;
    }




}
