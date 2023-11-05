public class kokoEatingBananas {
    static int getHours(int[] piles, int h, int n) {
        for (int i = 1; i <= h; i++) {
            float ans = 0;
            float hours = i;
            for (int j = 0; j < n; j++) {
                ans += Math.ceil(piles[j] / hours);
                if (ans > h)
                    break;
            }
            if (ans == h)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 6, 7, 11 };
        System.out.println(getHours(arr, 8, arr.length));
    }

}
