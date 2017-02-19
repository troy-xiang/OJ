package practise20160523;

import java.util.Scanner;

/**
 * Created by Troy on 2016/5/23.
 * You are given two linked lists representing two non-negative numbers.
 * The digits are stored in reverse order and each of their nodes contain a single digit.
 * Add the two numbers and return it as a linked list.
 * <p>
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
public class AddTwoNums {
    public static void main(String[] args) {
        ListNode l1 = null, l2 = null;
        ListNode p;
        int size;
        int val;
        Scanner s = new Scanner(System.in);
        size = s.nextInt();
        l1 = new ListNode(0);
        l2 = new ListNode(0);
        p = l1;
        for (int i = 0; i < size; i++) {
            val = s.nextInt();
            if (i == 0) {
                p.val = val;
            } else {
                p.next = new ListNode(val);
                p = p.next;
            }
        }
        p.next = null;

        p = l2;
        for (int i = 0; i < size; i++) {
            val = s.nextInt();
            if (i == 0) {
                p.val = val;
            } else {
                p.next = new ListNode(val);
                p = p.next;
            }
        }
        p.next = null;

        Solution2 solution2 = new Solution2();
        ListNode l3 = solution2.addTwoNumbers(l1, l2);
        while (l3 != null) {
            System.out.printf(l3.val + "  ");
            l3 = l3.next;
        }
    }
}

class ListNode {
    int val;
    ListNode next;

    public ListNode(int x) {
        val = x;
    }
}

class Solution2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum = 0;
        ListNode l3 = new ListNode(0);
        ListNode p = l3;
        while (l1 != null || l2 != null) {
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;
            sum = sum + x + y;
            p.val = sum % 10;
            sum = sum / 10;
            if(l1!=null){
                l1=l1.next;
            }
            if(l2!=null){
                l2=l2.next;
            }
            if(l1!=null || l2!=null){
                p.next=new ListNode(0);
                p=p.next;
            }
        }
        /*while (true) {
            if (l1 != null) {
                sum = sum + l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum = sum + l2.val;
                l2 = l2.next;
            }
            p.val = sum % 10;
            sum = sum / 10;
            if (l1 != null || l2 != null) {
                p.next = new ListNode(0);
                p = p.next;
            } else {
                break;
            }
        }*/
        if (sum == 1) {
            p.next = new ListNode(1);
            p = p.next;
        }
        p.next = null;
        return l3;
    }
}
