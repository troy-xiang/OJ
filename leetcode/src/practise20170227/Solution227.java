package practise20170227;

/**
 * Created by troy on 2017/2/27.
 * 231. Power of Two
 * Given an integer, write a function to determine if it is a power of two.
 */
public class Solution227 {
    public boolean isPowerOfTwo(int n) {
        /*while(n % 2 == 0) {
            n /= 2;
        }
        return n == 1;*/
        //return n > 0 && Math.pow(2, 31) % n == 0;
        return n > 0 && Integer.bitCount(n) == 1;
    }

    public static void main(String[] args) {
        System.out.println(Integer.parseInt("9", 3));
    }
}
