//Not completed

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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> list = new ArrayList<>();
        list.add(root.val + 0.0);
        return list;
    }
    
    public List<Double> average(TreeNode root, List<Double> list) {
        if (root == null) {
            return null;
        } 
        int num = 2;
        int a = -1; 
        int b = -1;
        if (root.left == null) {
            a   = 0;
            num--;        
        } else {
            a = root.left.val;
        }
        if (root.right == null) {
            b = 0;
            num--;
        } else {
            b = root.right.val;
        }
        
        if (num != 0) {
            list.add((a+b)/num);
        }
        
        return average(root.left, list);  
        return average(root.right, list);              
    }


}
