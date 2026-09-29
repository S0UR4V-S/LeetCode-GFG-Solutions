class Solution {
    public int longestConsecutive(int[] nums) {
        TreeMap<Integer, Integer> hm = new TreeMap<>();
        int n = nums.length;
        if (n == 0)
            return 0;
        for (int i = 0; i < n; i++) {
            hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
        }

        int temp = -1000000000;
        int count = 1;
        int ans = 1;
        for (TreeMap.Entry<Integer, Integer> e : hm.entrySet()) {
            int key = e.getKey();
            if (temp + 1 == key)
                count++;
            else {
                ans = Math.max(ans, count);
                count = 1;
            }
            temp = key;

        }
        ans = Math.max(ans, count);
        return ans;
    }
}