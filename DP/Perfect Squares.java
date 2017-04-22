public class Solution {
    public int numSquares(int n) {
        int[] sq = new int[n+1];
        Arrays.fill(sq, Integer.MAX_VALUE);
        for(int i=0; i*i <= n; i++) {
            sq[i*i] = 1;
        }
        
        for(int a=0; a <= n; a++) {
            for(int b=0; a+b*b <= n; b++) {
                sq[a+b*b] = Math.min(sq[a] + 1, sq[a+b*b]);
            }
        }
        return sq[n];
    }
}
