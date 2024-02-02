class Solution {
    public char findTheDifference(String s, String t) {
        int x=0;
        for(char ch1:s.toCharArray()){
            x^=ch1;
        }
        for(char ch2:t.toCharArray()){
            x^=ch2;
        }
        return (char)x;
    }
}