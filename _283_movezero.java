public class _283_movezero {
    public static void main(String[] args) {
         int[] arr = {2,0,4,3,0,5,7}; 
         int n =arr.length;
         print(arr);
         System.out.println();
         int j=0;
         for(int i=0;i<n;i++) {
             if(arr[i]!=0){
                 if(i!=j){
                     int temp = arr[i];
                     arr [i] = arr[j];
                     arr[j]= temp;
                 }
                 j++;
             }
         }

         print(arr);
    }


    public static void print(int[] arr) {
        for(int ele:arr){
             System.out.print(ele+" ");
        }
    }
}
    