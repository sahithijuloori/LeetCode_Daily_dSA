/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode f=head;
        ListNode s=head;
        ListNode p=head;
        boolean c=false;
        while(f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;
            if(f==s){
                c=true;
                break;
            }
        }
        if(c){
            while(p!=s){
                p=p.next;
                s=s.next;
            }
            return p;
        }
        else{
            return null;
        }
    }
}