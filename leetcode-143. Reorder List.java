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
    //use fast pointer and reach till middle
    // reverse the middle next to end
    // loop start and middle reversed
    // link them one at a time
    // temp1 = first.next
    // temp2 = second.next
    // first.next = second
    // second.next = temp1
    // first = temp1
    // second = temp2 for next loop
    public void reorderList(ListNode head) {
        ListNode slow, fast;
        ListNode afterHalf, headPointer = head;
        ListNode first;
        ListNode second;
        slow = head;
        fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        first = head;
        second = reverse(slow.next);
        slow.next = null;
        while(second != null) {
            ListNode temp1 = first.next;
            ListNode temp2 = second.next;
            //key is 
            first.next = second;
            second.next = temp1;
            first = temp1;
            second = temp2;
        }
    }

    private ListNode reverse(ListNode start) {
        ListNode prev = null;
        while(start != null) {
            ListNode next = start.next;
            start.next = prev;
            prev = start;
            start = next;
        }
        return prev;
    }
}