/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode headAPointer = headA;
        ListNode headBPointer = headB;
        while(headAPointer != null) {
            headBPointer = headB;
            while(headBPointer != null) {
                if(headAPointer == headBPointer) {
                    return headAPointer;
                }
                headBPointer = headBPointer.next;
            }
            headAPointer = headAPointer.next;
        }
        return null;
    }
}

 //The rational is if there is no common element
 //both stops at null
 // if there is a common element, there are options.. one headA needs more elemet before hitting the common element while headB reaches soon.
 // since we change the headB next,  this extra space gets balanced in next loop and they meet at the intersection on next loop
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode headAPointer = headA;
        ListNode headBPointer = headB;
        while(headAPointer != headBPointer) {
           headAPointer = headAPointer == null ? headB : headAPointer.next;
           headBPointer = headBPointer == null ? headA : headBPointer.next;
        }
        return headAPointer;
    }
}