public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int N = nums.length;
        int[] res = new int[2];
        int index1, index0;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0; i<N; i++)
        {
            if(map.containsKey(target-nums[i]))
            {
                res[1] = i;
                res[0] = map.get(target-nums[i]);
                break;
            }
            map.put(nums[i], i);
        }
        return res;
    }
}
