class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int length = nums.length;
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < length; i++) {
		    int val = Math.abs(nums[i]) - 1;
			if (nums[val] > 0) {
			    nums[val] = -nums[val];
			}
            else {
			    list.add(Math.abs(nums[i]));
			    }
		}			
		return list;
        
    }
}
