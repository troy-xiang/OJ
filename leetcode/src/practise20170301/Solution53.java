package practise20170301;

/**
 * Created by troy on 2017/3/1.
 * 53.Maximum Subarray
 * Find the contiguous subarray within an array (containing at least one number) which has the largest sum.
 * For example, given the array [-2,1,-3,4,-1,2,1,-5,4],
 * the contiguous subarray [4,-1,2,1] has the largest sum = 6.
 */
public class Solution53 {
    public int maxSubArray(int[] nums) {
        if (nums.length == 0 || nums == null) {
            return 0;
        }
        // 使用动态规划来求解
        int length = nums.length;
        int[] dp = new int[length];
        dp[0] = nums[0];
        int max = dp[0];
        for (int i = 1; i < length; i++) {
            dp[i] = nums[i] + (dp[i - 1] > 0 ? dp[i - 1] : 0);
            max = Math.max(max, dp[i]);
        }
        return max;
    }
}
