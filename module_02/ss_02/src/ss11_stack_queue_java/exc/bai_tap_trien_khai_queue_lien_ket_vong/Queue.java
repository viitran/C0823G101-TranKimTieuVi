package ss11_stack_queue_java.exc.bai_tap_trien_khai_queue_lien_ket_vong;

public class Queue {
    private Node front;
    private Node rear;

    public Queue() {
        this.front = null;
        this.rear = null;
    }

    public void enQueue(int data) {
        Node newNode = new Node(data);
        if (this.rear == null) {
            this.front = this.rear = newNode;
            return;
        }

        this.rear.link = newNode;
        this.rear = newNode;
    }

    public void deQueue() {
        if (this.front == null) {
            System.out.println("Queue is empty");
            return;
        }
        Node temp = this.front;
        this.front = temp.link;

        if (this.front == null){
            this.rear = null;
        }
        System.out.println("delete element: " + temp.data);
    }
    public void displayQueue(){
        Node current = this.front;
        if (this.front == null){
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Element in the queue are: ");
        while (current != null){
            System.out.println(current.data + " ");
            current = current.link;
        }
        System.out.println();
    }
}
