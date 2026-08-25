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
    public ListNode partition(ListNode head, int x) {
        ListNode d1=new ListNode(101);
        ListNode d2=new ListNode(101);
        ListNode one=d1;
        ListNode two=d2;
        ListNode curr=head;
        while(curr!=null){
            int y=curr.val;
            if(y<x){
                one.next=curr;
                one=one.next;
            }
            else{
                two.next=curr;
                two=two.next;
            }
            curr=curr.next;
        }
        two.next=null;
        one.next=d2.next;
        return d1.next;
    }
}