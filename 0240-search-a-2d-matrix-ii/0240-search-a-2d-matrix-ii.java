class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length, cols = matrix[0].length;
        int j = 0, i = rows - 1;
        while(i >= 0 && j < cols)
        {
            if(matrix[i][j] == target)
                return true;
            if(matrix[i][j] < target)
                j++;
            else
                i--;
        }
        return false;
    }
}