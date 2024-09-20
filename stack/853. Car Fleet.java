class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        double[] time = new double[target];
        for (int i = 0; i < position.length; i++) {
            time[position[i]] = (double)(target-position[i]) / speed[i];
        }
        int result = 0;
        double pre = 0.0;
        for (int i = target - 1; i>= 0; i--) {
            double cur = time[i];
            if (cur > pre) {
                pre = cur;
                result++;
            }
        }

        return result;
    }
}
