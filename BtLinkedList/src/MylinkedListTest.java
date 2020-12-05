public class MylinkedListTest {
    public static void main(String[] args) {
       MylinkedList ll = new MylinkedList(10);

       ll.add(1,11);
       ll.add(2,13);
       ll.add(3,14);
       ll.add(4,17);

//     add first
//       ll.addFirst(15);

//       add last
//       ll.addLast(19);

//       show list arr
//      ll.printList();

//      remove
        ll.remove(1);
        ll.printList();
    }
}
