class Solution {
    public String truncateSentence(String s, int k) {
        String str[]=s.split("\\s+");
        String st="";
        for(int i=0;i<k;i++){
            st+=str[i]+" ";
        }
        return st.trim();
    }
}