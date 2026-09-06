class Solution {
    static int V, D;

    public int countCompleteComponents(int n, int[][] edges) {
        List<Integer>[] A = new ArrayList[n];
        Arrays.setAll(A, _ -> new ArrayList<>());

        for (int[] e : edges) {
            A[e[0]].add(e[1]);
            A[e[1]].add(e[0]);
        }

        boolean[] vis = new boolean[n];
        int res = 0;

        for (int i = 0; i < n; i++) {
            boolean state = vis[i];

            if (!state) {
                V = 0; D = 0;

                dfs(i, A, vis);

                if (D == V * (V - 1)) res++;
            }
        }

        return res;
    }

    private void dfs(int x, List<Integer>[] A, boolean[] vis) {
        V++;
        D += A[x].size();
        vis[x] = true;

        for (int state : A[x])
            if (!vis[state])
                dfs(state, A, vis);
    }
}
