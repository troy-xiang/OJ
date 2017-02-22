package practise20170222;

/**
 * Created by troy on 2017/2/22.
 * 100.Same Tree
 * Given two binary trees, write a function to check if they are equal or not.
 * Two binary trees are considered equal if they are structurally identical and the nodes have the same value.
 */
public class Solution100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        /*if(p == null && q == null) {
            return true;
        }
        if((p.left == null && q.left != null) || (p.left != null && q.left == null)) {
            return false;
        } else {
            if((p.right == null && q.right != null) || (p.right != null && q.right == null)) {
                return false;
            } else {
                if((p.left.val == q.left.val) && (p.right.val == q.right.val)) {
                    return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
                } else {
                    return false;
                }
            }
        }*/
        if(p == null && q == null) {
            return true;
        }
        if(p == null || q == null) {
            return false;
        }
        if(p.val == q.val) {
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }
        return false;
    }
}
