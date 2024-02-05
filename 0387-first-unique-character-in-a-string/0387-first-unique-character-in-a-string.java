class Solution {
    public int firstUniqChar(String s) {
        HashMap <Character,Integer> ch = new HashMap<>();
        for(char ch1 : s.toCharArray()){
            ch.put(ch1,ch.getOrDefault(ch1,0)+1);
        }
        for(int i=0;i<s.length();i++){
            if(ch.get(s.charAt(i))==1)
                return i;
        }
        return -1;
    }
}