class Solution {
    int[] dr = new int[] {0, 0, 1, -1};
    int[] dc = new int[] {-1, 1, 0, 0};
    int max, m, n;
    public void dfs(int i, int j, int[][] grid, boolean[][] visited, int val) {
        visited[i][j] = true;
        if(val > max) {max = val;}
        for(int k=0;k<4;++k) {
            int r = i + dr[k];
            int c = j + dc[k];

            if(r<0 || c<0 || r>=m || c>=n || visited[r][c] || grid[r][c] == 0)
                continue;
            
            dfs(r, c, grid, visited, val + grid[r][c]);
        }
        visited[i][j] = false;

    }
    public int getMaximumGold(int[][] grid) {
        m = grid.length;
        n = grid[0].length;
        int sum = 0;
        boolean flag = true;
        for(int i=0;i<m;++i) {
            for(int j=0;j<n;++j) {
                if(grid[i][j] == 0) {
                    flag = false;
                    break;
                }
                sum += grid[i][j];
            }
            if(!flag)
                break;
        }

        if(flag)
            return sum;

        boolean[][] visited = new boolean[m][n];

        for(int i=0;i<m;++i) {
            for(int j=0;j<n;++j) {
                if(grid[i][j] > 0) {
                    dfs(i, j, grid, visited, grid[i][j]);
                }
            }
        }

        return max;
    }
}