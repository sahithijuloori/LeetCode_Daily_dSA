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
    public ListNode oddEvenList(ListNode head) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode curr=dummy;
        int c=0;
        while(curr.next!=null){
            curr=curr.next;
            c++;
        }
        c=c/2;
        ListNode c1=head;
        while(c>0){
            ListNode x=new ListNode(c1.next.val);
            curr.next=x;
            c1.next=c1.next.next;
            c1=c1.next;
            c--;
            curr=curr.next;
        }
        return head;
    }
}