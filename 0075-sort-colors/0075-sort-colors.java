class Solution {
    public void sortColors(int[] num) {
        int c0=0,c1=0,c2=0;
        for(int i=0;i<num.length;i++){
            if(num[i]==0)
                c0++;
            else if(num[i]==1)
                c1++;
            else
                c2++;
        }
        for(int i=0;i<num.length;i++){
            if(i<c0)
                num[i]=0;
            else if(i<c0+c1)
                num[i]=1;
            else
                num[i]=2;
        }
    }
}