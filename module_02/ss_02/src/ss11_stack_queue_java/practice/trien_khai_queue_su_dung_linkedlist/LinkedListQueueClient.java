package ss11_stack_queue_java.practice.trien_khai_queue_su_dung_linkedlist;

public class LinkedListQueueClient {
    public static void main(String[] args) {
        MyLinkedListQueue queue = new MyLinkedListQueue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(34);
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(30);
//        queue.dequeue();
        queue.enqueue(40);
//        queue.dequeue();
        queue.enqueue(50);
        System.out.println("Dequeued item is " + queue.dequeue().key);
    }
}
