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
    public int getDecimalValue(ListNode head) {
        ListNode temp = head;
        int c=0;
        while(temp!=null){
            c++;
            temp=temp.next;
        }
        int sum=0;
        temp = head;
        while (temp != null) {
            c--;
            sum += temp.val * Math.pow(2,c);
            temp = temp.next;
        }

        return sum;
    }
}