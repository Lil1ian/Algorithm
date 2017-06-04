public class Solution {
    public int[] moveZeroes(int[] nums) {
        int N = nums.length;
        int j;
        for(int i=0; i<N; i++) {
            if(nums[i]==0) {
                if(i!=N-1) j = i+1;
                else continue;
                while(j<N-1 && nums[j]==0) {
                    j++;
                }
                if(nums[j]!=0) swap(nums, i, j);
                else break;
            }
        }
        return nums;
    }
    
    public static void swap(int[] array, int a, int b) {
        int tmp;
        tmp = array[b];
        array[b] = array[a];
        array[a] = tmp;
    }
}
