public class Solution {
    public String reverseWords(String sentence) {
        String[] words = sentence.trim().split("\\s+");
                StringBuilder reversedSentence = new StringBuilder();
                for (int i = words.length - 1; i >= 0; i--) {
            reversedSentence.append(words[i]);
            if (i > 0) {
                reversedSentence.append(" ");
            }
        }
        return reversedSentence.toString();
    }}