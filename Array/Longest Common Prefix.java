public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0) return "";
        if(strs.length==1) return strs[0];
        StringBuilder res = new StringBuilder();
        int minLen = strs[0].length();
        int N = strs.length;
        boolean m;
        int i;
        for(i=0; i<strs.length; i++) {
            if(strs[i].length()<=minLen) minLen = strs[i].length();
        }
        String pre = strs[0];
        for(int j=0; j<minLen; j++) {
            char a = pre.charAt(j);
            for(int k=0; k<N; k++) {
                if(strs[k].charAt(j)==a) m  = true;
                else m = false;
                if(m==false) return res.toString();
                if(m==true && k==N-1) res.append(strs[k].charAt(j));
            }
        }
        return res.toString();
    }
}
