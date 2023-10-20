package ss10_dsa_java.practice.thuc_hanh_trien_khai_simpl_list;

import java.util.Arrays;

public class MyList<E> {
    private int size;
    private static final int DEFAULT_CAPACITY = 10;
    private Object element[];

    public MyList() {
        element = new Object[DEFAULT_CAPACITY];
    }



    private void ensureCapacity(int capacity) {
        int newSize = element.length + capacity;
        element = Arrays.copyOf(element, newSize);
    }


    public void add(E e) {
        if (size == element.length) {
            ensureCapacity(3);
        }
        element[size] = e;
        size++;
    }

    public E get(int i) {
        if (i > size || i < 0) {
            throw new IndexOutOfBoundsException("Index " + i + ", size " + i);
        }
        return (E) element[i];
    }

}
