public class TestMyList {
    public static void main(String[] args) {
        Mylist<Integer> mylist = new Mylist<>();

        mylist.add(0,20);
        mylist.add(1,10);
        mylist.add(2,15);
        mylist.remove(1);
//        mylist.remove(1);
        mylist.printElenment();
        System.out.println();
//        System.out.println(mylist.clone());
//        System.out.println();
//        mylist.contains(20);
//        System.out.println(mylist.contains(21));
//        System.out.println(mylist.indexOf(20));

//        System.out.println(mylist.get(2));
        mylist.clear();
        mylist.printElenment();
    }
}
