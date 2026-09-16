class Solution {
    public int arraySign(int[] arr) {
        int pro = 1;
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==0) return 0;
            else if(arr[i]>0) pro = 1*pro;
            else pro = -1*pro;
        }
        return pro;
        
    }
}