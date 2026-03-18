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
        ListNode headPointer = head;
        while(headPointer != null) {
            ListNode currentPointer = headPointer.next;
            while(currentPointer != null && currentPointer.val == headPointer.val) {
                currentPointer = currentPointer.next;
            }
            headPointer.next = currentPointer;
            headPointer = headPointer.next;
        }
        return head;
    }
}