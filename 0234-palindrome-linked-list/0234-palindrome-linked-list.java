/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
**/
class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null)
            return true;
        ListNode fast=head;
        ListNode slow=head;

        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast=fast.next.next;
        }
        ListNode rev = reverse(slow.next);
        ListNode p1=head;
        ListNode p2=rev;
        while(p2!=null){
            if(p1.val!=p2.val)
                return false;
            p1=p1.next;
            p2=p2.next;
        }
        return true;
    }
    public ListNode reverse(ListNode head){
        ListNode temp=head;
        ListNode prev=null;
        while(temp!=null){
            ListNode front=temp.next;
            temp.next=prev;
            prev=temp;
            temp=front;
        }
        return prev;
    }
}