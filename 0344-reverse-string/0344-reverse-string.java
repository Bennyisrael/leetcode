class Solution {
    public void reverseString(char[] chars) {
        int i=0,j=chars.length-1;
        while(i<j){
            char temp=chars[i];
            chars[i]=chars[j];
            chars[j]=temp;
            i++;
            j--;
        }
    }
}