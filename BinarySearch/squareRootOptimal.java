public class squareRootOptimal {
    static int getRoot(int n, int low, int high) {
        int ans = 0;
        while (low <= high) {
            int mid = (low + high) / 2;
            if ((mid * mid) <= n) {
                ans = mid;
                low = mid+1;
            } else if (mid * mid > n)
                high = mid-1;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(getRoot(25, 0, 25));
    }
}
