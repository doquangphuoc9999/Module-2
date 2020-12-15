import org.w3c.dom.Node;

public class BinarySearchTree<E extends Comparable<E>>{
    public class TreeNode<T>{
        private T element;
        private TreeNode<T> left;
        private TreeNode<T> right;

        public TreeNode(T data){
            this.element = data;
        }

        @Override
        public String toString() {
            return "TreeNode " +
                    "element = " + element ;
        }
    }
    private TreeNode<E> root = null;
    private int size = 0;


//  thêm một node mới
    public void add(E element){
        TreeNode<E> newNode = new TreeNode<>(element);
        if (root == null){
            root = newNode;
            size++;
        }
        else {
            TreeNode<E> father = null;
            TreeNode<E> child = root;

            while (child != null){
                father = child;
                if (goRight(element,child.element)){
                    child = child.right;
                }
                else {
                    child = child.left;
                }
            }

            if(goRight(element,father.element)){
                father.right = newNode;
            }else {
                father.left = newNode;
            }
            size++;
        }
    }

    public void postorderTraversal(){
        if (!isEmpty()){
            postOder(root);
        }
    }

    public void postOder(TreeNode<E> element){
        if (element.left != null){
            postOder(element.left);
        }
        if (element.right != null){
            postOder(element.right);
        }
        System.out.println(element);
    }


//  trả về trái hoặc phải
    public boolean goRight(E data, E nodeElement){
        return data.compareTo(nodeElement) > 0;
    }


//  ktra trống hay k
    public boolean isEmpty(){
        return root == null;
    }
}
