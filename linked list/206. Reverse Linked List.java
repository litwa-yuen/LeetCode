class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode reverse = new ListNode(-1);
        while (head != null) {
            ListNode curr = head;
            head = head.next;
            curr.next = reverse.next;
            reverse.next = curr;
        
        }
        return reverse.next;
    }
}
