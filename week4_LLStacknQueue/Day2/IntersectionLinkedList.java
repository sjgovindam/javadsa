package week4_LLStacknQueue.Day2;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class IntersectionLinkedList {

    public static ListNode getIntersectionNode(
            ListNode headA, ListNode headB) {

        ListNode pA = headA;
        ListNode pB = headB;

        while (pA != pB) {

            pA = (pA == null) ? headB : pA.next;
            pB = (pB == null) ? headA : pB.next;
        }

        return pA;
    }

    public static void main(String[] args) {

        // Common part: 30 -> 40 -> 50
        ListNode common = new ListNode(30);
        common.next = new ListNode(40);
        common.next.next = new ListNode(50);

        // List A: 10 -> 20 -> 30 -> 40 -> 50
        ListNode headA = new ListNode(10);
        headA.next = new ListNode(20);
        headA.next.next = common;

        // List B: 15 -> 25 -> 30 -> 40 -> 50
        ListNode headB = new ListNode(15);
        headB.next = new ListNode(25);
        headB.next.next = common;

        ListNode intersection = getIntersectionNode(headA, headB);

        if (intersection != null) {
            System.out.println("Intersection at node: " + intersection.val);
        } else {
            System.out.println("No intersection");
        }
    }
}
