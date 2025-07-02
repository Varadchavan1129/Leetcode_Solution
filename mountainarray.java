public class mountainarray {
    class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;
        int low =0,high = n-1, mid;
        while(low<=high){
            mid = low + (high-low)/2;
            if(arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1]) return mid;
            else if(arr[mid]>arr[mid+1]) high = mid - 1; 
            else low = mid + 1;
        }
        return 100;
    }
}
}
