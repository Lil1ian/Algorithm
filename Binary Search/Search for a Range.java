public class Solution {
    public int[] searchRange(int[] nums, int target) {
        int N = nums.length;
        int ll = 0, rl = 0, lr = N-1, rr = N-1, mid, j, k;
        int [] res = {-1, -1};
        if(N==0 || nums == null) return res;
        while(ll<=lr) {
            mid = (ll+lr)/2;
            if(nums[mid]>=target) lr = mid-1;
            else ll = mid+1;
        }
        while(rl<=rr) {
            mid = (rl+rr)/2;
            if(nums[mid]<=target) rl = mid+1;
            else rr = mid-1;
        }
        if(ll<=rr && nums[ll]==target && nums[rr]==target) {
            res[0] = ll;
            res[1] = rr;
        }
        return res;
    }
}
