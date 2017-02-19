package practise20160913;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author xiangbo 2016-09-13 136. Single Number Your algorithm should have a
 *         linear runtime complexity. Could you implement it without using extra
 *         memory?
 */
public class Solution136 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		s.close();
		int[] x = { 1, 0, 1 };
		System.out.println(new Solution_4().singleNumber(x));
	}
}

// ����λ����
class Solution_4 {
	public int singleNumber(int[] nums) {
		// ��õķ�����λ����
		/*
		 * for(int i = 1; i < nums.length; i++){ nums[0] = nums[0] ^ nums[i]; }
		 * return nums[0];
		 */
		if (nums.length == 1) {
			return nums[0];
		}
		Arrays.sort(nums);
		for (int i = 0; i < nums.length - 1; i = i + 2) {
			if (nums[i] == nums[i+1]) {
				continue;
			}else{
				return nums[i];
			}
		}
		// �������û�з���ֵ�Ļ�����ôֻ��һ�ֿ��ܣ��������һ��Ԫ����single�ģ���Ϊforѭ�������һ��Ԫ��û�ж�
		return nums[nums.length - 1];
	}
}
