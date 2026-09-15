class Solution {
    public int differenceOfSum(int[] arr) {
        int elesum = 0;
        int digsum = 0;
        int n = arr.length;
        for(int i=0;i<n;i++){
            elesum += arr[i];
            if(arr[i] >= 10 ){
                int num = arr[i];
                while(num > 0){
                    int d = num % 10;
                    digsum += d;
                    num /= 10;
                }
            }
            else digsum += arr[i];
        }
        return Math.abs(elesum - digsum);
        
    }
}