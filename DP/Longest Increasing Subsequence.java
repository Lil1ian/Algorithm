class Solution {
    public int lengthOfLIS(int[] nums) {
       if(nums == null || nums.length == 0) {
           return 0;
       }
        int n = nums.length;
        int[] dp = new int[n];
        
        for(int i=0; i<n; i++) {
            dp[i] = 1;
            for(int j=0; j<i; j++) {
                if(nums[j] < nums[i]) {
                    dp[i] = Math.max(dp[j]+1, dp[i]);
                }
            }
        }
        
        int res = 0;
        for(int k=0; k<n; k++) {
            if(dp[k] > res) {
                res = dp[k];
            }
        }
        return res;
        
    }
}
