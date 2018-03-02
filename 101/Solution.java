/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        
        return root == null || sym(root.left, root.right);
    }
    
    public boolean sym(TreeNode left, TreeNode right) {
        if (left == null || right == null) {
			return left == right;
		}
		if (left.val != right.val) {
			return false;
		}
		return sym(left.left, right.right) && sym(left.right, right.left);
    }
}