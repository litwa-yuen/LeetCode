class Solution {
    public boolean isAnagram(String s, String t) {
        if (s == null || t == null)
            return false;
        if (s.length() != t.length()) return false;
        int[] aph = new int [26];
        for (char c : s.toCharArray()) {
            aph[c-'a']++;
        }
        for (char c : t.toCharArray()) {
            if(--aph[c-'a'] < 0 ) return false;
        }
        return true;
    }
}
