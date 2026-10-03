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
    public ListNode findlastnode(ListNode head, int val) {

        ListNode temp = head;
        int count = 0;

        while (temp != null) {

            count++;

            if (count == val) {

                return temp;
            }

            temp = temp.next;
        }

        return temp;

    }

    public ListNode rotateRight(ListNode head, int k) {

        if (head == null || head.next == null || k == 0)
            return head;

        if (k == 0)
            return head;

        ListNode tail = head;
        int length = 1;

        while (tail.next != null) {

            length++;
            tail = tail.next;
        }

        k = k % length;

        ListNode lastnode = findlastnode(head, length - k);

        tail.next = head;
        head = lastnode.next;

        lastnode.next = null;

        return head;

    }
}