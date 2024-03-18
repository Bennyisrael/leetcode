class Solution {
    public void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public void swap(String[] arrr, int index1, int index2) {
        String temp = arrr[index1];
        arrr[index1] = arrr[index2];
        arrr[index2] = temp;
    }

    public String[] sortPeople(String[] names, int[] heights) {
        for (int i = 0; i < heights.length-1; i++) {
            if (heights[i + 1] > heights[i]) {
                swap(heights, i + 1, i);
                swap(names, i + 1, i);
            }
        }
        return names;
    }
}
