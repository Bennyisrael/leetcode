class Solution {
    public int[] countBits(int n) {
        int arr[]=new int [n+1];
        for(int i=0;i<=n;i++){
            arr[i]=countbin(i);
        }
        return arr;
    }
    public int countbin(int number){
        int count = 0;
        while (number > 0) {
            if ((number & 1) == 1) {
                count++;
            }
            number >>= 1;
        }
        return count;
    }
}