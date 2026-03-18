public class LinkedListCycle {

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
    }

    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return true; // cycle detected
        }
        return false;
    }

    public static void main(String[] args) {
        LinkedListCycle obj = new LinkedListCycle();

        // List with cycle: 3 -> 2 -> 0 -> -4 -> (back to 2)
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);
        head.next.next.next.next = head.next; // cycle

        System.out.println(obj.hasCycle(head)); // true

        // List without cycle
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);
        System.out.println(obj.hasCycle(head2)); // false
    }
}
