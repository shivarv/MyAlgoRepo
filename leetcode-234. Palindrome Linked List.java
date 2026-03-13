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
    boolean isValid = true;
    ListNode start = null;
    public boolean isPalindrome(ListNode head) {
        start = head;
        ListNode end = head;
        isPalindromeHelper(end);
        return isValid;
    }

    public void isPalindromeHelper(ListNode end) {
        if(end == null) {
            return;
        }
        if(isValid == false) {
            return;
        }
        isPalindromeHelper(end.next);
        if(start.val != end.val) {
            isValid = false;
        }
        start = start.next;
    }
}