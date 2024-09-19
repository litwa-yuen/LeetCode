class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet();
        for (int num : nums) {
            set.add(num);
        }
        int result = 0;
        for (int num : nums) {
            if (!set.contains(num-1)) {
                int current = num+1;
                int count = 1;
                while (set.contains(current++)){
                    count++;
                }
                result = Math.max(result, count);
            }
        }
        return result;

    }
}
