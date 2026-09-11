class Solution {
    public int totalNumbers(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int x : arr) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        int ans = 0;

        for (int i = 100; i <= 998; i += 2) {
            int num = i;
            HashMap<Integer, Integer> temp = new HashMap<>(map);
            boolean valid = true;

            while (num > 0) {
                int d = num % 10;

                if (temp.getOrDefault(d, 0) == 0) {
                    valid = false;
                    break;
                }

                temp.put(d, temp.get(d) - 1);
                num /= 10;
            }

            if (valid) {
                ans++;
            }
        }

        return ans;
    }
}