public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix==null || matrix.length==0 || matrix[0].length==0) return false;
        int m = 0;
        int n = matrix[0].length-1;
        while(m<matrix.length && n>=0) {
            if(target>matrix[m][n]) m++;
            else if(target<matrix[m][n]) n--;
            else return true;
        }
        return false;
    }
}
