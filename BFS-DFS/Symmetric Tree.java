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
        if(root == null) {
            return true;
        }
        if(root.left == null && root.right == null) {
            return true;
        }
        if(root.left == null || root.right == null) {
            return false;
        }
       
        return dfs(root.left, root.right);
        
               
    }
    public boolean dfs(TreeNode l, TreeNode r) {
        if (l == null && r == null) {
		    return true;
	    } else if (r == null || l == null) {
		    return false;
	    }
 
	    if (l.val != r.val) {
		    return false;
        }
        if(! dfs(l.left, r.right)) {
            return false;
        }
        if(! dfs(l.right,r.left)) {
            return false;
        }
        return true;
            
    }
    
}







