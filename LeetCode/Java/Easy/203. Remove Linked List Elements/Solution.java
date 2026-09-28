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
    public ListNode removeElements(ListNode head, int val) {
        if(head==null)
            return head;
       while(head.val==val && head.next!=null)
        head=head.next;
        ListNode temp=head;
        while(temp.next!=null ){
            if(temp.next.val==val)
                temp.next=temp.next.next;
            else
            temp=temp.next;
        }
            if(temp.next!=null)
        if(temp.next.val==val)
            temp.next=null;
        if(head.val==val && head.next==null)
            head=null;
        
        return head;
    }
}