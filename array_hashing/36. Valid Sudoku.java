class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> set = new HashSet();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] != '.') {
                    if (!set.add(board[i][j] + "row" + i)) return false;
                    if (!set.add(board[i][j] + "col" + j)) return false;
                    if (!set.add(board[i][j] + "("+ i/3 + "," + j/3 + ")")) return false;
                }
            }
        }
        return true;
    }
}
