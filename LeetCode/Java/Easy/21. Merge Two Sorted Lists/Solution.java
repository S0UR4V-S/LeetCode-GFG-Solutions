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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode() {
        };
        ListNode t = ans;
        if (l1 == null && l2 == null) {
            return l1;
        } else if (l1 == null)
            return l2;
        else if (l2 == null)
            return l1;

        while (l1 != null && l2 != null) {
            if ((l1.val <= l2.val)) {
                ListNode newnode = new ListNode(l1.val);
                t.next = newnode;
                t = t.next;
                l1 = l1.next;
            } else {
                ListNode newnode = new ListNode(l2.val);
                t.next = newnode;
                t = t.next;
                l2 = l2.next;
            }
        }
        if(l1!=null){
            t.next=l1;
        }
        else
            t.next=l2;
        return ans.next;
    }
}