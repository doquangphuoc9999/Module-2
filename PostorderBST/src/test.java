public class test {
    public static void main(String[] args) {
        BinarySearchTree<Integer> bTS = new BinarySearchTree<>();

        bTS.insert(45);
        bTS.insert(23);
        bTS.insert(87);
        bTS.insert(3);
        bTS.insert(16);
        bTS.insert(9);

        bTS.treeTraversals();;
    }
}
