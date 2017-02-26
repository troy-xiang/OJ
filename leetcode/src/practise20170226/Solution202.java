package practise20170226;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by troy on 2017/2/26.
 * 202.Happy Number
 * Write an algorithm to determine if a number is "happy".
 * A happy number is a number defined by the following process:
 * Starting with any positive integer, replace the number by the sum of the squares of its digits,
 * and repeat the process until the number equals 1 (where it will stay),
 * or it loops endlessly in a cycle which does not include 1.
 * Those numbers for which this process ends in 1 are happy numbers.
 */
public class Solution202 {
    public boolean isHappy(int n) {
        if (n <= 0) {
            return false;
        }
        /*int slow = n;
        int fast = n;
        // 主要判断依据：防止死循环，则让一个先起而行，若两个相等，则说明再接下来平方和也是相等的
        do {
            slow = digitToSquareSum(slow);
            fast = digitToSquareSum(fast);
            fast = digitToSquareSum(fast);
        } while (slow != fast);
        if (slow == 1) {
            return true;
        }
        return false;*/
        Set<Integer> set = new HashSet<>();
        int sum = 0;
        // 主要就是判断当前值继续执行取平方和之后是否与当前值相等，避免死循环
        while (set.add(n)) {
            sum = digitToSquareSum(n);
            if (sum == 1) {
                return true;
            } else {
                n = sum;
            }
        }
        return false;
    }
    private int digitToSquareSum(int n) {
        int sum = 0;
        while(n != 0) {
            sum += ((n %10) * (n % 10));
            n /= 10;
        }
        return sum;
    }
}
