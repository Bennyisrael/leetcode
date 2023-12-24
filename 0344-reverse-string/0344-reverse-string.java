class Solution {
    public void reverseString(char[] chars) {
        StringBuilder reversed = new StringBuilder(new String(chars)).reverse();
        char[] reversedChars = reversed.toString().toCharArray();
        System.arraycopy(reversedChars, 0, chars, 0, reversedChars.length);
    }
}