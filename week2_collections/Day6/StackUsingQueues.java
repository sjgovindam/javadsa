package week2_collections.Day6;


import java.util.*;

class MyStack {

    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    // Push operation
    public void push(int x) {

        q2.offer(x);

        while (!q1.isEmpty()) {
            q2.offer(q1.poll());
        }

        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    // Pop operation
    public int pop() {
        return q1.poll();
    }

    // Top operation
    public int top() {
        return q1.peek();
    }

    // Check empty
    public boolean empty() {
        return q1.isEmpty();
    }
}

public class StackUsingQueues {

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

