/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ArrayList<Integer> arr = new ArrayList<>();
        ListNode temp = head;
        while(temp!=null){
            arr.add(temp.val);
            temp = temp.next;
        }
        int n = arr.size();
        int[] ans = new int[2];
        int max = 0;
        int min =Integer.MAX_VALUE;
        int maxd = -1;
        int mind = Integer.MAX_VALUE;
        ArrayList<Integer> arr1 = new ArrayList<>();
        for(int i=1;i<n-1;i++){
            if(arr.get(i)> arr.get(i-1) && arr.get(i) >arr.get(i+1) || arr.get(i)<arr.get(i-1) && arr.get(i)<arr.get(i+1)){
                    arr1.add(i);
            }
        }
        if(arr1.size() < 2) { 
            ans[0] = -1;
             ans[1] = -1;
            return ans;
             }


      int d = arr1.size();

      for(int i=1;i<d;i++){
        mind = Math.min(mind,(arr1.get(i) - arr1.get(i-1)));
      }

      maxd = arr1.get(arr1.size()-1) - arr1.get(0);
        ans[0] = mind;
        ans[1] = maxd;
      

        return ans;
    }
}