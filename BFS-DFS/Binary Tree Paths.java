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
        
        if(root == null) {
            return res;
        }
        dfs(root, root.val + "");
        return res;
    }
    
    public List<String> dfs(TreeNode node, String path) {
        if(node.left==null && node.right==null) {
            res.add(path);
        }
        if(node.left != null) {
            dfs(node.left, path + "->" + node.left.val);
        }
        if(node.right != null) {
            dfs(node.right, path + "->" + node.right.val);
        } 
        return res;
    }
       
}

