import java.util.ArrayList;
import java.util.Arrays;

public class MyList<E> {
    int size = 0;
    static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];

    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    public void add(int index, E element) {
        if (index > size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        if (size == elements.length) {
            ensureCapacity(size + 1); // Ensure capacity for at least one more element
        }
        System.arraycopy(elements, index, elements, index + 1, size - index);
        elements[index] = element;
        size++;
    }
    public void add(E e) {
        if (size == elements.length) {
            ensureCapacity(size + 1);
        }
        elements[size++] = e;
    }

    public void ensureCapacity(int minCapacity) {
        if (minCapacity > elements.length) {
            int newSize = Math.max(minCapacity, (elements.length) * 2);
            elements = Arrays.copyOf(elements, newSize);
        }
    }

    public String toString() {
        if (size == 0) {
            return "[]";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            for (int i = 0; i < size; i++) {
                sb.append(elements[i]);
                if (i < size - 1) {
                    sb.append(", ");
                }
            }
            sb.append(']');
            return sb.toString();
        }
    }

    public int size(){
        return size;
    }
    public int length(){
        return elements.length;
    }
    public boolean isEmpty(){
        if(size == 0){
            return true;
        }
        return false;
    }
    public E remove(int index){
        if (index > size || index < 0) {
            System.out.println("vi tri can xoa khong co trong mang");
        }
        else if(isEmpty()){
            System.out.println("mang rong thi lam sao ma xoa duoc!");
        } else {
            elements[index] = null;
        }
        return null;
    }

}
