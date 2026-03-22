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
 //need to revise
 // need solid understanding on why nextGroupStart is needed for reverse
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(k == 0 || k == 1) {
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prevGroupEnd = dummy;
        while(true) {
            ListNode groupEnd = getKNode(prevGroupEnd, k);
            if(groupEnd == null) {
                break;
            }
            //this step is important
            ListNode nextGroupStart = groupEnd.next;
            ListNode groupStart = prevGroupEnd.next;
            prevGroupEnd.next = reverse(groupStart, nextGroupStart);
            prevGroupEnd = groupStart;
        }
        return dummy.next;
    }

    private ListNode getKNode(ListNode node, int k) {
        while(node != null && k > 0) {
            node  = node.next;
            k--;
        }
        return node;
    }

    private ListNode reverse(ListNode start, ListNode end) {
        ListNode prev = end;
        ListNode curr = start;
        while(curr != end) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}