public class Test {
    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();

        binarySearchTree.add(10);
        binarySearchTree.add(12);
        binarySearchTree.add(8);
        binarySearchTree.add(7);
        binarySearchTree.add(9);

        binarySearchTree.postorderTraversal();
    }
}
