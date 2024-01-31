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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0) return null;
        if(lists.length == 1) return lists[0];
        return mergeList(lists, 0, lists.length-1);
    }

    public ListNode mergeList(ListNode[] lists, int left, int right){
        if(left == right) return lists[left];

        int mid = left + (right-left)/2;
        ListNode first = mergeList(lists, left, mid);
        ListNode second = mergeList(lists, mid+1, right);
        return mergeList(first, second);
    }

    public ListNode mergeList(ListNode list1, ListNode list2){
        ListNode temp = new ListNode(0);
        ListNode p = temp;
        while(list1!=null && list2!=null){
            if(list1.val < list2.val){
                p.next = list1;
                list1 = list1.next;
            }else{
                p.next = list2;
                list2 = list2.next;
            }
            p = p.next;
        }
        if(list1!=null){
            p.next = list1;
        }
        if(list2!=null){
            p.next = list2;
        }
        return temp.next;
    }
}