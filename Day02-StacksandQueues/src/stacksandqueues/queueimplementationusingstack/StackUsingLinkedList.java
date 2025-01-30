package stacksandqueues.queueimplementationusingstack;

class StackUsingLinkedList {
    private StackNode top;

    public StackUsingLinkedList(){
        this.top = null;
    }

    public void push(int x)
    {
        StackNode newNode = new StackNode(x);
        newNode.next = top;
        top = newNode;
    }

    public int pop() {
        if (top == null) {
            System.out.println("Stack underflow");
            return -1;
        }
        int popped = top.data;
        top = top.next;
        return popped;
    }

    public int peek(){
        if (top == null)
        {
            System.out.println("Stack underflow");
            return -1;
        }
        return top.data;
    }

    public boolean isEmpty(){
        return top == null;
    }
}
