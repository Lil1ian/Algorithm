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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(root==null) return res;
        LinkedList queue = new LinkedList();
        List<Integer> line = new ArrayList<Integer>();
        queue.offer(root);
        int cur=1, nex=0, level=1;
        while(!queue.isEmpty()) {
            TreeNode x = (TreeNode)queue.poll();
            if(level%2!=0) line.add(x.val);
            else line.add(0, x.val);
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
                level++;
                res.add(line);
                line = new ArrayList<Integer>();
            }
        }
        return res;
    }
}
