class Solution {
    public int[] sortedSquares(int[] arr) {
        int n = arr.length;
        for(int i=0;i<n;i++){
            arr[i] *= arr[i];
        }
        Arrays.sort(arr);
        return arr;
    }
}