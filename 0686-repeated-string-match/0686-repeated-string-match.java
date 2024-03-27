class Solution {
    public int repeatedStringMatch(String a, String b) {
        StringBuilder str = new StringBuilder();
        int c=0;
        while(str.length()<b.length()){
            str.append(a);
            c++;
        }
        if(str.indexOf(b)!=-1)
            return c;
        else{
        str.append(a);
        c++;}
        if(str.indexOf(b)!=-1)
            return c;
        else
        return -1;

        return -1;
    }
}