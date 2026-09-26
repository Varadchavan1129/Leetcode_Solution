class Solution {
    public int findDuplicate(int[] arr) {
        // HashSet<Integer> set = new HashSet<>();
        // for(int x:nums){
        //     if(set.contains(x)) return x;
        //     else set.add(x);
        // }
        // return -1;

        int slow = arr[0];
        int fast = arr[0];
        do{
            slow = arr[slow];
            fast = arr[arr[fast]];
        }while(slow!=fast);

        slow = arr[0];
        while(slow!=fast){
            slow = arr[slow];
            fast = arr[fast];
        }

        return slow;
    }
}