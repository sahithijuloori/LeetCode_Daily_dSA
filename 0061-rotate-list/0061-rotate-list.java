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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode dummy=new ListNode(0);
        if(head==null || head.next==null){
            return head;
        }
        dummy.next=head;
        ListNode c=head;
        int co=0;
        ListNode c1=head;
        ListNode c2=dummy;
        while(c!=null){
            c=c.next;
            c2=c2.next;
            co++;
        }
        int x=0;
        int y=k % co;
        if(y==0){
            return head;
        }
        else{
            x=co-y;
            ListNode curr=head;
            while(x>1){
                curr=curr.next;
                x--;
            }
            ListNode next=curr.next;
            dummy.next=next;
            curr.next=null;
            c2.next=c1;
            return dummy.next;
        }
    }
}