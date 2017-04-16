public class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        else if(x==0) return true;
        else {
            int dev = 1;
            while(x/dev>=10) {
                dev = dev*10;
            }
            
            while(x!=0) {
                int right = x%10;
                int left = x/dev;
                
                if(left!=right) return false;
                x = (x%dev)/10;
                dev = dev/100;
            }
        }
        return true;
    }
}
