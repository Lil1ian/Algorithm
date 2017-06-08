public class Solution {
    public int missingNumber(int[] nums) {
        if(nums==null || nums.length==0) return 0;
        int N = nums.length;
        int sum = 0;
        for(int i=0; i<N; i++) {
            sum += nums[i];
        }
        return N*(N+1)/2-sum;
    }
}
