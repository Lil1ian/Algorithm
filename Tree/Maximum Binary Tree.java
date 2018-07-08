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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if(nums.length == 0) return null;
        if(nums.length == 1) return new TreeNode(nums[0]);
        return helper(nums, 0 , nums.length-1);
    }
    private TreeNode helper(int[] nums, int start, int end) {
        if(start > end) return null;
        int maxIndex = maxNum(nums, start, end);
        TreeNode root = new TreeNode(nums[maxIndex]);
        root.left = helper(nums, start, maxIndex-1);
        root.right = helper(nums, maxIndex+1, end);
        return root;
    }
    private int maxNum(int[] arr, int start, int end) {
        int max = start;
        for(int i = start ; i <= end ; i++) {
            if(arr[i] > arr[max])
                max = i;
        }
        return max;
    }
}
