package practise20170301;

/**
 * Created by troy on 2017/3/1.
 * 70.Climbing Stairs
 * You are climbing a stair case. It takes n steps to reach to the top.
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 */
public class Solution70 {
    public int climbStairs(int n) {
        if (n <= 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        // 类似于斐波拉契数列，第三个数等于第一个数+第二个数（因为第一个数加上2可以到第三个数，第二个数加上1可以到第三个数）
        int a = 1;
        int b = 2;
        int c = 0;
        for (int i = 3; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }
}
