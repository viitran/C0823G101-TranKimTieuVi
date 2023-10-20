package ss10_dsa_java.exc.bai_tap_trien_khai_linkedlist;

import java.util.Arrays;

public class MyLinkedList<E> {
    private Node head;
    private Node tail;

    private int numNodes;

    public MyLinkedList() {
    }

    public int size() {
        return this.numNodes;
    }

    public E get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return (E) temp.data;
    }

    public E remove(int index) {
        Node previous = head;
        for (int i = 0; i < index; i++) {
            previous = previous.next;
        }
        Node current = previous.next;
        previous.next = current.next;
        numNodes--;
        return (E) current.data;
    }

//    public void ensureCapacity(int minCapacity){
//        if (minCapacity >= 0) {
//            int newSize =
//        } else {
//            throw new IndexOutOfBoundsException("Capacity" + minCapacity);
//        }
//    }

    public void addLast(E element) {
        Node temp = new Node(element);
        if (tail == null) {
            head = tail = temp;
        } else {
            tail.next = temp;
            tail = tail.next;
        }
        numNodes++;
    }

    public void addFirst(E element) {
        Node newNode = new Node(element);
        newNode.next = head;
        head = newNode;
        numNodes++;
        if (tail == null) {
            tail = head;
        }
    }

    public void add(int index, E element) {
        if (index == 0) {
            addFirst(element);
        } else if (index >= numNodes) {
            addLast(element);
        } else {
            Node current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
                Node temp = current.next;
                current.next = new Node(element);
                current.next.next = temp;
                numNodes++;
            }
        }
    }

    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }
}
