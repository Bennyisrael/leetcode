class Solution {
    public String reverseWords(String s) {
        StringBuilder str = new StringBuilder ();
        String st[] = s.split("\\s+");
        for(
            String a : st
        ){
            StringBuilder rev = new StringBuilder ();
            rev.append(a).reverse();
            str.append(rev).append(" ");
        }
        return str.toString().trim();
    }
}