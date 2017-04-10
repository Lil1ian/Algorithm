public class Solution {
    public int thirdMax(int[] nums) {
        double a=-3e9, b=-3e9, c=-3e9;
        int N = nums.length;
        int res=0;
        for(int i=0; i<N; i++)
        {
            if(nums[i]>a)
            {
                c = b;
                b = a;
                a = nums[i];
            }
            else if(nums[i]<a && nums[i]>b)
            {
                c = b;
                b = nums[i];
            }
            else if(nums[i]<b && nums[i]>c)
            {
                c = nums[i];
            }
            else continue;
        }
        if(b==-3e9 || c==-3e9) res = (int)a;
        else res = (int)c;
        return res;
    }
}
