class Solution {
    public int divide(int a, int b) {
        if (a == Integer.MIN_VALUE && b == -1) {
            return Integer.MAX_VALUE;
        }
        if((int)(a/b)>Integer.MAX_VALUE-1)
         return Integer.MAX_VALUE;
        if((int)(a/b)<Integer.MIN_VALUE)
        return Integer.MIN_VALUE;

        return (int)(a/b);
    }
}