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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode d=dummy;
        ListNode curr=head;
        while(curr!=null){
            ListNode prev=curr;
            ListNode c=curr;
            for(int i=0;i<k;i++){
                if(prev==null){
                    return dummy.next;
                }
                prev=prev.next;
            }
            ListNode x=prev;
            while(curr!=x){
                ListNode n=curr.next;
                curr.next=prev;
                prev=curr;
                curr=n;
            }
            d.next=prev;
            d=c;
        }
        return dummy.next;
    }
}