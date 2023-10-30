public class howManyTimesRotated {
    static int getInd(int[] arr, int n) {
        int ans = Integer.MAX_VALUE;
        int ind = 0;
        int low = 0;
        int high = n - 1;
        while (low < high) {
            int mid = (low + high) / 2;
            if (arr[low] <= arr[mid]) {
                if (arr[low] < ans)
                    ind = low;
                low = mid + 1;
            } else {
                if (arr[mid] < ans)
                    ind = mid;
                high = mid - 1;

            }
        }

        return ind;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 7, 1, 2, 3 };
        System.out.println(getInd(arr, arr.length));
    }
}