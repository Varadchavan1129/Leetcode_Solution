class Solution {
    public int minOperations(int[] arr) {
        int n = arr.length;
        int ans = 0;

        for(int i=0;i<=n-3;i++){
            if(arr[i]==0) {
                arr[i] ^= 1;
                arr[i+1] ^= 1;
                arr[i+2] ^= 1;
                ans++;
            }
        }

        if(arr[n-2]==1 && arr[n-1] == 1) return ans;
        return -1; 
    }
}