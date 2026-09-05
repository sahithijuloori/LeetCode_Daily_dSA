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
    public int pairSum(ListNode head) {
        ListNode f=head;
        ListNode s=head;
        while(f!=null && f.next!=null){
            f=f.next.next;
            s=s.next;
        }
        ListNode c=s;
        ListNode prev=null;
        while(c!=null){
            ListNode n=c.next;
            c.next=prev;
            prev=c;
            c=n;
        }
        s=prev;
        int max=0;
        ListNode curr=head;
        while(prev!=null){
            int x=curr.val+prev.val;
            max=Math.max(max,x);
            curr=curr.next;
            prev=prev.next;
        }
        return max;
    }
}