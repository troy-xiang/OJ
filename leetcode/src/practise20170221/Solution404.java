package practise20170221;

/**
 * Created by Troy on 2017/2/21.
 * 404. Sum of Left Leaves
 */
public class Solution404 {
    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null) {
            return 0;
        }
        int count = 0;
        if(root.left != null) {
            if(root.left.left == null && root.left.right == null) {
                count += root.left.val;
            } else {
                count += sumOfLeftLeaves(root.left);
            }
        }
        return count + sumOfLeftLeaves(root.right);
    }
}
