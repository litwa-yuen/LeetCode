class Solution {
    public int maxArea(int[] height) {
        int result = Integer.MIN_VALUE;
        int start = 0; 
        int end = height.length -1;
        while (start < end) {
            int tempHeight = Math.min(height[start], height[end]);
            int tempWidth =  end - start;
            result = Math.max(result, tempHeight * tempWidth);
            if (height[start] > height[end]) {
                end--;
            }
            else {
                start++;
            }
        }
 
        return result;
    }
}
