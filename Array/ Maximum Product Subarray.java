public class Solution {
    public int maxProduct(int[] nums) {
        int N = nums.length;
        int[] max = new int[N];
        int[] min = new int[N];
        max[0] = nums[0];
        min[0] = nums[0];
        int res = nums[0];
        for(int i=1; i<N; i++)
        {
            if(nums[i]>0)
            {
                max[i] = Math.max(nums[i], max[i-1]*nums[i]);
                min[i] = Math.min(nums[i], min[i-1]*nums[i]);
            }
            else
            {
                max[i] = Math.max(nums[i], min[i-1]*nums[i]);
                min[i] = Math.min(nums[i], max[i-1]*nums[i]);
            }
            res = Math.max(res, max[i]);
        }
        return res;
    }
}
