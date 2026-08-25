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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode d=new ListNode(0);
        d.next=head;
        ListNode c1=d;
        ListNode prev=head;
        int x=left;
        int y=right;
        while(x>1){
            c1=c1.next;
            x--;
        }
        ListNode ans=c1;
        c1=c1.next;
        while(y>0){
            prev=prev.next;
            y--;
        }
        ListNode end=prev;
        while(c1!=end){
            ListNode next=c1.next;
            c1.next=prev;
            prev=c1;
            c1=next;
        }
        ans.next=prev;
        return d.next;
    }
}