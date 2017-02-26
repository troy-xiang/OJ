package practise20170225;

/**
 * Created by troy on 2017/2/25.
 * 108. Convert Sorted Array to Binary Search Tree
 * Given an array where elements are sorted in ascending order, convert it to a height balanced BST.
 */
public class Solution108 {
    public TreeNode sortedArrayToBSD(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        TreeNode root = sortedArrayToBSDAction(nums, 0, nums.length - 1);
        return root;
    }
    // 因为每个节点都是需要new出来的，所以节点肯定要在这个子方法里new
    // 既然节点都是在子方法里new出来的，那么最后肯定也是从子方法里返回出去的
    // 先判断为null的情况，然后接着写其余的情况
    // 使用递归时一定要所有值保持统一，即全部使用函数中的已有变量，而不要随意使用其他值
    private TreeNode sortedArrayToBSDAction(int[] nums, int low, int high) {
        if (low > high) {
            return null;
        }
        int middle = (low + high) / 2;
        TreeNode node = new TreeNode(nums[middle]);
        node.left = sortedArrayToBSDAction(nums, low, middle - 1);
        node.right = sortedArrayToBSDAction(nums, middle + 1, high);
        return node;
    }
}