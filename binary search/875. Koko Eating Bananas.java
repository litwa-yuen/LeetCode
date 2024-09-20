class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int maxPile = Integer.MIN_VALUE;
        for (int pile : piles) {
            maxPile = Math.max(maxPile, pile);
        }
        int start = 0;
        while (start <= maxPile) {
            int mid = start + (maxPile-start) / 2;
            if (canEat(piles, h, mid)) maxPile = mid - 1;
            else start = mid + 1;
        }
        return start;
    }

    public boolean canEat(int[] piles, int h, int k) {
        int hour = 0; 
        for (int pile : piles) {
            hour += Math.ceil((double)pile/k);
        }
        return hour <= h;
    }
}
