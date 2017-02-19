package practise20160523;

import java.util.Scanner;

/**
 * Created by Troy on 2016/5/23.
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution.
 */
public class sum {
    public static void main(String[] args) {
        int size;
        Scanner s = new Scanner(System.in);
        size = s.nextInt();
        int[] num = new int[size];
        for (int i = 0; i < num.length; i++) {
            num[i] = s.nextInt();
        }
        int target = s.nextInt();
        Solution1 solution1 = new Solution1();
        int[] a = solution1.twoSum(num, target);
        System.out.println(a[0] + "  " + a[1]);
    }
}

class Solution1 {
    public int[] twoSum(int[] nums, int target) {
        //int[] a = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    /*a[0] = i;
                    a[1] = j;*/
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("No result!");
    }
}
