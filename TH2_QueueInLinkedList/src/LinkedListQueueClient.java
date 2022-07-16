public class LinkedListQueueClient {
    public static void main(String[] args) {
        MyLinkedListQueue queue = new MyLinkedListQueue();
        queue.enqueue(12);
        queue.enqueue(22);
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(28);
        queue.enqueue(10);
        queue.enqueue(60);
    }
}
