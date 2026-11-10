package week4_LLStacknQueue.Day3;

public class CustomQueue {

    private int[] arr;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public CustomQueue(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    // Insert element
    public void enqueue(int value) {

        if (size == capacity) {
            System.out.println("Queue is Full");
            return;
        }

        rear++;
        arr[rear] = value;
        size++;
    }

    // Remove element
    public int dequeue() {

        if (size == 0) {
            System.out.println("Queue is Empty");
            return -1;
        }

        int value = arr[front];
        front++;
        size--;

        return value;
    }

    // Get front element
    public int peek() {
        if (size == 0) {
            return -1;
        }

        return arr[front];
    }

    public void display() {

        for (int i = front; i <= rear; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        CustomQueue queue = new CustomQueue(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.print("Queue: ");
        queue.display();

        System.out.println("Front: " + queue.peek());

        System.out.println("Removed: " + queue.dequeue());

        System.out.print("After Dequeue: ");
        queue.display();
    }
}
