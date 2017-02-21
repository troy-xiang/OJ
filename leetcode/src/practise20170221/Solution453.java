package practise20170221;

import java.util.Arrays;

/**
 * Created by Troy on 2017/2/21.
 * 453. Minimum Moves to Equal Array Elements
 * Given a non-empty integer array of size n,
 * find the minimum number of moves required to make all array elements equal,
 * where a move is incrementing n - 1 elements by 1.
 * 思路：找出最小值，将其他值与最小值得差相加即为结果，因为最小值想变为之后的值，则必须加上这个差值
 */
public class Solution453 {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        for(int i = 1; i < nums.length; i++) {
            count = count + nums[i] - nums[0];
        }
        return count;
    }
}
