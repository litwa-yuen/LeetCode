public class Solution {
    public String countAndSay(int n) {
        String result = "1";
        for(int i = 1; i < n; i++) {
            result = helper(result);
        }
        return result;
    }
    
    public String helper(String s) {
        StringBuilder result = new StringBuilder();
        char c = s.charAt(0);
        int count = 1;
        for(int i = 1; i < s.length(); i++) {
            if(s.charAt(i) == c) {
                count++;
            }
            else {
                result.append(count).append(c);
                count = 1;
                c = s.charAt(i);
            }
        }
        result.append(count).append(c);
        return result.toString();
    }
}
