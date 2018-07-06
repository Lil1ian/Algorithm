class Solution {
    public int[] plusOne(int[] digits) {
        
        for(int i = digits.length-1; i >= 0; i--) {
            
            digits[i] =1+digits[i];
            if(digits[i]==10) {
                digits[i]=0;
            }
            else {
                return digits;
            }
        }
        
        int[] res = new int[digits.length+1];
        res[0]=1;
        for(int i = 1;i < res.length; i++){
            res[i] = digits[i-1];
        }
        return res;
    }
    
}
