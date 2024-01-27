class Solution {
    public int sq(int n){
        int s=0,temp;
        while(n>0){
            temp=n%10;
            s+=Math.pow(temp,2);
            n/=10;
        }
        return s;
    }
    public boolean isHappy(int n) {
        int a=n,b=n;
        do{
            a=sq(a);
            b=sq(sq(b));
        }while(a!=b);

        return a==1;
    }
}