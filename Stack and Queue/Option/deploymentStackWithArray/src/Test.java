public class Test {
    public static void main(String[] args) {
        MyStack myStack = new MyStack(5);

        myStack.push(3);
        myStack.push(4);
        myStack.push(5);

        myStack.pop();
        myStack.print();
    }
}
