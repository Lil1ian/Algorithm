class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int length = nums.length;
        int[] hash = new int[length];
        
        List<Integer> result = new ArrayList<Integer>();
        for(int i = 0; i < length;i++){
            hash[nums[i] - 1]++;
        }
        for(int i = 0; i < length;i++){
            if(hash[i] == 0){
                result.add(i + 1);
            }
        }
        return result;
        
    }
}
