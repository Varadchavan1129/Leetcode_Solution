class Solution {
    public int countDigits(int n) {
        int ans = 0;
        int num = n;
        while(num > 0){
            int d = num % 10;
            if(d == 1) ans++;
            else if(n % d ==0) ans++;
            num /= 10;
        }
        return ans;
    }
}