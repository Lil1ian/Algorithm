/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root==null) return false;
        LinkedList queue = new LinkedList();
        LinkedList value = new LinkedList();
        queue.offer(root);
        value.offer(root.val);
        while(!queue.isEmpty()) {
            TreeNode x = (TreeNode)queue.poll();
            int total = (int)value.poll();
            if(x.right==null && x.left==null && sum==total) return true;
            if(x.left!=null) {
                queue.offer(x.left);
                value.offer(total+x.left.val);
            }
            
            if(x.right!=null) {
                queue.offer(x.right);
                value.offer(total+x.right.val);
            }
        }
        return false;
    }
}

/**
 *recursion
 */
 public class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root==null) return false;
        if(root.right==null && root.left==null && sum==root.val) return true;
        return hasPathSum(root.left, sum-root.val) || hasPathSum(root.right, sum-root.val);
    }
}
 
