class Solution {
    int n = 2;
    public int sum(int num1, int num2) {
        int[] A = new int[] {-1, num1, num2};
        int [][] maxTable = new int[n+1][(int) (Math.log(n)/Math.log(2))+1];
        int [][] minTable = new int[n+1][(int) (Math.log(n)/Math.log(2))+1];
        for (int i = 1; i <= n; i++) {
            maxTable[i][0] = A[i];
            minTable[i][0] = A[i];
        }
        for (int i = 1; 1<<i <= n; i++) {
            for (int j = 1; j+(1<<i)-1 <= n; j++) {
                maxTable[j][i] = Math.max(maxTable[j][i-1], maxTable[j+(1<<(i-1))][i-1]);
                minTable[j][i] = Math.min(minTable[j][i-1], minTable[j+(1<<(i-1))][i-1]);
            }
        }
        return minQuery(1, n, minTable) + maxQuery(1, n, maxTable); // interval max + interval min = nums1 + nums2
    }
    public int maxQuery(int l, int r, int [][] table) {
        int j = (int) (Math.log(r-l+1)/Math.log(2));
        return Math.max(table[l][j], table[r-(1<<j)+1][j]);
    }
    public int minQuery(int l, int r, int [][] table) {
        int j = (int) (Math.log(r-l+1)/Math.log(2));
        return Math.min(table[l][j], table[r-(1<<j)+1][j]);
    }
}