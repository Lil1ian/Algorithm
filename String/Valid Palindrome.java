public class Solution {
    public static boolean isPalindrome(String s){
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        if(s==null||s.length()==0) return true;
        int n = s.length()-1;
        for(int i = 0; i <= n/2 ; i++){
            if(s.charAt(i) != s.charAt(n- i)) return false;
        }
 
        return true;
    }
}

/* another solution*/


class Solution {
    
    public boolean isPalindrome(String s) {
        
        if(s.equals("")) return true;
        s = s.toLowerCase();
        int len = s.length();
        int left = 0, right = len - 1;
        while(left < right){
            while(!isValid(s.charAt(left))){
                left++;
                if(left >= right) return true;
            } 
            while(!isValid(s.charAt(right))){
                right--;
                if(left >= right) return true;
            }
            if(s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
    public boolean isValid(char c) {
            if(c >= 'a' && c <= 'z') return true;
            if(c >= '0' && c <= '9') return true;
            return false;
    }
}
