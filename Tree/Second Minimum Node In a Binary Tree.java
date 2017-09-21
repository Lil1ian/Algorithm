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
    public int findSecondMinimumValue(TreeNode root) {
        if(root==null) return -1;
        if(root.right==null && root.left==null) return -1;
        int right = root.right.val;
        int left = root.left.val;
        if(root.right.val == root.val) right = findSecondMinimumValue(root.right);
        if(root.left.val == root.val) left = findSecondMinimumValue(root.left);
        if(right!=-1 && left!=-1) {
            int sec = Math.min(right,left); 
            if(sec!=root.val) return sec;
        }
        else if(left!=-1) return left;
        else return right;
        return -1;
    }
}
