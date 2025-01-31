package stacksandqueues.sortstackusingrecursion;

import stacksandqueues.queueimplementationusingstack.StackUsingLinkedList;

public class Main {
    public static void main(String[] args) {
        SortStackRecursively sort = new SortStackRecursively();
        StackUsingLinkedList stack = new StackUsingLinkedList();
        stack.push(5);
        stack.push(1);
        stack.push(3);
        stack.push(8);
        stack.push(2);
        System.out.println("original stack: " + stack);
        sort.sortStack(stack);
        System.out.println("sorted stack :" + stack);

    }
}
