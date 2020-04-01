/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode cur = dummy;
        ListNode c1 = l1;
        ListNode c2 = l2;
        int carried = 0;
        while(c1 != null && c2 != null){
            cur.next= new ListNode((c1.val+c2.val+carried)%10);
            carried = (c1.val+c2.val+carried)/10;
            c1 = c1.next;
            c2 = c2.next;
            cur = cur.next;
        }
        while(c1 != null){
            cur.next = new ListNode((c1.val+carried)%10);
            carried = (c1.val+carried)/10;
            cur = cur.next;
            c1 = c1.next;
        }
        
        while(c2 != null){
            cur.next = new ListNode((c2.val+carried)%10);
            carried = (c2.val+carried)/10;
            cur = cur.next;
            c2 = c2.next;
        }
        
        if(carried == 1){
            cur.next = new ListNode(carried);
            cur = cur.next;
        }
        
        return dummy.next;
    }
}