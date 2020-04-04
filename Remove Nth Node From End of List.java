/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null){
            return null;
        }
        
        ListNode dummy = new ListNode(-1);
        ListNode count = head;
        dummy.next = head;
        ListNode cur = dummy;
        int total = 1;
        
        while(count.next != null){
            total++;
            count = count.next;
        }
        
        int removeInd = total - n;
        
        while(cur.next != null){
            if(removeInd == 0 && cur.next.next != null){
                cur.next = cur.next.next;
                cur = cur.next;
            }else if(removeInd == 0 && cur.next.next == null){
                cur.next = null;
            }else{
                cur = cur.next;
            }
            removeInd--;
        }
        return dummy.next;
    }




    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode cur = head;
        int length = 0;
        
        while(cur != null){
            cur = cur.next;
            length++;
        }
        
        length = length - n;
        cur = dummy;
        while(length > 0){
            length--;
            cur = cur.next;
        }
        
        cur.next = cur.next.next;
        
        return dummy.next;
    }
}