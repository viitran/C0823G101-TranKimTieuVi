package ss11_stack_queue_java.exc.bai_tap_trien_khai_queue_lien_ket_vong;

public class Solution {
    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        queue.enQueue(4);
        queue.enQueue(5);
        queue.displayQueue();
        queue.deQueue();
        queue.displayQueue();
    }
}
