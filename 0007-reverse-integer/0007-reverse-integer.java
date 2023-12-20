class Solution {
    public int reverse(int x) {
        int n = Math.abs(x);
        int maxDiv10 = Integer.MAX_VALUE / 10;
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;

            // Check for overflow before updating the sum
            if (sum > maxDiv10 || (sum == maxDiv10 && digit > 7)) {
                return 0; // Overflow will occur
            }

            sum = sum * 10 + digit;
            n /= 10;
        }

        return (x < 0) ? -sum : sum;
    }
}
