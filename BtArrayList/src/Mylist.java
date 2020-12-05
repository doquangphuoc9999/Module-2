import java.util.ArrayList;
import java.util.Arrays;

public class Mylist<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public Mylist() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public Mylist(int capacity){
      elements = new Object[capacity];
    }

    public void ensureCapacity(){
        int newSize = elements.length*2;
        elements = Arrays.copyOf(elements,newSize);
    }

    public void add(int index, E elenment){
        if (size >= elements.length){
            ensureCapacity();
        }
        for (int i = index; i < size;i++){
            elements[i+1] = elements[i];
        }
        elements[index] = elenment;
        size++;
    }

    public void printElenment(){
        System.out.println(Arrays.toString(elements));
    }

    public E remove(int index){
        for (int i = index; i < size;i++){
            elements[i] = elements[i+1];
        }
        elements[size-1] = null;
        size--;
        return (E) elements[index];
    }

    public int size(){
        return size;
    }

    public E clone(){
        ArrayList<E> newArray = new ArrayList<E>();
        for (int i = 0; i < size;i++){
            newArray.add(i, (E) elements[i]);

        }
        return (E) newArray;
    }

    public boolean contains(E o){
        for (int i = 0; i < size; i++){
           if (o.equals(elements[i])){
               return true;
           }
        }
        return false;
    }

    public int indexOf(E o){
        for (int i = 0; i < size;i++){
            if (o.equals(elements[i])){
                return i;
            }
        }
        return -1;
    }

    public boolean add(E o){
        if (add(o)){
            return true;
        }
        return false;
    }
    public void checkIndex(int index){
        if (index < 0 || index > size){
            throw new IndexOutOfBoundsException("No no no no");
        }
    }
    public E get(int index){
        checkIndex(index);
        return (E) elements[index];
    }

    public void clear(){
        for (int i = 0; i <= size ; i++){
            remove(i);
        }
    }



    
}
