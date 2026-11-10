package week4_LLStacknQueue.Day2;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class RemoveNthNodefrombeg {

    public static ListNode removeNthNode(ListNode head, int n) {

        if (head == null || n <= 0) {
            return head;
        }

        // If first node needs to be removed
        if (n == 1) {
            return head.next;
        }

        ListNode current = head;

        // Move to the (n-1)th node
        for (int i = 1; i < n - 1 && current != null; i++) {
            current = current.next;
        }

        // Check whether nth node exists
        if (current != null && current.next != null) {
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

        head = removeNthNode(head, 3);

        System.out.println("After Removing 3rd Node:");
        printList(head);
    }
}