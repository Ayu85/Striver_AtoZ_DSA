public class lowerBoundBetterApproach {
    static int getLower(int[] arr, int low, int high, int target) {
        int ans = high + 1;
        if (low > high)
            return ans;
        int mid = (low + high) / 2;
        if (arr[mid] >= target) {
            ans = mid;
            return getLower(arr, low, mid - 1, target);
        } else {
            return getLower(arr, mid + 1, high, target);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 3, 5, 8, 8, 10, 10, 11 };
        System.out.println(getLower(arr, 0, arr.length - 1, 1));
    }
}
