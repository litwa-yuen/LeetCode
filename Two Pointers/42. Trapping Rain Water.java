class Solution {
    public int trap(int[] height) {
        int start = 0;
        int end = height.length - 1;
        int maxLeft = height[start];
        int maxRight = height[end];
        int sum = 0;
        while (start < end ) {
            if (maxLeft < maxRight) {
                start++;
                maxLeft = Math.max(maxLeft, height[start]);
                sum += maxLeft - height[start];
            }
            else {
                end--;
                maxRight = Math.max(maxRight, height[end]);
                sum += maxRight - height[end];
            }
        }
        return sum;
    
    }
}
