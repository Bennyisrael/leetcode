class Solution {
    public String reversePrefix(String words, char ch) {
        char arr []=words.toCharArray();
        int a=0,b=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==ch){
                b=i;
                while(a<b){
                    char temp=arr[b];
                    arr[b]=arr[a];
                    arr[a]=temp;
                    a++;
                    b--;
                }
                break;
            }
        }
        return new String(arr);
    }
}