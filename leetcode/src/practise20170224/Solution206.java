package practise20170224;

/**
 * Created by troy on 2017/2/24.
 * 206. Reverse Linked List
 * Reverse a singly linked list
 */
public class Solution206 {
    public ListNode reverseList(ListNode head) {
        if(head == null) {
            return null;
        }
        ListNode newHead = null;
        while(head != null) {
            ListNode next = head.next;
            head.next = newHead;
            newHead = head;
            head = next;
        }
        return newHead;
    }
}
