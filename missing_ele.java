// package ARRAY;

public class missing_ele {
    public static void main(String[] args) {
        int[] arr = {9,6,4,2,3,5,7,0,1};
        int n = arr.length;
        int req_sum = n*(n+1)/2;
        int sum = 0;
        for(int ele:arr) {
            sum += ele;
        }
        System.out.println(req_sum-sum);
    }
    
}
