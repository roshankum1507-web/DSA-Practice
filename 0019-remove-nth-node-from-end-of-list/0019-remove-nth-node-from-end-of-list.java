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

        if (head == null)
            return null;
        if (head.next == null && n==1)
            return null;

        ListNode temp = head;
        int cnt = 0;

        while (temp != null) {

            cnt++;
            temp = temp.next;

        }

        int counter = 0;
        int k = cnt - n + 1;
        int m = cnt - n;

        temp = head;
        ListNode prev = head;

        if(n==cnt){
            head = head.next;
            return head;
        }

        while (temp != null) {

            counter++;

            if (counter == k)
                break;

            else if (counter == m) {
                temp = temp.next;
                continue;
            }

            temp = temp.next;
            prev = prev.next;
        }

        prev.next = temp.next;
        temp.next = null;

        return head;

    }
}