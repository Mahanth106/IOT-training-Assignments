public class MiddleOfLinkedList {

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
    }

    public ListNode middleNode(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; // slow is now at middle
    }

    static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + (head.next != null ? " -> " : ""));
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MiddleOfLinkedList obj = new MiddleOfLinkedList();

        // Odd length: 1 -> 2 -> 3 -> 4 -> 5, middle = 3
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(3);
        head1.next.next.next = new ListNode(4);
        head1.next.next.next.next = new ListNode(5);
        printList(obj.middleNode(head1)); // 3 -> 4 -> 5

        // Even length: 1 -> 2 -> 3 -> 4 -> 5 -> 6, middle = 4
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);
        head2.next.next = new ListNode(3);
        head2.next.next.next = new ListNode(4);
        head2.next.next.next.next = new ListNode(5);
        head2.next.next.next.next.next = new ListNode(6);
        printList(obj.middleNode(head2)); // 4 -> 5 -> 6
    }
}
