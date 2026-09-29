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
    public ListNode middleNode(ListNode head) {

        if(head == null) return null;
        if(head.next == null) return head;

        ListNode temp = head;
        int length = 0;

        while(temp!=null){
            length++;
            temp = temp.next;
        }

        temp = head;

        int k = (length + 2)/2;
        int counter = 0;

        while(temp != null){

            counter++;

            if(counter == k) break;

            temp = temp.next;

        }

        head = temp;

        return head;


        
    }
}