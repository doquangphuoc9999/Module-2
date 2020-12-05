import java.util.Arrays;

public class MyList<E>  {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    private void ensureCapa(){
        int newsize = elements.length*2;
        elements = Arrays.copyOf(elements,newsize);
    }

    public void add(E e){
        if (size == elements.length){
            ensureCapa();
        }
        elements[size++] = e;
    }

    public E get(int i){
        if (i < 0 || i >= size){
            throw new IndexOutOfBoundsException("index: " + i + ", size " + i);
        }

        return (E) elements[i];
    }






}
