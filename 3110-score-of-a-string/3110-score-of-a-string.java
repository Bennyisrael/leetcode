class Solution {
    public int scoreOfString(String s) {
        int c=0;
        for(int i=0;i<s.length()-1;i++){
            c=c+Math.abs(s.chatAt(i)-s.charAt(i+1));
        }
        return c;
    }
}