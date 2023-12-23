class Solution {
    public int mySqrt(int x) {
        if (x <= 1)
            return x;

        double guess = x / 2.0;
        double epsilon = 1e-6;

        while (Math.abs(guess * guess - x) > epsilon) {
            guess = 0.5 * (guess + x / guess);
        }

        return (int) guess;
    }
}
