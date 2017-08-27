class Solution {
    public boolean isScramble(String s1, String s2) {
        if (s1 == null || s2 == null) {
            return false;
        }
        
        int len = s1.length();
        
        if (s2.length() != len) {
            return false;
        }

        boolean[][][] D = new boolean[len][len][len + 1];
        
        
        for (int k = 1; k <= len; k++) {
            
            for (int i = 0; i <= len - k; i++) {
                for (int j = 0; j <= len - k; j++) {
                    if (k == 1) {
                        D[i][j][k] = s1.charAt(i) == s2.charAt(j);
                        continue;
                    }
                    
                    D[i][j][k] = false;
                    for (int l = 1; l <= k - 1; l++) {
                        if (D[i][j][l] && D[i + l][j + l][k - l] 
                            || D[i][j + k - l][l] && D[i + l][j][k - l] ) {
                            D[i][j][k] = true;
                            break;
                        }
                    }
                }
            }
        }
        
        return D[0][0][len];
        
    }
}
