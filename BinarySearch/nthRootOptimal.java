public class nthRootOptimal {
    static int getRoot(int n, int m) {
        int low = 0;
        int high = m - 1;
        while (low <= high) {

            int mid = (low + high) / 2;
            if (Math.pow(mid, n) == m)
                return mid;
            else if (Math.pow(mid, n) > m)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(getRoot(4, 256));
    }
}
