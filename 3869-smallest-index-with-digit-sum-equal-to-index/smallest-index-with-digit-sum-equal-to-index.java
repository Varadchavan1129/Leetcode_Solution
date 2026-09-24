class Solution {
    public int smallestIndex(int[] arr) {
        int n = arr.length;
        //if(arr[0]==0) return 0;
        for(int i=0;i<n;i++){
            if(arr[i]<10){
                if(arr[i]==i) return i;
            }
            else{
                int t = arr[i];
                int sum = 0;
                while(t>0){
                    int rem = t % 10;
                        sum += rem;
                     t /= 10;   
                }
                if(sum == i ) return i;
            }
        }
        return -1;
    }
}