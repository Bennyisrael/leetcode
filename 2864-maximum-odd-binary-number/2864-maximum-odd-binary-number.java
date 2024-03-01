class Solution {
    public String maximumOddBinaryNumber(String s) {
        int c1 = 0;
        int c0 = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '1') {
                c1++;
            }
            else {
                c0++;
            }
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < c1 - 1; i++) {
            result.append('1');
        }
        for (int i = 0; i < c0; i++) {
            result.append('0');
        }
        result.append('1');
        
        return result.toString();
    }
}