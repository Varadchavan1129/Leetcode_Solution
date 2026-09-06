class Solution {
    public int[] pathExistenceQueries(int n, int[] nums, int maxDiff, int[][] queries) {
        int[][] newNums = new int[n][2];
        for (int i = 0; i < n; i++) newNums[i] = new int[]{nums[i], i};
        Arrays.sort(newNums, (a, b) -> a[0] - b[0]);

        int[] getI = new int[n];
        for (int i = 0; i < n; i++) getI[newNums[i][1]] = i;

        int[][] st = new int[n][18];
        int r = 0;
        for (int i = 0; i < n; i++) {
            if (r < i) r = i;
            while (r + 1 < n &&
                   newNums[r + 1][0] - newNums[r][0] <= maxDiff &&
                   newNums[r + 1][0] - newNums[i][0] <= maxDiff)
                r++;
            st[i][0] = r;
        }

        for (int j = 1; j < 18; j++)
            for (int i = 0; i < n; i++)
                st[i][j] = st[st[i][j - 1]][j - 1];

        int[] ans = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int a = getI[queries[i][0]], b = getI[queries[i][1]];
            if (a > b) { int t = a; a = b; b = t; }
            if (a == b) { ans[i] = 0; continue; }

            int curr = a, steps = 0;
            for (int j = 17; j >= 0; j--)
                if (st[curr][j] < b) { curr = st[curr][j]; steps += (1 << j); }

            ans[i] = (st[curr][0] >= b) ? steps + 1 : -1;
        }
        return ans;
    }
}
