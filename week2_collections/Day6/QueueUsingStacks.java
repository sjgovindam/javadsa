
import java.util.*;

class MyQueue {

    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    // Insert element
    public void enqueue(int x) {
        stack1.push(x);
    }

    // Remove front element
    public int dequeue() {

        if (stack1.isEmpty() && stack2.isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }

        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        return stack2.pop();
    }

    // Get front element
    public int peek() {

        if (stack1.isEmpty() && stack2.isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }

        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        return stack2.peek();
    }

    public boolean empty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }
}

public class QueueUsingStacks {

    public static void main(String[] args) {

        MyQueue queue = new MyQueue();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println(queue.peek());    // 10
        System.out.println(queue.dequeue()); // 10
        System.out.println(queue.dequeue()); // 20

        queue.enqueue(40);

        System.out.println(queue.dequeue()); // 30
        System.out.println(queue.dequeue()); // 40

        System.out.println(queue.empty());   // true
    }
}
