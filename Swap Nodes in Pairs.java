/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null){
            return null;
        }
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        ListNode cur = head;
        ListNode pre = dummy;
        
        
        while(cur.next != null && cur.next.next != null){
            pre.next = cur.next;
            cur.next = cur.next.next;
            pre = pre.next;
            pre.next = cur;
            pre = pre.next;
            cur = cur.next;
        }
        
        while(cur.next != null){
            pre.next = cur.next;
            cur.next = null;
            pre = pre.next;
            pre.next = cur;
            pre = pre.next;
        }
        
        return dummy.next;
    }
}