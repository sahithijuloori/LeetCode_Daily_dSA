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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode d1=list1;
        ListNode d2=list2;
        ListNode d=new ListNode(0);
        ListNode c=d;
        while(d1!=null && d2!=null){
            if(d1.val<d2.val){
                c.next=d1;
                d1=d1.next;
            }
            else{
                c.next=d2;
                d2=d2.next;
            }
            c=c.next;
        }
        while(d1!=null){
            c.next=d1;
            d1=d1.next;
            c=c.next;
        }
        while(d2!=null){
            c.next=d2;
            d2=d2.next;
            c=c.next;
        }
        return d.next;
    }
}