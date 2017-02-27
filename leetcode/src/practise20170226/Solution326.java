package practise20170226;

/**
 * Created by troy on 2017/2/26.
 * 326.Power Of Three
 * Given an integer, write a function to determine if it is a power of three.
 * Follow up:
 * Could you do it without using any loop / recursion?
 */
public class Solution326 {
    public boolean isPowerOfThree(int n) {
        return n > 0 && 1162261467 % n == 0;
    }

    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(Integer.parseInt("7fffffff", 16)));
        int i = 31;
        while(i <= 31) {
            if (Math.pow(3, i) < Math.pow(2, 31)) {
                System.out.println(String.valueOf(Math.pow(3, i)));
                break;
            }
            i--;
        }
    }
}
