class Solution {
    public int minDifficulty(int[] jobDifficulty, int d) {
         int n = jobDifficulty.length;
        if (n < d) {
            return -1;
        }
        int[][] dp = new int[n + 1][d + 1];
        int maxDifficulty = 1000 * 1000 + 1;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= d; j++) {
                dp[i][j] = maxDifficulty;
            }
        }
        dp[0][0] = 0;
        for (int day = 1; day <= d; day++) {
            for (int job = 1; job <= n; job++) {
                int maxDifficultyOnDay = 0;
                for (int prevJob = job; prevJob >= 1; prevJob--) {
                    maxDifficultyOnDay = Math.max(maxDifficultyOnDay, jobDifficulty[prevJob - 1]);
                    dp[job][day] = Math.min(dp[job][day], dp[prevJob - 1][day - 1] + maxDifficultyOnDay);
                }
            }
        }

        return dp[n][d];
    }
    }
