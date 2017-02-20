package practise20170220;

import java.util.Arrays;

/**
 * Created by Troy on 2017/2/20.
 * 167. Two Sum II - Input array is sorted
 * Given an array of integers that is already sorted in ascending order,
 * find two numbers such that they add up to a specific target number.
 * The function twoSum should return indices of the two numbers such that they add up to the target,
 * where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.
 */
public class Solution167 {
    public int[] twoSum(int[] numbers, int target) {
        if(numbers.length < 2) {
            return new int[] {};
        }

        int length = numbers.length;
        for(int i = 0; i < length; i++) {
            for(int j = i + 1; j < length; j++) {
                if(numbers[i] + numbers[j] == target) {
                    return new int[] {i + 1, j + 1};
                }
            }
        }
        return new int[] {};
    }
}
