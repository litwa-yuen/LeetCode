/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode root = new ListNode(0);
        root.next = head;
        ListNode slow = root;
        ListNode fast = root;

        while (fast != null && n >= 0) {
            fast = fast.next;
            n--;
        }

        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        if (slow != null && slow.next != null) {
            slow.next = slow.next.next;
        }
        return root.next;

    }
}
