package practise20170219;

/**
 * Created by Troy on 2017/2/19.
 * 226.Invert Binary Tree
 * Invert a binary tree.
 */
public class Solution226 {
    public TreeNode invertTree(TreeNode root) {
        if(root == null) {
            return root;
        }
        // 若左孩子或者有孩子为空，同样也要进行交换
        //if(root.left != null && root.right != null) {
            TreeNode temp;
            temp = root.left;
            root.left = root.right;
            root.right = temp;
            invertTree(root.left);
            invertTree(root.right);
        //}
        // 因为左孩子和右孩子允许为空，所以不能交换值
        /*int temp;
        temp = root.left.val;
        root.left.val = root.right.val;
        root.right.val = temp;
        invertTree(root.left);
        invertTree(root.right);*/
        return root;
    }
}
