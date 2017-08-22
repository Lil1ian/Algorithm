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
    public List<Integer> largestValues(TreeNode root) {
        
        if(root == null){
            return new ArrayList<Integer>();
        }
        List<TreeNode> goList = new ArrayList<TreeNode>();
        goList.add(root);
        int curDeepLen = 1; 
        int nextDeepLen = 0; 
        int max = Integer.MIN_VALUE; 

        List<Integer> maxList = new ArrayList<Integer>();

        while(goList.size() > 0){
            TreeNode curNode = goList.get(0);
            goList.remove(0);

            if(curNode.left != null){
                nextDeepLen ++;
                goList.add(curNode.left);
            }
            if(curNode.right != null){
                nextDeepLen ++;
                goList.add(curNode.right);
            }
            if(curNode.val > max){
                max = curNode.val;
            }
            curDeepLen--;
            if(curDeepLen == 0){ 
                curDeepLen = nextDeepLen;
                nextDeepLen = 0;
                maxList.add(max);
                max = Integer.MIN_VALUE;
            }
        }

        return maxList;
        
    }
}
