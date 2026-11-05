class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int ans = 0;
        int n1 = arr1.length;
        int n2 = arr2.length;
        for(int i=0;i<n1;i++){
                // int cnt = n2;
                // for(int j=0;j<n2;j++){
                //     int k = Math.abs(arr1[i]-arr2[j]);
                //     if(k > d) cnt--;
                // }

                boolean flag = true;
                for(int j=0;j<n2;j++){
                    if(Math.abs(arr1[i]-arr2[j]) <= d){
                        flag = false;
                        break;
                    }
                }
                if(flag) ans++;
        } 
        return ans;
    }
}