package stacksandqueues.queueimplementationusingstack;

public class Main {
    public static void main(String[] args)
    {
        QueueUsingStack queue = new QueueUsingStack();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);

        System.out.println("element at top: " + queue.peek());
        System.out.println("deleted element: " + queue.deque());
        System.out.println("element at top: " + queue.peek());
        System.out.println("deleted element: " + queue.deque());
        System.out.println("deleted element: " + queue.deque());
        System.out.println("element at top: " + queue.peek());
        System.out.println("Is empty: " + queue.isEmpty());

    }
}
