import java.util.EmptyStackException;
import java.util.LinkedList;

public class Generic<T> {
    private LinkedList<T> linkedList = new LinkedList<>();

    public void push(T element){
        linkedList.addLast(element);
    }

    public T pop(){
        if (linkedList.isEmpty()){
            throw new EmptyStackException();
        }
        return linkedList.removeFirst();
    }

    public int size(){
        return linkedList.size();
    }

    public void printf(){
        if (linkedList.isEmpty()){
            throw new EmptyStackException();
        }
        for (int i = 0; i < linkedList.size();i++){
            System.out.println(linkedList.get(i));
        }
    }
}
