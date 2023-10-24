public class basicProblem {
    static int searchItem(int[] arr, int n, int target) {
        int start = 0;
        int end = n - 1;
        while (start < end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target)
                return mid;
            else if (target < arr[mid]) {
                end = mid - 1;
            } else
                start = mid + 1;
        }
        return -1;

    }
    public static void main(String[] args) {
        
    }
}