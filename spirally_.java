class Solution {
    public ArrayList<Integer> spirallyTraverse(int[][] arr) {
        // code here
        ArrayList<Integer> ans = new Arraylist<>();
        int n = arr.length;
        int m = arr[0].length;
        int minr = 0 ;
        int maxr = n-1 ;
        int minc =0 ;
        int maxc = m-1 ;
        int totalele= m* n;
        int count = 0;
        int[] ans = new int[n*m];
        while(count<=totalele) {
            for(int j=minc;j<=maxc;j++){
                ans = arr[minr][j];
                count++;
            }
            min++;
            
            
            
            for(int i=minr;i<=max;i++){
               ans= arr[i][maxc];
               count++;
            }
            maxc--;
            
            for(int j=maxc;j>=minc;j--) {
                ans = arr[maxr][j];
                count++;
            }
            maxr--;
            for(int i=max;i>=minr;i--){
               ans = arr[i][minc];
               count++;
            }
            minc++;
            
            
        }
        return ans;
        
    }
}
