class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.equals(s2)) return true;
        if (s1.length() > s2.length()) return false;
        int[] letter = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            letter[s1.charAt(i)-'a']++;
            letter[s2.charAt(i)-'a']--;
        }
        if (allZero(letter)) return true;
        
        for (int i = s1.length(); i < s2.length(); i++) {
            letter[s2.charAt(i) - 'a']--;
            letter[s2.charAt(i - s1.length()) - 'a']++;
            if (allZero(letter)) return true;
        }
        return false;
    }

    private boolean allZero(int[] letters) {
        for (int letter : letters) {
            if (letter != 0) return false;
        } 
        return true;
    }
}
