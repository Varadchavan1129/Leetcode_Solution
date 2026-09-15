class Solution {
    public int[] numberGame(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int i = 0;
        int j = 1;
        while(i < n  ){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;

            i+= 2;
        }
      return arr;
        
    }
}