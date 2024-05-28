import java.util.Arrays;

public class MyList implements comperable<MyList> {
    private int size = 0;
    static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }
    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    public void ensureCapacity(int minCapacity) {
        if (minCapacity > elements.length) {
            int newCapacity = elements.length*2;
            if (newCapacity < minCapacity) {
                newCapacity = minCapacity;
            }
            elements = Arrays.copyOf(elements, newCapacity);
        }
    }
    public void add(int index, E element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        ensureCapacity(size+1);
        for (int i = size ; i > index ; i--) {
            elements[i] = elements[i-1];
        }
        elements[index] = element;
    }

    public E remove(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }

        E old = (E) elements[index];
         for(int i =index ; i< size ;i++){
             elements[i]=elements[i+1];
         }
         elements[size-1]=null;
         return old;
    }




 }









