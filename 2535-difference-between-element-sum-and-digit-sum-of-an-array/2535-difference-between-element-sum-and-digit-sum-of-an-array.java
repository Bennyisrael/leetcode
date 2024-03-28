class Solution {
    public int differenceOfSum(int[] nums) {
     int sum=0;
     for(int i : nums)
        sum+=i;
    int s=0;
    for(int i : nums){
        if(i<10){
            s+=i;
        }
        else{
            s+=dig(i);
        }
    }
    return sum-s;   
    }
    public int dig(int n){
        int sum=0;
        while(n>0){
            int temp=n%10;
            sum+=temp;
            n/=10;
        }
        return sum;
    }
}