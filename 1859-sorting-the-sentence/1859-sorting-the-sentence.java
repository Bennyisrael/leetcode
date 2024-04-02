class Solution {
    public String sortSentence(String s) {
        String[] words = s.split("\\s+");
        String[] sortedWords = new String[words.length];
        for (String word : words) {
            int index = word.charAt(word.length() - 1) - '1';
            sortedWords[index] = word.substring(0, word.length() - 1);
        }
        StringBuilder sortedSentence = new StringBuilder();
        for (String word : sortedWords) {
            sortedSentence.append(word).append(" ");
        }
        return sortedSentence.toString().trim();
    }
}
