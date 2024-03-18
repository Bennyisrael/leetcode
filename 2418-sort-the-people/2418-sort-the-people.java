class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        //int lar=heights[0];
        for(int i=0;i<heights.length;i++){
            for(int f=i+1;f<names.length;f++){
                if(heights[i]<heights[f])
                {
                int lar=heights[i];
                String ch=names[i];
                heights[i]=heights[f];
                names[i]=names[f];
                names[f]=ch;
                heights[f]=lar;
                }
            }
        }
        return names;
    }
}