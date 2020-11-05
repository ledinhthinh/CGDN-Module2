package _10_stack_and_queue.thuc_hanh;

public class MyLinkedListQueue {
    private Node head;
    private Node tail;

    public MyLinkedListQueue() {
        this.head = null;
        this.tail = null;
    }
    public void dequeue(int key){
        Node temp = new Node(key);
        if (this.tail == null){
            this.tail=this.head=null;
            return;
        }
        this.tail.next = temp;

    }
}
