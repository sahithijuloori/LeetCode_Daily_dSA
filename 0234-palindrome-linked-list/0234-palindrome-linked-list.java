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
    public boolean isPalindrome(ListNode head) {
        ListNode f=head;
        ListNode s=head;
        while(f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;
        }
        ListNode c1;
        if(f==null){
            c1=s;
        }
        else{
            c1=s.next;
        }
        ListNode prev=null;
        while(c1!=null){
            ListNode next=c1.next;
            c1.next=prev;
            prev=c1;
            c1=next;
        }
        c1=head;
        while( prev!=null){
            if(c1.val!=prev.val){
                return false;
            }
            c1=c1.next;
            prev=prev.next;
        }
        return true;
    }
}