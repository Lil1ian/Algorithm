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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(root==null) return res;
        LinkedList queue = new LinkedList();
        List<Integer> line = new ArrayList<Integer>();
        queue.offer(root);
        int cur=1, nex=0;
        while(!queue.isEmpty()) {
            TreeNode x = (TreeNode)queue.poll();
            line.add(x.val);
            cur--;
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
                res.add(0,line);
                line = new ArrayList<Integer>();
            }
        }
        return res;
    }
}
