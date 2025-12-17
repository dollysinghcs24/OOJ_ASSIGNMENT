/*
 Question:
 Given the head of a linked list,
 determine if the linked list has a cycle.
 Return true if there is a cycle, otherwise false.

 Example:
 1 -> 2 -> 3 -> 4
      ^         |
      |_________|
 Output: true
*/

class LinkedListCycle {

    // Definition of ListNode
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    // Function to detect cycle
    public static boolean hasCycle(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        // Move slow by 1 step and fast by 2 steps
        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            // If they meet, cycle exists
            if (slow == fast) {
                return true;
            }
        }

        return false; // No cycle
    }

    // Main method
    public static void main(String[] args) {

        // Create linked list: 1 -> 2 -> 3 -> 4
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        // Create a cycle (4 -> 2)
        head.next.next.next.next = head.next;

        boolean result = hasCycle(head);

        System.out.println("Linked List has cycle: " + result);
    }
}
