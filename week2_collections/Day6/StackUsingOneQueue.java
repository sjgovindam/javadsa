package week2_collections.Day6;


import java.util.*;

class MyStack {

    Queue<Integer> queue = new LinkedList<>();

    public void push(int x) {

        queue.offer(x);

        int size = queue.size();

        for (int i = 0; i < size - 1; i++) {
            queue.offer(queue.poll());
        }
    }

    public int pop() {
        return queue.poll();
    }

    public int top() {
        return queue.peek();
    }

    public boolean empty() {
        return queue.isEmpty();
    }
}

public class StackUsingOneQueue {

    public static void main(String[] args) {

        MyStack stack = new MyStack();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack.top());   // 30
        System.out.println(stack.pop());   // 30
        System.out.println(stack.pop());   // 20
        System.out.println(stack.top());   // 10
        System.out.println(stack.empty()); // false
    }
}

