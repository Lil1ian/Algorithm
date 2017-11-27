class Solution {
    public int repeatedStringMatch(String A, String B) {
        int a = A.length();
        int b = B.length();
        int i;
        int j;
        for(i = 0; i < a; i++) {
            j = 0;
            while(j < b && A.charAt((i+j) % a)== B.charAt(j)) {
                j++;
            }
            if(j == b) {
                return (i+j-1)/a + 1;
            }
        }
        return -1;
    }
    
}
