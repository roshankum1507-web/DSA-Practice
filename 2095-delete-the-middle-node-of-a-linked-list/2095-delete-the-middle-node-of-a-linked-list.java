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
    public ListNode deleteMiddle(ListNode head) {

        if(head == null) return null;
        if(head.next == null) return null;

        ListNode temp = head;
        int length = 0;

        while(temp != null){

            length++;
            temp = temp.next;

        }

        int k = (length + 2)/2;
        temp = head;
        int counter = 0;
        int prevcounter = 0;
        ListNode prev = head;

        while(temp!=null){

            counter++;
            prevcounter++;

            if(prevcounter == (k-1)){
                temp = temp.next;
                continue;
            }

            if(counter == k){

                break;
            }

            prev = prev.next;
            temp = temp.next;

        }

        prev.next = temp.next;
        temp.next = null;

        return head;
        
    }
}