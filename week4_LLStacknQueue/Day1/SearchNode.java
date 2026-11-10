package week4_LLStacknQueue.Day1;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class SearchNode {

    public static boolean searchNode(ListNode head, int target) {

        ListNode current = head;

        while (current != null) {

            if (current.val == target) {
                return true;
            }

            current = current.next;
        }

        return false;
    }

    public static void main(String[] args) {

        ListNode head = new ListNode(10);
        head.next = new ListNode(20);
        head.next.next = new ListNode(30);
        head.next.next.next = new ListNode(40);
        head.next.next.next.next = new ListNode(50);

        int target = 30;

        if (searchNode(head, target)) {
            System.out.println(target + " found in Linked List");
        } else {
            System.out.println(target + " not found in Linked List");
        }
    }
}