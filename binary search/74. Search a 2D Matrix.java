class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        boolean result = false;
        int rStart = 0;
        int rEnd = matrix.length-1;
        int cStart = 0;
        int cEnd = matrix[0].length-1;
        int rMid = 0;
        while (rStart <= rEnd) {
            rMid = rStart + (rEnd-rStart) / 2;
            if (matrix[rMid][matrix[0].length-1] < target) {
                rStart = rMid+1;
            } else if (matrix[rMid][0] > target) {
                rEnd = rMid-1;
            }
            else {
                break;
            }
        }
        if (rStart > rEnd) return false;
        while (cStart <= cEnd) {
            int cMid = cStart + (cEnd-cStart) / 2;
            if (matrix[rMid][cMid] == target) {
                return true;
            } else if (matrix[rMid][cMid] > target) {
                cEnd = cMid-1;
            }
            else {
                cStart = cMid+1;
            }
        }
        return result;
    }
}
