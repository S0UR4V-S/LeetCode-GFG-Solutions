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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode temp=head;
            int size=0;
            while(temp!=null){
                size++;
                temp=temp.next;
            }
            temp=head;
            int size2=size-k+1;
            int count=1;
            int t1=head.val;
            int t2=0;
            while(temp!=null){
                if(count==k)
                    t1=temp.val;
                if(count==size2)
                    t2=temp.val;
                count++;
                temp=temp.next;
            }
            temp=head;
            count=1;
            while(temp!=null){
                if(count==k)
                    temp.val=t2;
                if(count==size2)
                    temp.val=t1;
                count++;
                temp=temp.next;
            }
        return head;
    }
}