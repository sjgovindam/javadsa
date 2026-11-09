package week2_collections.Day6;


import java.util.*;

class MinStack {

    Stack<Integer> stack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();

    // Push element
    public void push(int val) {

        stack.push(val);

        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
    }

    // Remove top element
    public void pop() {

        if (stack.isEmpty()) {
            throw new EmptyStackException();
        }

        int removed = stack.pop();

        if (removed == minStack.peek()) {
            minStack.pop();
        }
    }

    // Get top element
    public int top() {
        return stack.peek();
    }

    // Get minimum element
    public int getMin() {
        return minStack.peek();
    }
}

public class MinStackExample {

    public static void main(String[] args) {

        MinStack stack = new MinStack();

        stack.push(5);
        stack.push(3);
        stack.push(7);
        stack.push(2);

        System.out.println("Minimum: " + stack.getMin()); // 2

        stack.pop();

        System.out.println("Top: " + stack.top());       // 7
        System.out.println("Minimum: " + stack.getMin()); // 3

        stack.pop();

        System.out.println("Minimum: " + stack.getMin()); // 3

        stack.pop();

        System.out.println("Minimum: " + stack.getMin()); // 5
    }
}
