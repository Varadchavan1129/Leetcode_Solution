class Solution {
    public boolean judgeSquareSum(int c) {
        long left = 0;
        long right = (long)Math.sqrt(c);
        while(left<=right){
            long mid = (right+left) / 2;
            if((left*left) + (right*right) == c) return true;
            else if((left*left) + (right*right) > c) right--;
            else left++;
        }
        return false;
    }
}