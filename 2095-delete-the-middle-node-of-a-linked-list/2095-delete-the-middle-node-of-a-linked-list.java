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
    public ListNode deleteMiddle(ListNode head) {
        if(head==null)
        {
            return head;
        }

        int c=0;
        ListNode temp=head;
        while(temp!=null)
        {
            c++;
            temp=temp.next;
        }
        c=c/2;
        if(c==0)
        {
            return null;
        }
        temp=head;
        while(c>1)
        {
            temp=temp.next;
            c--;
        }
        temp.next=temp.next.next;
        return head;
    }
}