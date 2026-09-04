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
    public ListNode swapPairs(ListNode head) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode d=dummy;
        ListNode curr=head;
        while(curr!=null && curr.next!=null){
            ListNode n=curr.next.next;
            ListNode p=curr.next;
            p.next=curr;
            curr.next=n;
            d.next=p;
            d=curr;
            curr=n;
        }
        return dummy.next;
    }
}