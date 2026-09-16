class Solution {
    public String triangleType(int[] arr) {
        Arrays.sort(arr);
        Set<Integer> set = new HashSet<>();
        for(int num : arr) set.add(num);
        if(arr[0]+arr[1] <= arr[2]) return "none";
        if(set.size() == 1) return "equilateral";
        if(set.size()==2) return  "isosceles";
        return "scalene";
        
    }
}