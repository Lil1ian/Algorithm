public class Solution {
    public int firstMissingPositive(int[] nums) {
        if(nums==null || nums.length==0) return 1;
        int N = nums.length;
        int i;
        for(i=0; i<N; i++) {
            if(nums[i]<=nums.length && nums[i]>0 && nums[nums[i]-1]!=nums[i]) {
                int tmp;
                tmp = nums[nums[i]-1];
                nums[nums[i]-1] = nums[i];
                nums[i] = tmp;
                i--;
            }
        }
        
        for(i=0; i<N; i++) {
            if(nums[i]!=i+1) return i+1;
        }
        return nums.length+1;
    }
}
