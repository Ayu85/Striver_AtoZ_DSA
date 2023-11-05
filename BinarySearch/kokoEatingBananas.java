public class kokoEatingBananas {
    static int getHours(int[] piles, int h, int n) {
        for (int i = 1; i <= h; i++) {
            int ans = 0;
            int hours = i;
            for (int j = 0; j < n; j++) {
                ans += Math.ceil(piles[j] / hours);
            }
            if (ans == h)
                return hours;
        }
        return -1;
    }
    
}
