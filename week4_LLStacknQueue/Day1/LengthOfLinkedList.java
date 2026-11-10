package week4_LLStacknQueue.Day1;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class LengthOfLinkedList {

    public static int findLength(ListNode head) {

        int count = 0;
        ListNode current = head;

        while (current != null) {
            count++;
            current = current.next;
        }

        return count;
    }

    public static void main(String[] args) {

        ListNode head = new ListNode(10);
        head.next = new ListNode(20);
        head.next.next = new ListNode(30);
        head.next.next.next = new ListNode(40);
        head.next.next.next.next = new ListNode(50);

        int length = findLength(head);

        System.out.println("Length: " + length);
    }
}
