public class Solution {
    public boolean isPerfectSquare(int num) {
        boolean m = false;
        long a=0, b=num, mid;
        while(a<=b) {
            mid = (a+b)/2;
            if(mid*mid>num) b = mid-1;
            if(mid*mid==num) {
                m = true;
                break;
            }
            if(mid*mid<num) a = mid+1;
        }
        return m;
    }
}
