class Solution {
    public int countCommas(int n) {
        int cnt = 0;
        int p = 1000;
        while(p <= n){
            cnt += n - p + 1;
            p *= 1000;
        }
        // int cnt = 0;
        // while(n>0){
        //     cnt++;
        //     n /= 10;
        // }
        // if(cnt <=3) return 0;
        return cnt;

    }
}