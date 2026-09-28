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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode() {
        };
        ListNode temp = ans;
        int rem = 0;
        while (l1 != null || l2 != null || rem != 0) {

            int sum = rem;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            ListNode newnode = new ListNode(sum % 10);
            rem = sum / 10;
            temp.next = newnode;
            temp = temp.next;
            // l1=l1.next;
            // l2=l2.next;
        }
        return ans.next;

    }
}
