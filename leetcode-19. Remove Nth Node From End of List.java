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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int total = 0;
        int nFromStart;
        ListNode headPointer = head;
        ListNode prev = head;
        int count = 0;
        while(headPointer != null) {
            total++;
            headPointer = headPointer.next;
        }
        nFromStart = total - n;
        if(nFromStart == 0) {
            return head != null ? head.next: head;
        }
        System.out.println(nFromStart  + "  "+ total + "  "+n);
        headPointer = head;
        while(headPointer != null) {
            count++;
            if(count == nFromStart) {
                if(headPointer.next != null) {
                    headPointer.next = headPointer.next.next;
                } else {
                    prev.next = null;
                }
                break;
            }
            prev = headPointer;
            headPointer = headPointer.next;
        }
        return head;
    }
}