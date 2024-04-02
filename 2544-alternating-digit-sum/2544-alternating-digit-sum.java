class Solution {
    public int alternateDigitSum(int n) {
        int m=(()int)Math.log10(n)+1) % 2 ==0 ? -1 : 1;
        int s = 0; 
        while(n!=0){
            int temp=n%10 * m;
            s+=temp;
            n/=10;
            m*=-1;
        } 
        return s;
    }
}