public class MylistTest {
    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList<Integer>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(2);
        listInteger.add(4);

//        System.out.println("elment 4: " + listInteger.get(4));
        System.out.println("Element 4: " + listInteger.get(1));
        System.out.println("Element 4: " + listInteger.get(0));
        System.out.println("Element 4: " + listInteger.get(3));

        listInteger.get(-1);
        System.out.println("Element 6: " + listInteger.get(-1));
    }
}
