class Solution {
    public char repeatedCharacter(String s) {
        Set<Character> ch = new HashSet<>();
        for(int i=0;i<s.length();i++){
            if(!ch.add(s.charAt(i)))
                return s.charAt(i);
        }
        return 'b';
    }
}