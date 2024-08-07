class Solution {
    public int countSeniors(String[] details) {
        int c=0;
        List<Integer> arr = new ArrayList<>();
        for(int i=0;i<details.length;i++){
            arr.add(Integer.valueOf(details[i].substring(11,13)));
        }
        for(int i : arr){
            if(i>60){
                c++;
            }
        }
        return c;
    }
}