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
    public ListNode reverseList(ListNode head) {

        ListNode temp = head;
        ListNode front = null;
        ListNode pre = null;

        while(temp!=null){
               
            front = temp.next;
            temp.next = pre;
            pre = temp;
            temp = front;


        }

        return pre;



        
    }
}