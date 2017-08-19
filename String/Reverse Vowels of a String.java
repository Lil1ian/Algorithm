class Solution {
    public String reverseVowels(String s) {
        if(s==null) return "";
        char[] c = s.toCharArray();
        int left = 0;
        int right = c.length-1;
        while(left<right){
            while(left<right&&!isVowel(c[left])){
                ++left;
            }
            while(left<right&&!isVowel(c[right])){
                --right;
            }
            char tmp = c[left];
            c[left] = c[right];
            c[right] = tmp;
            ++left;
            --right;
        }
        return new String(c);
    }
    public boolean isVowel(char c){
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
            return true;
        else
            return false;
    }
}
