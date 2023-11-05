public class kokoEatingBananas_Optimal {
    static int getHours(int[] arr, int h, int n) {
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            float ans = 0;
            for (int x : arr) {
                ans += Math.ceil((double) x / (double) mid);
            }
            if (ans <= h) {
                high = mid - 1;

            } else
                low = mid + 1;
        }
        return low;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 6, 7, 11 };
        System.out.println(getHours(arr, 8, arr.length));
    }
}
