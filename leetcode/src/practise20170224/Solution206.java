package practise20170224;

/**
 * Created by troy on 2017/2/24.
 * 206. Reverse Linked List
 * Reverse a singly linked list
 */
public class Solution206 {
    public ListNode reverseList(ListNode head) {
        /*// 方法一、逐个遍历
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
        return newHead;*/

        // 方法二、递归方法
        return reverseListAction(head, null);
    }
    private ListNode reverseListAction(ListNode head, ListNode newHead) {
        if(head == null) {
            return newHead;
        }
        ListNode next = head.next;
        head.next = newHead;
        return reverseListAction(next, head);
    }
}
