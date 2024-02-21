class Solution {
    public double myPow(double x, int n) {
        double result = 1.0;
        if (n == 0)
            return 1.0;
        if (n < 0) {
            x = 1 / x;
            if (n == Integer.MIN_VALUE) {
                result *= x;
                n++;
            }
            n = -n;
        }
        while (n > 0) {
            if (n % 2 == 1)
                result *= x;
            x *= x;
            n /= 2;
        }
        return result;
    }
}