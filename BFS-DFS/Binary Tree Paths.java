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
    List<String> res = new ArrayList<String>();
    public List<String> binaryTreePaths(TreeNode root) {
        
        if(root==null) return res; 
        FindPaths(root, root.val + "");
        return res;
    }
    public void FindPaths(TreeNode node, String path) {
        if(node.left==null && node.right==null) res.add(path);
        if(node.left!=null) FindPaths(node.left, path + "->" + node.left.val);
        if(node.right!=null) FindPaths(node.right, path + "->" + node.right.val);
    }
}
