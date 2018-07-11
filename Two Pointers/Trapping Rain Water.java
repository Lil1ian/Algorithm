class Solution {
    public int trap(int[] A) {
        if (A == null || A.length == 0)  
            return 0;  
          
        int i, max, total = 0;
        int left[] = new int[A.length];
        int right[] = new int[A.length];  
  
        left[0] = A[0];
        max = A[0];
        for (i = 1; i < A.length; i++) {  
            left[i] = Math.max(max, A[i]);
            max = Math.max(max, A[i]);
        }  
  
        right[A.length-1] = A[A.length-1];
        max = A[A.length-1];
        for (i = A.length-2; i >= 0; i--) {  
            right[i] = Math.max(max, A[i]);
            max = Math.max(max, A[i]);
        }  
 
        for (i = 1; i < A.length-1; i++) {  
            int bit = Math.min(left[i], right[i]) - A[i];  
            if (bit > 0)  
                total += bit;  
        }  
  
        return total;  
        
    }
}
