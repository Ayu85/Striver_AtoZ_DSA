public class minInRotetedSortedArray {
    static int getMin(int[] arr, int n) {
        int ans = Integer.MAX_VALUE;
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[low] <= arr[mid])
            // check if the left part is sorted
            {
                if (arr[low] < ans)
                    ans = arr[low];
                low = mid + 1;
            } else {
                // check for the right part is sorted
                if (arr[mid] < ans)
                    ans = arr[mid];
                high = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 6, 7, 8, 0, 1, 2, 3, 4, 5 };
        
        System.out.println(getMin(arr, arr.length));
    }
}
