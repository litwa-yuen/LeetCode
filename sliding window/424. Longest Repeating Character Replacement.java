class Solution {
    public int characterReplacement(String s, int k) {
        if (s.length() <= k) return s.length();
        int max = 0;
        int start = 0;
        int[] letters = new int[26];
        int maxFreq = 0;
        for (int end = 0; end < s.length(); end++) {
            maxFreq = Math.max(maxFreq, ++letters[s.charAt(end)-'A']);
            if ( end - start + 1 - maxFreq > k) {
                letters[s.charAt(start++)-'A']--;
            }
            max = Math.max(max, end-start+1);
        }

        return max;
    }
}
