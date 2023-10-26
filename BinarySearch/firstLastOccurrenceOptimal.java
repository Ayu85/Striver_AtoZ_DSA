public class firstLastOccurrenceOptimal {
    static int getFirstOccurrance(int[] arr, int n, int x) {
        int low = 0;
        int high = n - 1;
        int first = -1;

        // to find the first occurrence
        while (low < high) {
            int mid = (low + high) / 2;
            if (arr[mid] == x) {
                first = mid;
                high = mid - 1;
            } else if (arr[mid] < x)
                low = mid + 1;

        }
        // to find the last occurrence

        return first;
    }

    static int getlastOccurrence(int[] arr, int n, int x) {
        int low = 0;
        int high = n - 1;
        int last = -1;
        while (low < high) {
            int mid = (low + high) / 2;
            if (arr[mid] == x) {
                last = mid;
                low = mid + 1;
            } else if (arr[mid] > x)
                high = mid - 1;

        }
        return last;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 8, 8, 8, 8, 8, 11, 13 };
        System.out.println(getFirstOccurrance(arr, arr.length, 8));
        System.out.println(getlastOccurrence(arr, arr.length, 8));
    }
}
