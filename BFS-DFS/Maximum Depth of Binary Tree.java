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

/**
 *iterative
 */

public class Solution {
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        int level = 0;
        LinkedList queue = new LinkedList();
        int cur=1, next=0;
        queue.offer(root);
        while(!queue.isEmpty()) {
            TreeNode n = (TreeNode)queue.poll();
            cur--;
            if(n.left!=null) {
                queue.add(n.left);
                next++;
            }
            if(n.right!=null) {
                queue.add(n.right);
                next++;
            }
            if(cur==0) {
                cur = next;
                next = 0;
                level++;
            }
        }
        return level;
    }
}
