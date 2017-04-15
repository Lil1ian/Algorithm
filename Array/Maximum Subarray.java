public class Solution {
    public int maxSubArray(int[] nums) {
        int N = nums.length;
        int[] max = new int[N];
        max[0] = nums[0];
        int res = nums[0];
        for(int i=1; i<N; i++) {
            max[i] = Math.max(nums[i]+max[i-1], nums[i]);
            res = Math.max(res, max[i]);
        }
        return res;
    }
}
