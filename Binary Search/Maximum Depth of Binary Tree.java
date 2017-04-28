/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
 
/**
 * recursion
 */
 
public class Solution {
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        int rightM = maxDepth(root.right);
        int leftM = maxDepth(root.left);
        return Math.max(rightM, leftM)+1;
    }
}
