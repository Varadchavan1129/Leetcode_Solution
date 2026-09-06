class Solution {
    private static final int MAX_BASE = 31622;

    public int maximumLength(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int n : nums)
            freq.merge(n, 1, Integer::sum);

        int one = freq.getOrDefault(1, 0);
        int res = (one - 1) | 1;
        freq.remove(1);

        for (int f : freq.keySet()) {
            int sq = (int) Math.sqrt(f);
            if (sq * sq == f && freq.getOrDefault(sq, 0) > 1)
                continue;

            int n = 0, x = f;

            while (x < 31623 && freq.containsKey(x) && freq.get(x) > 1) {
                n += 2;
                x *= x;
            }

            res = Math.max(res, n + (freq.containsKey(x) ? 1 : -1));
        }

        return res;
    }
}
