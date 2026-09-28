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
    public ListNode reverseList(ListNode head) {
       ListNode ans1=null;
       ListNode ans=ans1;

       ListNode temp=head;

       while(temp!=null){
        ListNode new_node=new ListNode(temp.val);
            new_node.next=ans1;
            ans1=new_node;
        
        temp=temp.next;
       }
       return ans1;


    }
}