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
    //key thing about this algorithm is start with dummy head
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode headPointer = head;
        ListNode prev, first , second;
        prev = dummy;

        while(headPointer != null && headPointer.next != null) {
            //first become head
            //second is next of it
            //we go through prev and assign prev.next = second
            // first.next = second.next to continue loop
            // second.next = first to swap the node
            //prev = first to go to next node
            first = headPointer;
            second = headPointer.next;
            prev.next = second;
            first.next = second.next;
            second.next = first;
            prev = first;
            headPointer = first.next;
        }
        return dummy.next;
        
    }
}