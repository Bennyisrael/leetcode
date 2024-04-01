class Solution {
    public String firstPalindrome(String[] words) {
        for(String s : words){
            StringBuilder str = new StringBuilder(s);
            str.reverse();
            if(s.equals(str.toString())){
                return s;
            }
        }
        return "";
    }
}