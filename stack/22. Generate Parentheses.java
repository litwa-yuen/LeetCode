class Solution {
    List<String> result;
    public List<String> generateParenthesis(int n) {
        result = new ArrayList();
        backtracking(0,0,n, "");
        return result;
    }

    public void backtracking(int open, int close, int n, String s)  {
        if (open == close && open == n) {
            result.add(s);
            return;
        }
        else {
            if (open < n) {
                backtracking(open+1, close, n, s+"(");
            }
            if (close < open) {
                backtracking(open, close+1, n, s+")");
            }
        }   
    }
}
