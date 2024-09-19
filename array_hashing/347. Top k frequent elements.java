class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap();
        int[] result = new int [k];
        for (int num : nums) {
            int count = map.getOrDefault(num, 0);
            map.put(num, ++count);
        }

        PriorityQueue<Integer> pq = new PriorityQueue((a,b) -> {
            return map.get(a) - map.get(b);
        });
        
        for (int key : map.keySet()) {
            pq.add(key);
            if (pq.size() > k) {
                pq.remove();
            }
        }

        for (int i =0; i < k; i++) {
            result[i] = pq.remove();
        }
        return result;
    }
}
