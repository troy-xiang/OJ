package practise20170220;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Troy on 2017/2/20.
 * 506. Relative Ranks
 * Given scores of N athletes,
 * find their relative ranks and the people with the top three highest scores,
 * who will be awarded medals: "Gold Medal", "Silver Medal" and "Bronze Medal"
 */
public class Solution506 {
    public String[] findRelativeRanks(int[] nums) {
        if(nums.length <= 0) {
            return new String[] {};
        }
        String[] res = new String[nums.length];
        int []temp = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            temp[i] = nums[i];
        }
        Arrays.sort(temp);
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < temp.length; i++) {
            map.put(temp[i], i);
        }
        for(int i = 0; i < nums.length; i++) {
            if(map.get(nums[i]) == nums.length - 1) {
                res[i] = "Gold Medal";
            } else if(map.get(nums[i]) == nums.length - 2) {
                res[i] = "Silver Medal";
            } else if(map.get(nums[i]) == nums.length - 3) {
                res[i] = "Bronze Medal";
            } else {
                res[i] = String.valueOf(nums.length - map.get(nums[i]));
            }
        }
        return res;
    }
}
