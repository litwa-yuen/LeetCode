class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
      ListNode head = new ListNode(0);
        ListNode result = head;
        while (list1 != null || list2 != null) {
            if (list2 == null) {
                result.next = list1;
                break;
            }
            
            if (list1 == null) {
                result.next = list2;
                break;
            }
            
            if (list1.val <= list2.val) {
                result.next = list1;
                list1 = list1.next;
            }
            else {
                result.next = list2;
                list2 = list2.next;
            }
            result = result.next;
            result.next = null;
            
        }
        return head.next;
    }
}
