package week4_LLStacknQueue.Day4;

import java.util.*;

public class MedianFinder {

    // Max Heap: Smaller half
    PriorityQueue<Integer> maxHeap =
            new PriorityQueue<>(Collections.reverseOrder());

    // Min Heap: Larger half
    PriorityQueue<Integer> minHeap =
            new PriorityQueue<>();

    public void addNum(int num) {

        // Step 1: Add number to appropriate heap
        if (maxHeap.isEmpty() || num <= maxHeap.peek()) {
            maxHeap.offer(num);
        } else {
            minHeap.offer(num);
        }

        // Step 2: Balance the heaps
        if (maxHeap.size() > minHeap.size() + 1) {

            minHeap.offer(maxHeap.poll());

        } else if (minHeap.size() > maxHeap.size()) {

            maxHeap.offer(minHeap.poll());
        }
    }

    public double findMedian() {

        // Odd number of elements
        if (maxHeap.size() > minHeap.size()) {
            return maxHeap.peek();
        }

        // Even number of elements
        return (maxHeap.peek() + minHeap.peek()) / 2.0;
    }

    public static void main(String[] args) {

        MedianFinder mf = new MedianFinder();

        mf.addNum(5);
        mf.addNum(15);
        System.out.println(mf.findMedian()); // 10.0

        mf.addNum(1);
        System.out.println(mf.findMedian()); // 5.0

        mf.addNum(3);
        System.out.println(mf.findMedian()); // 4.0

        mf.addNum(8);
        System.out.println(mf.findMedian()); // 5.0

        mf.addNum(7);
        System.out.println(mf.findMedian()); // 6.0
    }
}
