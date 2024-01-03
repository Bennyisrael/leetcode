class Solution {
    public int numberOfBeams(String[] bank) {
        int ans = 0, temp = 0;
        for (String str : bank) {
            int n = countones(str);
            if (n == 0) 
                continue;
            ans += temp * n;
            temp = n;
        }
        return ans;
    }
    private int countones(String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == '1') {
                count++;
            }
        }
        return count;
    }
}
