package ss10_dsa_java.exc.bai_tap_trien_khai_arraylist;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object element[] = new Object[DEFAULT_CAPACITY];

    public MyList() {
    }

    public MyList(int capacity) {
        element = new Object[capacity];
    }

    private void ensureCapacity(int capacity) {
        if (capacity >= 0) {
            int newSize = element.length + capacity;
            element = Arrays.copyOf(element, newSize);
        } else {
            throw new IndexOutOfBoundsException("Capacity" + capacity);
        }
    }

    public void add(int index, E e) {
        if (index > element.length) {
            throw new IllegalArgumentException("index: " + index);
        } else if (element.length == size) {
            ensureCapacity(3);
        }
        for (int i = size - 1; i >= index; i--) {
            element[i] = element[i - 1];
        }
        element[index] = e;
        size++;
    }

    public boolean add(E o) {
        if (element.length == size) {
            ensureCapacity(3);
        }
        element[size] = o;
        size++;
        return true;

    }

    public E get(int index) {
        checkIndex(index);
        return (E) element[index];
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("index " + index + " out of bound");
        }
    }

    public E remove(int index) {
        checkIndex(index);

        E removedElement = (E) element[index];

        for (int i = index; i < size - 1; i++) {
            element[i] = element[i + 1];
        }
        element[size - 1] = null;
        size--;

        return removedElement;
    }

    public int size() {
        return size;
    }

    public void printList() {
        for (int i = 0; i < size; i++) {
            if (element[i] != null) {
                System.out.println(element[i].toString());
            }
        }
    }

    public boolean contains(E o) {
        for (int i = 0; i < size; i++) {
            if (o.equals(element[i])) {
                return true;
            }
        }
        return false;
    }

    public void clear() {
        for (int i = 0; i < element.length; i++) {
            element[i] = null;
        }
        size = 0;
    }

    public int indexOf(E o) {
        for (int i = 0; i < size; i++) {
            if (o.equals(element[i])) {
                return i;
            }
        }
        return -1;
    }

    public MyList<E> clone() {
        MyList<E> listClone = new MyList<>();
        listClone.element = Arrays.copyOf(element, size);
        listClone.size = size;
        return listClone;
    }
}
