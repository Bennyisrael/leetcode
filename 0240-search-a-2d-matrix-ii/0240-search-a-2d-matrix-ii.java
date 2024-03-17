class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length;
        int m=matrix[0].length;
        int j=0,i=n-1;
        while(i>=0 && j<m-1){
            if(matrix[i][j]==target)
                return true;
            if(matrix[i][j]<target)
                j++;
            else
                i--;

        }
        return false;
    }
}