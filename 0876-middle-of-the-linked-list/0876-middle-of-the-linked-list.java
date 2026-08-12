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
    public ListNode middleNode(ListNode head) {
        if(head.next==null){
            return head;
        }
        ListNode temp=head;
        int c=1;
        while(temp.next!=null){
            c++;
            temp=temp.next;
        }
        int x=(c/2)+1;
        ListNode b=head;
        x--;
        while(x>0){
            b=b.next;
            x--;
        }
        return b;
    }
}