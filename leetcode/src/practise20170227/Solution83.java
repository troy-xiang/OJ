package practise20170227;

/**
 * Created by troy on 2017/2/27.
 * 83. Remove Duplicates from Sorted List
 * Given a sorted linked list, delete all duplicates such that each element appear only once.
 */
public class Solution83 {
    public ListNode deleteDuplicates(ListNode head) {
        /*if (head == null) {
            return head;
        }
        ListNode l = head;
        while(l != null && l.next != null) {
            if (l.val == l.next.val) {
                l.next = l.next.next;
            } else {
                l = l.next;
            }
        }
        return head;*/
        // 递归栈从后向前计算，若最后一个元素与其前一个元素的值相等，则返回最后一个元素，否则返回前一个元素
        // 相当于从两个当中选择一个，不被选择的则被抛弃
        if (head == null || head.next == null) {
            return head;
        }
        head.next = deleteDuplicates(head.next);
        System.out.println(head.val);
        return head.val == head.next.val ? head.next : head;
    }
}
