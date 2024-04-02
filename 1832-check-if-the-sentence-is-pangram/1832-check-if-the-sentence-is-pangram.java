class Solution {
    public boolean checkIfPangram(String sentence) {
        String alp ="qwertyuiopasdfghjklzxcvbnm";
        for(int i=0;i<alp.length();i++){
            if(sentence.indexOf(alp.charAt(i))== -1){
                return false;
            }
            // else{
            //     return true;
            // }
        }
        return true;
    }
}