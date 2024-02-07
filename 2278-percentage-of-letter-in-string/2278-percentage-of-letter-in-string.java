class Solution {
    public int percentageLetter(String s, char letter) {
        Map<Character,Integer> arr = new HashMap<>();
        int per=0;
        for(char ch :s.toCharArray()){
            arr.put(ch,arr.getOrDefault(ch,0)+1);
        }
        for(Map.Entry<Character,Integer> entry : arr.entrySet()){
            if(entry.getKey()==letter){
                per=(int)(((double)entry.getValue()/s.length())*100);
            }
        }
        return per;
    }
}