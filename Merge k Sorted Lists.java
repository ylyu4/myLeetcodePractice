/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {

    ///Using Priority Queue
    ///Add all ListNodes in priorty Queue
    ///Poll them out from small value to large 

    public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length == 0){
            return null;
        }
        
        PriorityQueue <Integer> pq = new PriorityQueue<>();
        
        for(int i = 0; i < lists.length; i++){
            ListNode point = lists[i];
            while(point != null){
                pq.add(point.val);
                point = point.next;
            }
        }
        
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        
        while(pq.peek()!=null){
            ListNode n = new ListNode(pq.poll());
            cur.next = n;
            cur = cur.next;
        }
        
        return dummy.next;
    }
}