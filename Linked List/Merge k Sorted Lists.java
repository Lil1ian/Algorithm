/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length == 0) {
            return null;
        }
        PriorityQueue<ListNode> q = new PriorityQueue<ListNode>(lists.length, new Comparator<ListNode>() {
            public int compare(ListNode a, ListNode b) {
               return a.val - b.val;
           } 
        });
 
        
        ListNode d = new ListNode(0);
        ListNode cur = d;
        
        for(ListNode list : lists) {
            if(list != null) {
                q.offer(list);
            }
        }
        
        while(!q.isEmpty()) {
            cur.next = q.poll();
            cur = cur.next;
            if(cur.next != null) {
                q.offer(cur.next);
            }
        }
        
        return d.next;
        
    }
   
}
