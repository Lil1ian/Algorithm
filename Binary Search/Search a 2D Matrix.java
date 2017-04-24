public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix==null || matrix.length==0 || matrix[0].length==0) return false;
    
        if(target>matrix[matrix.length-1][matrix[0].length-1]) return false;
        
        int up=0, down=matrix.length-1, mid;
        while(up<=down) {
            mid = up + (down-up)/2;
            if(target<matrix[mid][0]) down=mid-1;
            else if(target==matrix[mid][0]) return true;
            else up=mid+1;
        }
        
        if(down>=0) {
            int l=0, r=matrix[0].length-1;
            while(l<=r) {
                mid = l + (r-l)/2;
                if(target<matrix[down][mid]) r = mid-1;
                else if(target>matrix[down][mid]) l = mid+1;
                else return true;
            }
        }
        
        return false;
    }
}
