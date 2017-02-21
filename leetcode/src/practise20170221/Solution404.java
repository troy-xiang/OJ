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
        int temp = 0;
        TreeNode left = new TreeNode(0);
        left = root;
        while(left.left != null) {
            left = left.left;
            temp = left.val;
        }
        count += temp;
        return count + sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
    }
}
