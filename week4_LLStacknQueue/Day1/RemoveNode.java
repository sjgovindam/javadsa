package week4_LLStacknQueue.Day1;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class RemoveNode {

    public static ListNode removeNode(ListNode head, int target) {

        // Case 1: Remove head
        if (head == null) {
            return null;
        }

        if (head.val == target) {
            return head.next;
        }

        ListNode current = head;

        // Find the node before target
        while (current.next != null &&
               current.next.val != target) {

            current = current.next;
        }

        // Remove target node if found
        if (current.next != null) {
            current.next = current.next.next;
        }

        return head;
    }

    public static void printList(ListNode head) {

        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        ListNode head = new ListNode(10);
        head.next = new ListNode(20);
        head.next.next = new ListNode(30);
        head.next.next.next = new ListNode(40);
        head.next.next.next.next = new ListNode(50);

        System.out.println("Original List:");
        printList(head);

        int target = 30;

        head = removeNode(head, target);

        System.out.println("After Removing " + target + ":");
        printList(head);
    }
}

/*
2. Understand the important logic
current.next = current.next.next;


Suppose the linked list is:
10 -> 20 -> 30 -> 40 -> 50


We want to remove 30.

Before:
20 -> 30 -> 40


After:
20 ------> 40


We simply change the next reference of node 20 to node 40.


*/