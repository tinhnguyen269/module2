public class MyLinkedListQueueClient {
    public static void main(String[] args) {
        MylinkedListQueue<Integer> queue = new MylinkedListQueue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        System.out.println("Enqueue item is:" + queue.dequeue());

    }
}
