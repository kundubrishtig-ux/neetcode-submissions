class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int left = 1;
        int right = 0;

        for (int pile : piles) {
            right = Math.max(right, pile);
        }

        while (left < right) {

            int speed = left + (right - left) / 2;
            long totalTime = 0;

            for (int pile : piles) {
                totalTime += (pile + speed - 1) / speed;
            }

            if (totalTime <= h) {
                right = speed;
            } else {
                left = speed + 1;
            }
        }

        return left;
    }
}