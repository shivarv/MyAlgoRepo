
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) return head;
        ListNode tail = head;
        ListNode outputHead = null;
        int length = 1;
        int steps = 0;
        while(tail.next != null) {
            tail = tail.next;
            length++;
        }
        if(length == 1) {
            return head;
        }
        k = k % length;
        if(k == 0) {
            return head;
        }
        //make it circular
        tail.next = head;
        steps  = length - k;
        tail = head;
        for(int i = 1; i < steps; i++) {
            tail = tail.next;
        }
        outputHead = tail.next;
        tail.next = null;
        return outputHead;
    }
}


//unoptimised code
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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode headPointer = head;
        ListNode prev = null;
        int length = 0;
        int i = 0;
        while(headPointer != null) {
            headPointer = headPointer.next;
            length++;
        }
        if(length == 0) {
            return head;
        }
        k = k % length;
        if(k == 0) {
            return head;
        }
        System.out.println(k + "  "+length);
        headPointer = head;
        while(headPointer != null) {
            i++;
            if(i == length - k) {
                ListNode currentPointer = headPointer;
                ListNode headPointerStart = headPointer.next;
                ListNode headPointerEnd = headPointerStart;
                System.out.println(headPointer.val);
                if(headPointerEnd == null) {
                    currentPointer.next = head;
                    head = currentPointer;
                    prev.next = null;
                } else {
                    // if 1  , 2, 3 ,4 , 5 -> k = 2
                    // current 3
                    // next 4 , 5
                    // current.next ..newHeaderStart = current.next
                    // current.next = null
                    // ListNode currentPointer = headPointer;
                    // ListNode headPointerStart = headPointer.next;
                    // ListNode headPointerEnd = headPointer;
                    while(headPointerEnd.next != null) {
                        headPointerEnd = headPointerEnd.next;
                    }
                  //  System.out.println(currentPointer.val);
                   // System.out.println(headPointerEnd.val);
                   // System.out.println(headPointerStart.val);
                    currentPointer.next = null;
                    headPointerEnd.next = head;
                    head = headPointerStart;
                }
                //what if headPointerEnd is null
                
                break;
            }
            prev = headPointer;
            headPointer = headPointer.next;
        }
        return head;
    }
}