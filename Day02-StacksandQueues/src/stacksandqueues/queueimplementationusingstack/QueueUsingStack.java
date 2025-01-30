package stacksandqueues.queueimplementationusingstack;


class QueueUsingStack {
     StackUsingLinkedList stack1;
     StackUsingLinkedList stack2;

    public QueueUsingStack() {
        this.stack1 = new StackUsingLinkedList();
        this.stack2 = new StackUsingLinkedList();
    }

    public void enqueue(int x)
    {
        stack1.push(x);
    }

    public int deque()
    {
        if(stack2.isEmpty())
        {
            while(!stack1.isEmpty())
            {
                stack2.push(stack1.pop());
            }
        }
        if(stack2.isEmpty())
        {
            throw new RuntimeException("Queue is empty!");
        }
        return stack2.pop();
    }

    public boolean isEmpty()
    {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    public int peek()
    {
        if(stack2.isEmpty())
        {
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        if(stack2.isEmpty())
        {
            throw new RuntimeException("Queue is empty");
        }
        return stack2.peek();
    }
}
