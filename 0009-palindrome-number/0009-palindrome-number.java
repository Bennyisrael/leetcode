class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
        return false;
        int a=x;
        int sum=0,temp;
        while(x>0){
            temp=x%10;
            sum=sum*10+temp;
            x/=10;
        }
        return sum==a; 
    }
}