class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int n = arr.length;

        TreeMap<Integer, Integer> hm = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
        }

        TreeMap<Integer, Integer> ma = new TreeMap<>();
        for (TreeMap.Entry<Integer, Integer> e : hm.entrySet()) {

            ma.put(e.getValue(), ma.getOrDefault(e.getValue(), 0) + 1);
            if (ma.get(e.getValue()) != 1)
                return false;
        }

        return true;

    }
}