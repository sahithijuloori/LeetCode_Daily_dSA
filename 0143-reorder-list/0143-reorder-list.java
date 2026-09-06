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
    public void reorderList(ListNode head) {
        ListNode f=head;
        ListNode s=head;
        while(f!=null && f.next!=null){
            f=f.next.next;
            s=s.next;
        }
        ListNode c1=s.next;
        s.next=null;
        ListNode prev=null;
        while(c1!=null){
            ListNode next=c1.next;
            c1.next=prev;
            prev=c1;
            c1=next;
        }
        ListNode curr=head;
        while(prev!=null){
            ListNode x=curr.next;
            ListNode y=prev.next;
            prev.next=x;
            curr.next=prev;
            curr=x;
            prev=y;
        }
        
    }
}