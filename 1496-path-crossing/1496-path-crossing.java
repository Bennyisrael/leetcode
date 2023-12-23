class Solution {
    public boolean isPathCrossing(String path) {
        int n=path.length();
        int x=0,y=0;
        for(int i=0;i<n;i++){
            int a=x,b=y;
            for(int j=i;j<n;j++){
                char ch=path.charAt(j);
                if(ch=='N')
                    y++;
                else if(ch=='S')
                    y--;
                else if(ch=='E')
                    x++;
                else if(ch=='W')
                    x--;
                if(x==a && y==b)
                    return true;
            }
        }
        return false;
    }
}