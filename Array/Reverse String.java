public class Solution {
    public String reverseString(String s) {
        char[] word = s.toCharArray();
        int i = 0;
        int j = s.length()-1;
        while(i<j) {
            char tmp = word[j];
            word[j] = word[i];
            word[i] = tmp;
            i++;
            j--;
        }
        String reverse = new String(word);
        return reverse;
    }
}
