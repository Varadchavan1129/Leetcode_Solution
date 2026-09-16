class Solution {
    public boolean canAliceWin(int[] arr) {
        int n = arr.length;
        int sum = 0;
        int sum1 = 0;
        for(int i=0;i<n;i++){
            if(arr[i]>9) sum1 += arr[i];
            else sum += arr[i];
        }
        if(sum==sum1) return false;
        else return true;
    }
}