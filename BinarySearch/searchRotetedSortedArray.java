public class searchRotatedSortedArray {
    static int getELement(int[] arr, int n, int target) {
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target)
                return mid;
            // check for the sorted part(left part)
            else if (arr[low] <= arr[mid]) {
                if (target <= arr[low] && target <= arr[mid])
                    high = mid - 1;
                else
                    low = mid + 1;
            }
            // check sorted right part
            else {
                if (target >= arr[mid] && target <= arr[high])
                    low = mid + 1;
                else
                    high = mid - 1;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 7, 8, 9, 1, 2, 3, 4, 5, 6 };
        System.out.println(getELement(arr, arr.length, 2));
    }
}