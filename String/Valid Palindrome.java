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
