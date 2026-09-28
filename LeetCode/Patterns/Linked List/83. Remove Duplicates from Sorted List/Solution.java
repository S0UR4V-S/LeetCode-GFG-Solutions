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
        if(head==null || head.next==null)
            return head;
        ListNode temp=head;
        while(temp!=null && temp.next!=null){
            while(temp.val==temp.next.val){
                temp.next=temp.next.next;
                if(temp.next==null)
                    break;
                }
            temp=temp.next;
        }
        return head;
    }
}