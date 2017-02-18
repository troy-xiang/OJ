package practise20170217;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Find All Numbers Disappeared in an Array
 * Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.
 * Find all the elements of [1, n] inclusive that do not appear in this array.
 * Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.
 * @author Troy
 *
 */
public class Solution448 {
	public List<Integer> findDisappearedNumbers(int[] nums) {
		List<Integer> res = new ArrayList<Integer>();
		
		/*for(int i = 0; i < nums.length; i++) {
			nums[(nums[i] - 1) % nums.length] += nums.length;	//取余是因为若原数组中有重复的数，则必须取余，否则数组下标会越界
		}
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] < nums.length) {
				res.add(i + 1);
			}
		}*/
		
		for(int i = 0; i < nums.length; i++) {
			if(nums[Math.abs(nums[i]) - 1] > 0) {		//这里判断是否大于0，是因为若原数组中有重复的数（且出现偶数个），则多次取反后还是会为正；取绝对值的原因也是一样的
				nums[Math.abs(nums[i]) - 1] = -nums[Math.abs(nums[i]) - 1];
			}
		}
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] > 0) {
				res.add(i + 1);
			}
		}
		return res;
	}
}
