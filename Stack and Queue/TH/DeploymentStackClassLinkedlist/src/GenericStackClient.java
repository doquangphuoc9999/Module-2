import java.util.EmptyStackException;

public class GenericStackClient {
    public static void main(String[] args) {
        MyGenericStack<String> myGenericStack = new MyGenericStack<>();
//        myGenericStack.push("henh ");
//        myGenericStack.push("nha");
//        myGenericStack.push("hoa");
//        myGenericStack.push("mot");
//
//        myGenericStack.pop();
//        myGenericStack.print();
//        System.out.println(myGenericStack.size());
        MyGenericStack<Integer> myGenericStack1 = new MyGenericStack<>();
        myGenericStack1.push(5);
        myGenericStack1.push(4);
        myGenericStack1.push(2);
        myGenericStack1.push(1);

//        System.out.println(myGenericStack1.size());

        while (!myGenericStack1.isEmpty()){
            System.out.printf("%5ld",myGenericStack1.pop());
        }
//        myGenericStack1.print();

    }


}
