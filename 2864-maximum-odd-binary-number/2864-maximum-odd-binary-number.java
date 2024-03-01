class Solution {
    public String maximumOddBinaryNumber(String s) {
        char ch[]=s.toCharArray();
        int c1=0,c2=0;
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='1')
                c1++;
            else
                c2++;
        }
        int j=0;
        for(int i=0;i<c1-1;i++){
            ch[j]='1';
            j++;
        }
        for(int i=0;i<=c2;i++){
            ch[j]='0';
            j++;
        }
        ch[ch.length-1]='1';
        String str=new String(ch);
        return str;
    }
}