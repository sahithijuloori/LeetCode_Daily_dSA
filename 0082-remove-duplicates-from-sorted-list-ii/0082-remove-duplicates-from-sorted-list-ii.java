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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode d=new ListNode(101);
        d.next=head;
        ListNode c=head;
        ListNode ans=d;
        int cost=0;
        while(c!=null){
            int x=c.val;
            while(c.next!=null && c.next.val==x){
                c=c.next;
                cost++;
            }
            if(cost==0){
                d.next=c;
                d=d.next;
            }
            else{
                cost=0;
            }
            c=c.next;
        }
        d.next=null;
        return ans.next;
    }
}