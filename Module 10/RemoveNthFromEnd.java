public class RemoveNthFromEnd {

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode fast = dummy, slow = dummy;

        // Move fast pointer n+1 steps ahead
        for (int i = 0; i <= n; i++) fast = fast.next;

        // Move both until fast reaches end
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        // Skip the target node
        slow.next = slow.next.next;
        return dummy.next;
    }

    static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + (head.next != null ? " -> " : ""));
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        RemoveNthFromEnd obj = new RemoveNthFromEnd();

        // [1,2,3,4,5], n=2 => [1,2,3,5]
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        printList(obj.removeNthFromEnd(head, 2)); // 1 -> 2 -> 3 -> 5
    }
}
