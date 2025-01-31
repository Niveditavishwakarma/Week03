package stacksandqueues.sortstackusingrecursion;
import stacksandqueues.queueimplementationusingstack.StackUsingLinkedList;

public class SortStackRecursively {
    public void sortStack(StackUsingLinkedList stack) {
        if (!stack.isEmpty()) {
            int temp = stack.pop();

            sortStack(stack);
            insertInSortedOrder(stack, temp);
        }
    }

    private void insertInSortedOrder(StackUsingLinkedList stack, int element) {
        if (stack.isEmpty() || stack.peek() <= element) {
            stack.push(element);
            return;
        }

        int temp = stack.pop();
        insertInSortedOrder(stack, element);

        stack.push(temp);
    }
}
