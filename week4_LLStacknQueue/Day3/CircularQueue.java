package week4_LLStacknQueue.Day3;

public class CircularQueue {

    private int[] arr;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public CircularQueue(int k) {
        capacity = k;
        arr = new int[k];

        front = 0;
        rear = -1;
        size = 0;
    }

    // Insert element
    public boolean enQueue(int value) {

        if (isFull()) {
            return false;
        }

        rear = (rear + 1) % capacity;
        arr[rear] = value;
        size++;

        return true;
    }

    // Remove element
    public boolean deQueue() {

        if (isEmpty()) {
            return false;
        }

        front = (front + 1) % capacity;
        size--;

        return true;
    }

    // Get front element
    public int Front() {

        if (isEmpty()) {
            return -1;
        }

        return arr[front];
    }

    // Get rear element
    public int Rear() {

        if (isEmpty()) {
            return -1;
        }

        return arr[rear];
    }

    // Check empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Check full
    public boolean isFull() {
        return size == capacity;
    }

    public static void main(String[] args) {

        CircularQueue queue = new CircularQueue(5);

        System.out.println(queue.enQueue(10));
        System.out.println(queue.enQueue(20));
        System.out.println(queue.enQueue(30));
        System.out.println(queue.enQueue(40));
        System.out.println(queue.enQueue(50));

        System.out.println("Front: " + queue.Front());
        System.out.println("Rear: " + queue.Rear());

        // Remove two elements
        queue.deQueue();
        queue.deQueue();

        // Insert into reused positions
        queue.enQueue(60);
        queue.enQueue(70);

        System.out.println("Front: " + queue.Front());
        System.out.println("Rear: " + queue.Rear());

        System.out.println("Is Full: " + queue.isFull());
        System.out.println("Is Empty: " + queue.isEmpty());
    }
}

/*

The most important formula is:
\[
nextIndex = (index + 1) \bmod capacity
\]

For example, if capacity = 5:
\[
(4+1)\bmod 5 = 0
\]

So index 4 wraps around to index 0.
3. Java implementation (with main)
We'll implement these operations:
- enQueue() – Insert element.
- deQueue() – Remove element.
- Front() – Return first element.
- Rear() – Return last element.
- isEmpty() – Check empty.
- isFull() – Check full.

4. Understand the most important logic
Enqueue:
rear = (rear + 1) % capacity;
arr[rear] = value;
size++;


Suppose:
- rear = 4
- capacity = 5
Then:
rear = (4 + 1) % 5;
// rear = 0


The rear pointer moves back to index 0.

Dequeue:
front = (front + 1) % capacity;
size--;


This moves the front pointer to the next element, wrapping around when necessary.

5. Dry run
Capacity = 5.

Initially:
front = 0
rear  = -1
size  = 0


Operation	Array (index 0 to 4)	Front	Rear	Size
Enqueue 10	[10, _, _, _, _]	0	0	1
Enqueue 20	[10, 20, _, _, _]	0	1	2
Enqueue 30	[10, 20, 30, _, _]	0	2	3
Enqueue 40	[10, 20, 30, 40, _]	0	3	4
Enqueue 50	[10, 20, 30, 40, 50]	0	4	5
Dequeue	[10, 20, 30, 40, 50]	1	4	4
Dequeue	[10, 20, 30, 40, 50]	2	4	3
Enqueue 60	[60, 20, 30, 40, 50]	2	0	4
Enqueue 70	[60, 70, 30, 40, 50]	2	1	5

Notice the last two insertions:
- 60 goes into index 0.
- 70 goes into index 1.
This is how Circular Queue reuses empty positions.


*/
