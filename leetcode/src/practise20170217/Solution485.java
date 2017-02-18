package practise20170217;

/**
 * Max Consecutive Ones
 * Given a binary array, find the maximum number of consecutive 1s in this array.
 * @author Troy
 * ˼·������ǰ��Ϊ0����Ƚ�temp��max�Ĵ�С������ĸ�ֵ��max������temp��Ϊ0������temp��1
 */
public class Solution485 {
	public int findMaxConsecutiveOnes(int[] nums) {
		if(nums == null || nums.length == 0) {
			return 0;
		}
		int temp = 0;
		int max = 0;
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] == 0) {
				max = temp > max ? temp : max;
				temp = 0;
				//continue;
			} else {
				temp++;
			}
		}
		return temp > max ? temp : max;
	}
}
