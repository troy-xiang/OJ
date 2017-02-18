package practise20170216;

/**
 * Next Greater Element I
 * You are given two arrays (without duplicates) nums1 and nums2 where nums1’s elements 
 * are subset of nums2. 
 * Find all the next greater numbers for nums1's elements in the corresponding places of nums2.
 * The Next Greater Number of a number x in nums1 is the first greater number to its right 
 * in nums2. If it does not exist, output -1 for this number.
 * @author troy
 *
 */
public class Solution496 {
	public int[] nextGreaterElement(int[] findNums, int[] nums) {
		int[] res = new int[findNums.length];
		int count = 0;
		for(int i = 0; i < findNums.length; i++) {
			int findNum = findNums[i];
			int index = 0;
			boolean flag = false;
			// 找到元素所在位置
			for(int j = 0; j < nums.length; j++) {
				if(findNum == nums[j]) {
					index = j;
					break;
				}
			}
			for(int j = index; j < nums.length; j++) {
				if(nums[j] > findNum) {
					res[count++] = nums[j];
					flag = true;
					break;
				}
			}
			if(flag == false) {
				res[count++] = -1;
			}
		}
		return res;
	}
}
