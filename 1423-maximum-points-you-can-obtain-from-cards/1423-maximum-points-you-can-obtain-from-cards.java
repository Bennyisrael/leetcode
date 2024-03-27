class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n=cardPoints.length;
    //     int max=0;
    //     int i=0,j=n-1,a=0;
    //     while(a<k){
    //         if(cardPoints[i]>cardPoints[j]){
    //             max+=cardPoints[i];
    //             i++;
    //         }
    //         else{
    //             max+=cardPoints[j];
    //             j--;
    //         }
    //         a++;
    //     }
    //     int max1=0,max2=0;
    //     for(int x=0;x<k;x++)
    //         max1+=cardPoints[x];
    //     for(int x=n-1;x>=n-k;x--)
    //         max2+=cardPoints[x];

    //     return Math.max(max,Math.max(max1,max2));
    // 

    int cur=0, minsub=0 , tot=0;
    for(int i=0;i<n;i++){
        tot+=cardPoints[i];
        cur+=cardPoints[i];
        if(i<n-k){
            minsub+=cardPoints[i];
        }
        else{
            cur-=cardPoints[i-(n-k)];
            minsub=Math.min(minsub,cur);
        }
    }
    return tot-minsub;
    }
}