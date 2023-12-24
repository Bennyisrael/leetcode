class Solution {
    public String reversePrefix(String words, char ch) {
        String s = words.substring(0,words.indexOf(ch)+1);
        StringBuilder str = new StringBuilder(s);
        str.reverse();
        return str.toString()+words.substring(words.indexOf(ch)+1);
    }
}