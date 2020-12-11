import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.Stack;

public class MyGenericStack<T> {
    public LinkedList<T> stack = new LinkedList<>();

//  chèn phẩn tử vào.
    public void push(T element){
        stack.addLast(element);
    }

//  xóa phần tử

    public T pop(){
        if (stack.isEmpty()){
            throw new EmptyStackException();
        }
        return stack.removeLast();
    }

//  xác định size

    public int size(){
        return stack.size();
    }

//  Kiểm tra hàm có trống hay k

    public boolean isEmpty(){
        if (stack.size() == 0){
            return true;
        }
        return false;
    }

//   in hàm ra

    public void print(){
        for (int i = 0; i < stack.size();i++){
            System.out.println(stack.get(i));
        }
    }


}
