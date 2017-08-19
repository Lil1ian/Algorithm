/* The guess API is defined in the parent class GuessGame.
   @param num, your guess
   @return -1 if my number is lower, 1 if my number is higher, otherwise return 0
      int guess(int num); */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int left = 0;
        int right = n;
        int res = 0;
        
        while(left<right) {
            int mid = left + (right-left)/2;
            int m = mid;
            if(guess(m)==0) return m;
            else if(guess(m)==-1) right = m-1;
            else left = m+1;
        }
        return left;
    }
}
