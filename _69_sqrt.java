class _69_sqrt {
    public int mySqrt(int n) {
            // code here
        int low = 1 , high = n ,mid ;
        while(low<=high) {
            mid = low +(high - low) / 2;
            if(mid ==n/mid)return mid;
            else if(mid>n/mid)high = mid -1;
            else low = mid +1;
        }
        return high;
    }
}
