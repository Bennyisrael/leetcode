class Solution {
    public int lengthOfLastWord(String s) {
        //List<String> str = new ArrayList<>();
        String str[]=s.split(" ");
        return str[str.length-1].length();
    }
}