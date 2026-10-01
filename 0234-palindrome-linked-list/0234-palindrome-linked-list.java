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

    public ListNode REVERSE(ListNode head) {

        ListNode temp = head;
        ListNode front = null;
        ListNode pre = null;

        while (temp != null) {

            front = temp.next;
            temp.next = pre;
            pre = temp;
            temp = front;
        }

        return pre;
    }

    public boolean isPalindrome(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode secondhalf = REVERSE(slow);
        ListNode firsthalf = head;

        while (secondhalf != null) {

            if (firsthalf.val != secondhalf.val) {
                return false;
            }
            firsthalf = firsthalf.next;
            secondhalf = secondhalf.next;
        }

        return true;

    }

}