package week4_LLStacknQueue.Day3;

import java.util.*;

public class QueueImplementation {

    public static void main(String[] args) {

        Queue<Integer> queue = new ArrayDeque<>();

        // Enqueue
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);

        System.out.println("Queue: " + queue);

        // Peek
        System.out.println("Front: " + queue.peek());

        // Dequeue
        System.out.println("Removed: " + queue.poll());

        System.out.println("After Dequeue: " + queue);

        // Enqueue
        queue.offer(50);

        System.out.println("After Enqueue: " + queue);

        // Size
        System.out.println("Size: " + queue.size());

        // Check empty
        System.out.println("Is Empty: " + queue.isEmpty());
    }
}
