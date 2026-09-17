class Solution {
    public int maximumWealth(int[][] arr) {
        int max = 0;
        int n = arr.length;
        int m = arr[0].length;
        for(int i=0;i<n;i++){
            int tot = 0;
            for(int j=0;j<m;j++){
                tot += arr[i][j];
            }
            max = Math.max(max,tot);
        }
        return max;
        
    }
}