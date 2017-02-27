package practise20170227;

/**
 * Created by troy on 2017/2/27.
 * 35.Search Insert Position
 * Given a sorted array and a target value, return the index if the target is found.
 * If not, return the index where it would be if it were inserted in order.
 */
public class Solution35 {
    public int searchPosition(int[] nums, int target) {
        if(nums.length == 0 || nums == null) {
            return 0;
        }
        /*int i = 0;
        for (; i < nums.length; i++) {
            if (nums[i] < target) {
                continue;
            }
            if (nums[i] == target) {
                return i;
            }
            if (nums[i] > target) {
                if (i == nums.length - 1) {
                    return nums.length - 1;
                }
                break;
            }
        }
        return i;*/
        return findPosition(nums, 0, nums.length - 1, target);
    }
    private int findPosition(int[] nums, int low, int high, int target) {
        //while(low < high) {
        while(low <= high) {
            int middle = (low + high) / 2;
            if(nums[middle] == target) {
                return middle;
            } else if(nums[middle] > target) {
                high = middle - 1;
            } else {
                low = middle + 1;
            }
        }
        //return nums[low] < target ? low + 1 : low;
        return low;
    }
}
