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
    public int minDepth(TreeNode root) {
        if(root == null)
            return 0;
        int minleft = minDepth(root.left);
        int minright = minDepth(root.right);
        if(minleft==0 || minright==0)
            return minleft>=minright?minleft+1:minright+1;
        return Math.min(minleft,minright)+1;
    }
}

/**
 *iterative
 */

public class Solution {
    public int minDepth(TreeNode root) {
        if(root==null) return 0;
        LinkedList queue = new LinkedList();
        queue.offer(root);
        int cur=1, nex=0, level=0;
        while(!queue.isEmpty()) {
            TreeNode x = (TreeNode)queue.poll();
            cur--;
            
            if(x.left==null && x.right==null) {
                level++;
                break;
            }
            if(x.left!=null) {
                queue.offer(x.left);
                nex++;
            }
            if(x.right!=null) {
                queue.offer(x.right);
                nex++;
            }
            
            if(cur==0) {
                cur = nex;
                nex = 0;
                level++;
            }
            
        }
        return level;
    }
}
