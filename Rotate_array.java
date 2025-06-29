// package ARRAY;

public class Rotate_array {
    public static void main(String[] args) {
      int [] arr = {1,2,3,4,5,6,7};             // {5,6,7,1,2,3,4}
      int n = arr.length;
      int k = 3;
      k %= n;
      reverse(0,n-1-k,arr);
      reverse(n-k,n-1,arr);
      reverse(0,n-1,arr);
      for(int ele:arr){
        System.out.print(ele+" ");
      }

}

static void reverse(int i,int j,int[] arr) {
    while(i<j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        i++;
        j--;
    }
}
    
}
