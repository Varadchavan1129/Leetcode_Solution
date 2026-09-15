class Solution {
    public int addDigits(int num) {

        // while(num>=10){
        //     int tot = 0;
        //     while(num > 0){
        //         int d = num % 10;
        //         tot += d;
        //         num /= 10;
        //     }
        //     num = tot;
        // }
        // return num;

        if(num==0) return 0;
        return 1 + (num - 1) % 9;
    }
}