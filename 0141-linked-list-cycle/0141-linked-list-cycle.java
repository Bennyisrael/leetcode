/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode t=head;
        while(t!=null && t.next!=null){
            head=head.next;
            t=t.next.next;
            if(t==head)
                return true;
        }
        return false;
    }
}