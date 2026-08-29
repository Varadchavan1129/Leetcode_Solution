class Solution {
    public int[] lexicographicallySmallestArray(int[] A, int limit) {
        int[] srt = A.clone();
        Arrays.sort(srt);
        List<List<Integer>> grps = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        int id = -1;

        for (int i = 0; i < srt.length; i++) {
            if (i == 0 || srt[i] - srt[i - 1] > limit) {
                grps.add(new ArrayList<>());
                id++;
            }
            
            grps.get(id).add(srt[i]);
            map.put(srt[i], id);
        }

        int[] idx = new int[grps.size()];

        for (int i = 0; i < A.length; i++) {
            int cur = map.get(A[i]);
            A[i] = grps.get(cur).get(idx[cur]);
            idx[cur]++;
        }

        return A;
    }
}