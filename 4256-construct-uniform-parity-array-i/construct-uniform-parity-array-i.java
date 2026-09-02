class Solution {
    public boolean uniformArray(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++)
            {
                ans[i]= arr[i] - ans[j];
                ans[i] = arr[i];
                if(ans[i]%2==0 || ans[i]%2!=0)
                {
                    return true;
                }

            }
        }
        return false;
    }
}